import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.Producer
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.serialization.StringSerializer
import java.util.*

class SimpleProducer(brokers : String) {

    private val producer = createProducer(brokers)

    private fun createProducer(brokers: String): Producer<String, String> {
        val props = Properties()
        props["bootstrap.servers"] = brokers
        props["key.serializer"] = StringSerializer::class.java.canonicalName
        props["value.serializer"] = StringSerializer::class.java.canonicalName
        return KafkaProducer<String, String>(props)
    }

    fun produce(orderSubmitted: OrderSubmitted) {
        var record = ProducerRecord<String, String>("order-submitted", orderSubmitted.toString())
        val futureResult = producer.send(record)
        println("Sent a record")
        Thread.sleep(1000L)
        futureResult.get()
    }
}
# KotlinOrdersService
OrdersService written in Kotlin

Setup Kafka on Windows by following this tutorial <br/>
https://www.confluent.io/blog/set-up-and-run-kafka-on-windows-linux-wsl-2/

1) Remember to add host to C:\Windows\System32\drivers\etc\hosts <br/>
127.0.0.1 localhost

2) Create Topic <br/>
bin/kafka-topics.sh --create --topic order-submitted --bootstrap-server localhost:9092

3) Start Zookeeper <br/>
bin/zookeeper-server-start.sh config/zookeeper.properties

4) Start Kafka <br/>
bin/kafka-server-start.sh config/server.properties

5) Start Consumer <br/>
bin/kafka-console-consumer.sh --topic order-submitted --from-beginning --bootstrap-server localhost:9092
   
Run the application by running Main.kt 
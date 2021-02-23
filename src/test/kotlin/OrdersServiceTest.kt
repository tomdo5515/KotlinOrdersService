import org.junit.Test
import kotlin.test.assertEquals

class OrdersServiceTest {
    @Test fun testCalculateCost() {
        val inputs = listOf("Apple", "Apple", "Orange", "Apple")
        assertEquals(2.05, calculateCost(inputs), "3 Apples and 1 Orange cost $2.05")
    }
}
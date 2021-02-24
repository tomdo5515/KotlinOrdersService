import org.junit.Test
import kotlin.test.assertEquals

class OrdersServiceTest {
    @Test fun testCalculateCost() {
        val orderService = OrderService()
        val inputs = listOf("Apple", "Apple", "Orange", "Orange","Orange")
        assertEquals(1.1, orderService.calculateCost(inputs), "2 Apples and 3 Orange cost $1.1")
    }

    @Test fun testEffectiveApplesCount() {
        val orderService = OrderService()
        assertEquals(5, orderService.effectiveApplesCount(10), "Buy one get one free on Apple! Buy 10 apples for the price of 5!")
        assertEquals(11, orderService.effectiveApplesCount(21), "Buy one get one free on Apple! Buy 21 apples for the price of 11!")
    }

    @Test fun testEffectiveOrangesCount() {
        val orderService = OrderService()
        assertEquals(6, orderService.effectiveOrangesCount(9), "Buy 3 for the price of 2 on Oranges! Buy 9 apples for the price of 6!")
        assertEquals(15, orderService.effectiveOrangesCount(22), "Buy 3 for the price of 2 on Oranges! Buy 22 apples for the price of 15!")
        assertEquals(12, orderService.effectiveOrangesCount(17), "Buy 3 for the price of 2 on Oranges! Buy 17 apples for the price of 12!")
    }
}
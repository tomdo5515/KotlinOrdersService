class NotificationService(val otherOrderService : OrderService) : Observer {

    override var orderService: OrderService = OrderService()

    init {
        orderService = otherOrderService
        orderService.attach(this)
    }

    override fun update() {
        // This can be an email notification service. Instead, only print to command line for now
        println("Notification Service: The Total Cost of your Order is: "+orderService.getTotalCostOfOrder())
    }
}
fun main(args: Array<String>) {
    print("Welcome to Order Service! Please enter your \"Apple\" and \"Orange\" below")
    // Get inputs from command line
    val inputs : List<String> = readLine()!!.split(' ')

    // Create order service and attach the observer Notification Service to it
    val orderService = OrderService()
    NotificationService(orderService)

    // Use the Order Service to calculate the total cost
    val cost = orderService.calculateCost(inputs)

}


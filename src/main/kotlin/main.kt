fun main(args: Array<String>) {
    print("Welcome to Order Service! Please enter your \"Apple\" and \"Orange\" below")
    val inputs : List<String> = readLine()!!.split(' ')

    val orderService = OrderService()

    NotificationService(orderService)

    val cost = orderService.calculateCost(inputs)


    println("The cost is: $"+ cost)
}


fun main(args: Array<String>) {
    print("Welcome to Order Service! Please enter your \"Apple\" and \"Orange\" below")
    val inputs : List<String> = readLine()!!.split(' ')

    val cost = calculateCost(inputs)
    println("The cost is: $"+ cost)
}

fun calculateCost(inputs : List<String>) : Double {
    var applesCount = inputs.count { it.equals("Apple") }
    var orangesCount = inputs.count { it.equals("Orange") }

    val cost = .6*applesCount + .25*orangesCount
    return cost
}
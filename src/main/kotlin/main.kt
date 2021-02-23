fun main(args: Array<String>) {
    print("Welcome to Order Service! Please enter your \"Apple\" and \"Orange\" below")
    val inputs : List<String> = readLine()!!.split(' ')

    val cost = calculateCost(inputs)
    println("The cost is: $"+ cost)
}

fun calculateCost(inputs : List<String>) : Double {
    var applesCount = inputs.count { it.equals("Apple") }
    var orangesCount = inputs.count { it.equals("Orange") }

    var effApplesCount = effectiveApplesCount(applesCount)
    var effOrangeCount = effectiveOrangesCount(applesCount)

    val cost = .6*effApplesCount + .25*effOrangeCount
    return cost
}

fun effectiveApplesCount(applesCount : Int) : Int = applesCount/2 + applesCount%2
fun effectiveOrangesCount(orangesCount : Int) : Int = orangesCount/3*2 + orangesCount%3
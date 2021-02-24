class OrderSubmitted(apples : Int, oranges : Int, cost : Double) {
    var apples : Int = apples
    var oranges : Int = oranges
    var cost : Double = cost

    override fun toString(): String {
        return "apples: ${apples}, oranges: ${oranges}, cost: ${cost}"
    }
}
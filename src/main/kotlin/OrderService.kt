class OrderService {

    // This is the implementation of Observable pattern
    var observers: ArrayList<Observer> = ArrayList()
    var totalCost : Double = 0.0
    var limitedStock : Boolean = false

    fun getTotalCostAndLimitedStock() : Pair<Double, Boolean> {
        return Pair(totalCost, limitedStock)
    }

    fun setTotalCostAndLimitedStock(newTotalCost : Double, isLimitedStock : Boolean) {
        this.totalCost = newTotalCost
        this.limitedStock = isLimitedStock
        notifyAllObservers();
    }

    fun attach(observer : Observer) {
        observers.add(observer)
    }

    fun notifyAllObservers() {
        observers.forEach { it.update() }
    }

    // OrderService business logic
    val remainingApples = 5
    val remainingOranges = 5
    fun calculateCost(inputs : List<String>) : Double {
        var applesCount = inputs.count { it.equals("Apple") }
        var orangesCount = inputs.count { it.equals("Orange") }
        var isLimitedStock = applesCount > remainingApples || orangesCount > remainingOranges

        var effApplesCount = effectiveApplesCount(applesCount)
        var effOrangeCount = effectiveOrangesCount(orangesCount)


        val cost = .6*effApplesCount + .25*effOrangeCount
        this.setTotalCostAndLimitedStock(cost, isLimitedStock)
        return cost
    }

    fun effectiveApplesCount(applesCount : Int) : Int = applesCount/2 + applesCount%2
    fun effectiveOrangesCount(orangesCount : Int) : Int = orangesCount/3*2 + orangesCount%3

}
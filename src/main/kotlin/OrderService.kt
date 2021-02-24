class OrderService {

    // This is the implementation of Observable pattern
    var observers: ArrayList<Observer> = ArrayList()
    var totalCost : Double = 0.0

    fun getTotalCostOfOrder() : Double {
        return totalCost
    }

    fun setTotalCostAndNotify(newTotalCost : Double) {
        this.totalCost = newTotalCost
        notifyAllObservers();
    }

    fun attach(observer : Observer) {
        observers.add(observer)
    }

    fun notifyAllObservers() {
        observers.forEach { it.update() }
    }

    // OrderService business logic
    fun calculateCost(inputs : List<String>) : Double {
        var applesCount = inputs.count { it.equals("Apple") }
        var orangesCount = inputs.count { it.equals("Orange") }

        var effApplesCount = effectiveApplesCount(applesCount)
        var effOrangeCount = effectiveOrangesCount(orangesCount)

        val cost = .6*effApplesCount + .25*effOrangeCount
        this.setTotalCostAndNotify(cost)
        return cost
    }

    fun effectiveApplesCount(applesCount : Int) : Int = applesCount/2 + applesCount%2
    fun effectiveOrangesCount(orangesCount : Int) : Int = orangesCount/3*2 + orangesCount%3

}
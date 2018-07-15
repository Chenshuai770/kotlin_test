package cs.com.kotlinTest.demo8

enum class Delivery {
    STANDARD, EXPENDITED
}

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double { //todo 申明一个返回的函数
    if (delivery == Delivery.EXPENDITED) {
        return {order -> 6+2.1*order.itemCount }
    }

    return {
        order ->  1.2*order.itemCount
    }
}

fun main(args: Array<String>) {
    val calculator= getShippingCostCalculator(Delivery.EXPENDITED)

    println("Shipping costs ${calculator(Order(3))}")
}
package cs.com.kotlinTest.demo7

import java.math.BigDecimal

//todo operator 修饰符声明了plus函数,所以对象使用加号可以变成我们想要的结果
data class Point(val x: Int, val y: Int) {
    //成员函数
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

class Point1(val x: Int, val y: Int) {
    override fun equals(obj: Any?): Boolean {
        if (obj === this) return true
        if (obj !is Point1) return false
        return obj.x == x && obj.y == y

    }
}

//todo 声明为扩展函数
operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

//todo 类型转换
operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

val list = arrayListOf(1, 2)


fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    val p3 = -p1
    var bd = BigDecimal.ZERO

    println(bd++)
    println(++bd)


    println(p1 + p2)

    println(p1.plus(p2))
    println(p1.times(1.5))

    //todo 集合里面也有类似的operator扩展方法
    list += 3
    println(list)

    val newList = list + listOf(5, 4)
    println(newList)

    println(p3)

    val p4 = Point1(10, 20)
    val p5 = Point1(10, 20)
    println(p4 == p5)
    println(p4 != null)
    println(p4 == null)


}


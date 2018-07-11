package cs.com.kotlinTest.demo7

//todo operator 修饰符声明了plus函数,所以对象使用加号可以变成我们想要的结果
data class Point(val x: Int, val y: Int) {
    //成员函数
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
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

val list = arrayListOf(1, 2)


fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)

    println(p1 + p2)

    println(p1.plus(p2))
    println(p1.times(1.5))

    //todo 集合里面也有类似的operator扩展方法
    list += 3
    println(list)

    val newList = list + listOf(5, 4)
    println(newList)

}


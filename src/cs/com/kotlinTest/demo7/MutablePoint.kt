package cs.com.kotlinTest.demo7

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main(args: Array<String>) {
    val p = MutablePoint(10, 20)
    p[0] = 23
    println(p)
}
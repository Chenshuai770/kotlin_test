package cs.com.kotlinTest.demo2


enum class Color1(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(0, 255, 0), BLUE(0, 0, 255);

    fun rgb() = (r * 256 + g) * 256 + b
}

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VILLET
}


fun getColor(color: Color) {
    when (color) {
        Color.RED -> "red"
        Color.ORANGE -> "orange"
        Color.YELLOW -> "yellow"
        Color.GREEN -> "green"
        Color.BLUE -> "blue"
        Color.INDIGO -> "indigo"
        Color.VILLET -> "villet"
    }
}

fun getX(x: Int) {
    when (x) {
        1 -> println("x=1")
        2 -> println("x=2")
        4, 5 -> println("x=4or5")
        else -> println("x!=1or2")
    }
}


fun getSection(x: Int) = when (x) {
    in 1..10 -> println("x is in the range")
    !in 10..20 -> println("x is outside the range")
    else -> println("none of the above")

}


val items = setOf("apple", "banana", "kiwi")
fun getArray() = when {
    "orange" in items -> println("juicy")
    "apple" in items -> println("apple is fine too")
    else -> {
        println("")
    }
}

//传统java写法与kotlin写法的区别
fun fizzBuzz(i: Int) =
        when {
            i % 15 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> "$i"
        }


fun main(args: Array<String>) {

    var color: Color = Color.ORANGE

    println(Color.values())
    println(Color.valueOf("RED"))
    println(color.name)
    println(color.ordinal)
    println(getX(4))
    println(getSection(22))
    println(getArray())

    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }



}



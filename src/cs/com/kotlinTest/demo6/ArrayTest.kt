package cs.com.kotlinTest.demo6

val letters=Array<String>(26){i->('a'+i).toString()}
val strings= listOf("a","b","c")


//todo 数组的三种基本数据 扩建形式
val fivezeros=IntArray(5)
val fivezerosToo= intArrayOf(1,2,3,4,5) //
val fivezerosThree= IntArray(5){i -> i+1 } //todo lambda表达式
val fivezerosfour= listOf(1,2,3,4,5)

fun main(args: Array<String>) {
    println(letters.joinToString())
    println("%s/%s/%s".format(*strings.toTypedArray()))
    println(fivezeros.joinToString())
    println(fivezerosToo.joinToString())
    println(fivezerosThree.joinToString())
    var toIntArray = fivezerosfour.toIntArray()
    println(toIntArray.joinToString())

    fivezerosThree.forEachIndexed { index, element ->
        println("下标 $index is: $element")
    }

}


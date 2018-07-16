package cs.com.kotlinTest.demo9

import cs.com.kotlinTest.demo6.strings

fun printContents(list: List<Any>) {
    println(list.joinToString())

}


fun addAnswer(list: MutableList<Any>) {
    list.add(123)
}

fun main(args: Array<String>) {
//    printContents(listOf("abc","bac"))

    val strings = mutableListOf("abc", "bac")
   // addAnswer(strings) //泛型使用需要注意协变
    println(strings.maxBy { it.length })
}
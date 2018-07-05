package cs.com.java.demo2

import cs.com.kotlinTest.demo2.joinToString

val list= listOf(1,2,3)

fun main(args: Array<String>) {
    println(list.joinToString(",","{","}"))

}
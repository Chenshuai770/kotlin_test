package cs.com.kotlinTest.demo3

import cs.com.kotlinTest.demo2.lastChar

fun main(args: Array<String>) {
    var testName=StringBuilder("Kotin!")
    println(testName.lastChar)
    testName.lastChar='?'
    println(testName)


}
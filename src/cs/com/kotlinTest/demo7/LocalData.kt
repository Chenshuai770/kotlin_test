package cs.com.kotlinTest.demo7

import java.time.LocalDate

fun main(args: Array<String>) {
    val now=LocalDate.now()
    val vacation=now..now.plusDays(10)
    println(now.plusWeeks(1) in vacation)
    //(0..8).forEach{println(""+it)}

    val char="abc"
    for (c in char){
        println(c)
    }
}
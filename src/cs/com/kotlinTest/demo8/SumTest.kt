package cs.com.kotlinTest.demo8

import cs.com.kotlinTest.demo6.b
import org.omg.CORBA.INTERNAL

val sum = { x: Int, y: Int -> x + y }
val action = {
    println(42)
}

val canRetrunNull: ((Int, Int) -> Int)? = null

fun towAndThree(operation:(Int,Int)->Int){
    val result=operation(2,3)
    println("The result is $result")
}

fun main(args: Array<String>) {

    towAndThree{a,b->a+b}
    towAndThree{a,b->a*b}

}
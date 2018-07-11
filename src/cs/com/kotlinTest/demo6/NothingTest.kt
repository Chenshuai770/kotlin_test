package cs.com.kotlinTest.demo6

val s:String?=null
fun fail(msg:String):Nothing{
    throw IllegalAccessException(msg)
}

fun main(args: Array<String>) {
    fail("gs")

}
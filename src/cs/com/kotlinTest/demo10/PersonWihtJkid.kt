package cs.com.kotlinTest.demo10

/**
 * Created by ChenShuai on 2018/7/17
 */

data class PersonWihtJkid(val name:String,val age:Int)

fun main(args: Array<String>) {
    val person=PersonWihtJkid("Alice",20)
    println(person)
}
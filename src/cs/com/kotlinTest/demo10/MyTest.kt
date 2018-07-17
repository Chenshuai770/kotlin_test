package cs.com.kotlinTest.demo10

import org.junit.Assert
import org.junit.Test

/**
 * Created by ChenShuai on 2018/7/17
 */

class MyTest{
    @Test fun testTrue(){
        Assert.assertTrue(true)
    }
}

@Deprecated("Use removeat")
fun remove(index:Int){

}
fun test(list:List<*>){

    @Suppress("UNCHECKED_CAST")
    val strings=list as List<String>
}

fun main(args: Array<String>) {
    val list= mutableListOf(1,2,4)
    list.removeAt(2)
    println(list)
}
package cs.com.kotlinTest.demo5

import cs.com.java.demo5.Post

fun createAllDoneRunnable():Runnable{
    return Runnable { println("All Done!") }
}

fun main(args: Array<String>) {

    createAllDoneRunnable().run()

}
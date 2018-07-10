package cs.com.kotlinTest.demo6

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class Myservice {
    fun perforAction(): String = "foo"
}

class MyTest {
    private lateinit var myservice: Myservice //todo 声明一个不需要初始化器的非null类型的属性

    //在此方法中提供真正的初始化器
    @Before fun setUp(){
        myservice= Myservice()
    }

    @Test fun testAction(){
        Assert.assertEquals("foo",myservice!!.perforAction())
    }
}
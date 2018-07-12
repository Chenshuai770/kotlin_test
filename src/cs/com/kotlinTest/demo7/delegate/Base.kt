package cs.com.kotlinTest.demo7.delegate
//todo 在委托模式中，有两个对象参与处理同一个请求，接受请求的对象将请求委托给另一个对象来处理。
//todo 类委托
//Kotlin 直接支持委托模式，更加优雅，简洁。Kotlin 通过关键字 by 实现委托。

//创建接口
interface Base{
    fun print()
}

//实现此此接口的被委托的类
class BaseImpl(val x:Int): Base {
    override fun print() {
        println(x)
    }

}

//通过关键字 by 建立委托类
class Derived(b: Base): Base by b

fun main(args: Array<String>) {
    //todo在 Derived 声明中，by 子句表示，将 b 保存在 Derived 的对象实例内部，而且编译器将会生成继承自 Base 接口的所有方法, 并将调用转发给 b
    val b= BaseImpl(10)
    Derived(b).print()
}
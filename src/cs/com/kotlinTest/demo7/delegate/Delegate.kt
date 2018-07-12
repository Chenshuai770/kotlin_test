package cs.com.kotlinTest.demo7.delegate

import kotlin.reflect.KProperty

//todo 属性委托
// 定义包含属性委托的类
/**
 * by 关键字之后的表达式就是委托,
 * 属性的 get() 方法(以及set() 方法)将被委托给这个对象的 getValue() 和 setValue() 方法。
 * 属性委托不必实现任何接口, 但必须提供 getValue() 函数(对于 var属性,
 * 还需要 setValue() 函数)。
 */
class Example{
    var p:String by Delegate1()
}

 class Delegate1{
    operator fun getValue(thisRef:Any?,property: KProperty<*>):String{
        return "$thisRef,这里委托了 ${property.name} 属性"
    }

    operator fun setValue(thisRef: Any?,property: KProperty<*>,value: String){
        println("$thisRef 的 ${property.name} 属性赋值为$value")
    }

}

fun main(args: Array<String>) {
    val e= Example()
    println(e.p) // 访问该属性，调用 getValue() 函数
    e.p="Runoob" // 调用 setValue() 函数
    println(e.p)
}

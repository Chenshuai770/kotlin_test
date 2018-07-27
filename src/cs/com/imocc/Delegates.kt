package cs.com.imocc

import kotlin.reflect.KProperty

class Delegates{
    val hello by lazy {
        "HelloWorld"
    }

    val hello2 by X() //todo by属于运算符重载 hello的get方法相当于交给了X的getvalue

    var hello3 by X()
}



class X{
    var value:String?=null

     operator fun  getValue(thisRef: Any?, property: KProperty<*>): String {
         return value?:""
     }
    operator fun  setValue(thisRef: Any?, property: KProperty<*>,value:String) {
         this.value=value
     }
}

fun main(args: Array<String>) {
    val  delegates=Delegates()
    delegates.hello3="gaoshou"
    println(delegates.hello)
    println(delegates.hello2)
    println(delegates.hello3)
}
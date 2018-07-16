package cs.com.kotlinTest.demo9

import java.lang.StringBuilder

val list = listOf(1, 2, 3)


fun <T : Number> oneHale(value: T): Double {
    return value.toDouble() / 2.0
}

fun <T : Comparable<T>> max(first: T, sencond: T): T {
    return if (first > sencond) first else sencond
}

//todo 这里的泛型失信了 CharSequence Appendable两个接口,所以能访问数据 endswith 和 修改数据 append
fun <T> ensureTrailingPeriod(seq: T) where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append(',')
    }
}

//todo 非默认非null 泛型
class ProcessorNotNull<T : Any> {
    fun process(value: T) {
        value.hashCode()
    }
}

//todo 默认可null 泛型
class ProcessorNull1<T : Any?> {
    fun process(value: T) {
        value?.hashCode()
    }
}

//todo 默认可null 可省略
class ProcessorNull2<T> {
    fun process(value: T) {
        value?.hashCode()
    }
}


fun main(args: Array<String>) {
    println(list.sum())
    println(oneHale(123))
    println(max("kotlin", "java"))
    println(max("3", "4"))
    println(max(3, 4))

    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)

}
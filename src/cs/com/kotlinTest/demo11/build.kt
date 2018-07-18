package cs.com.kotlinTest.demo11

fun buildString(builderAction: (StringBuilder) -> Unit): String { //todo 定义一个函数类型的参数
    val sb = StringBuilder()
    builderAction(sb) //todo 传递一个StringBuilder对象作为lambda的参数
    return sb.toString()
}

fun buildString1(builderAction: StringBuilder.() -> Unit):String{//todo 定义带接受者的函数类型的参数
    val sb = StringBuilder()
    builderAction(sb)
    return sb.toString()
}

fun main(args: Array<String>) {
    val s = buildString {
        it.append("Hello,")
        it.append("World")
    }

    val s1= buildString1 {
        this.append("Hello, ").append("World")
    }

    println(s)
    println(s1)
}
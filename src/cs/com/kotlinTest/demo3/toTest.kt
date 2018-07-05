package cs.com.kotlinTest.demo3

//申明to的结构表达式 infix如果没有则没法调用
 fun Any.to(other:Any) =Pair(this,other)

fun main(args: Array<String>) {
    val (number,name)=1 to "one"
}
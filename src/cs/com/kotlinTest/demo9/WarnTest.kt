package cs.com.kotlinTest.demo9

val listfromInt = listOf(1, 2, 3)
val listfromString = listOf("2", "2", "2")
val listfromSet = setOf(1, 2, 3)
val items = listOf("one",2 ,"three")

fun printSum(c: Collection<*>) {
    val inList = c as? List<Int>
            ?: throw IllegalAccessException("list is expected") //todo 类型是int 的list
    println(inList.sum())
}

//todo kotlin 和java语法的不同的地方
fun printSum1(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c)
    }
}


//todo reified 表示具体的例子,注意列子的泛型一定要写.类型参数不会在运行是擦除
inline fun <reified T> isA(value: Any) = value is T


fun main(args: Array<String>) {
//    printSum(listfromInt)
//    printSum(listfromString)
    // printSum(listfromSet)
    println(isA<String>("abc"))
    println(isA<String>(123))
    println(items.filterIsInstance<String>())

}
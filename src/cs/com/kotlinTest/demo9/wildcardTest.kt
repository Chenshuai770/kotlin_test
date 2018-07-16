package cs.com.kotlinTest.demo9

val listother: MutableList<Any?> = mutableListOf('a', 1, "qwe")
val chars= mutableListOf('a','b','c')
val unkonwnElements:MutableList<*> = mutableListOf('b', 1, "qwe")

fun printFirst(list:List<*>){
    if (list.isNotEmpty()){
        println(list.first())
    }
}

//todo <*> 和 T的区别
fun <T>printFirst1(list:List<T>){
    if (list.isNotEmpty()){
        println(list.first())
    }
}



fun main(args: Array<String>) {
    printFirst(listother)
    printFirst1(unkonwnElements)
}
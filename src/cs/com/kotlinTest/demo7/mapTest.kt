package cs.com.kotlinTest.demo7

fun printEntries(map:Map<String,Int>){
    for ( (key,value) in map){
        println("$key -> $value")
    }
}

fun main(args: Array<String>) {
    val map= mapOf("Google" to 1,"Baidu" to 2)

    printEntries(map)

}
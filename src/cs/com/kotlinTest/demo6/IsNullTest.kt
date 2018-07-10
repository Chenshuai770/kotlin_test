package cs.com.kotlinTest.demo6

val name1 = ""
val name2: String? = null
val name3 = null

fun <T> printHashCode(t:T){ //todo 这里的T默认是 T:Any?
    println(t?.hashCode())
}

fun <T:Any> printHashCode1(t:T){ //todo 这里的T是Any 传入null会报错,或者编译前就会报错
    println(t.hashCode())
}

fun main(args: Array<String>) {

    println(name1.isEmpty())
    println(name2?.isEmpty())

    println(name1.isBlank())
    println(name2?.isBlank())

    println(name3.isNullOrBlank())
    printHashCode(null)
    //printHashCode1(null)


}
package cs.com.kotlinTest.demo6

fun foo(s: String?) {
    val t: String = s ?: ""
}

fun strLen1(s: String?): Int =
        if (s != null) {
            s.length
        } else 0

//todo 此判断是 ?: else判断符号 ?表示可null
fun strlenSafe(s: String?): Int = s?.length ?: 0

fun main(args: Array<String>) {
    println(strlenSafe("abc"))
    println(strlenSafe(null))
}
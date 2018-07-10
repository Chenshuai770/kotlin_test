package cs.com.kotlinTest.demo6

fun ignoerNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun sendEmail(email: String) {
    println("sendEmail")
}

fun main(args: Array<String>) {
    //println(ignoerNulls(null))
    println(ignoerNulls("abc"))
    val email: String? =null
    println(email?.let { email -> sendEmail(email) })
    println(email?.let { sendEmail(it)})

}
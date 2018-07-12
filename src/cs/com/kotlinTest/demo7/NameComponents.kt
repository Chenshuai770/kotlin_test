package cs.com.kotlinTest.demo7

data class NameComponents(val name: String,
                          val extension: String)

fun splitFileName(fullName: String): NameComponents {
    val result = fullName.split(".", limit = 2)
    return NameComponents(result[0], result[1])
}
//todo 注意写法二的区别
fun splitFileName1(fullName: String): NameComponents {
    val (name,etx) = fullName.split(".", limit = 2)//todo 解构声明
    return NameComponents(name, etx)
}


fun main(args: Array<String>) {
    val (name, ext) = splitFileName("exampl.kt")
    val (name1, ext1) = splitFileName1("exampl.java")
    println(name)
    println(ext1)
}

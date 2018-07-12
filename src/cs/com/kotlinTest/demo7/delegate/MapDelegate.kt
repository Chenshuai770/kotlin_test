package cs.com.kotlinTest.demo7.delegate

/**
 * 一个常见的用例是在一个映射（map）里存储属性的值。
 * 这经常出现在像解析 JSON 或者做其他"动态"事情的应用中。
 * 在这种情况下，你可以使用映射实例自身作为委托来实现委托属性。
 */
class Site(val map: Map<String, Any?>) {
    val name: String by map
    val url: String by map
}

class SiteMutable(val map: MutableMap<String, Any?>) {
    val name: String by map
    val url: String by map
}

fun main(args: Array<String>) {
  /*  val site = Site(mapOf(
            "name" to "菜鸟教程",
            "url" to "www.runoob.com"
    ))

    println(site.name)
    println(site.url)*/

    var mutableMap:MutableMap<String,Any?> = mutableMapOf(
            "name" to "baidu",
            "url" to "www.baidu.com"
    )
    val siteMutable=Site(mutableMap)
    println(siteMutable.name)
    println(siteMutable.url)

    println("--------------")
    mutableMap.put("name", "Google")
    mutableMap.put("url", "www.google.com")

    println(siteMutable.name)
    println(siteMutable.url)


}
package cs.com.kotlinTest.test1

class Configuration(map: Map<String, Any?>) {
    val width: Int by map
    val height: Int by map
    val dp: Int by map
    val deviceName: String by map

}

val conf = Configuration(
        mapOf("width" to 1080,
                "height" to 1080,
                "dp" to 1080,
                "deviceName" to "gaoshou",
                "up" to "up"))

fun main(args: Array<String>) {
    println(conf.dp)


}
package cs.com.kotlinTest.demo8

//lsit 的labmda 函数
data class SiteVisit(
        val path: String,
        val duration: Double,
        val os: OS
)

enum class OS {
    WINDOWS,
    LINUX,
    MAC,
    IOS,
    ANDROID
}

val log = listOf(
        SiteVisit("/", 34.0, OS.WINDOWS),
        SiteVisit("/", 22.0, OS.MAC),
        SiteVisit("/", 12.0, OS.WINDOWS),
        SiteVisit("/signub", 8.0, OS.IOS),
        SiteVisit("/", 16.0, OS.IOS),
        SiteVisit("/", 16.3, OS.ANDROID)
)

//利用lambda方式抽象成方法
fun List<SiteVisit>.averageDurationFor(os: OS) =
        filter { it.os == os }.map(SiteVisit::duration).average()


//注意对比上面的lambda 表达式
fun List<SiteVisit>.averageDurationBy(perdicate: (SiteVisit) -> Boolean) =
    filter(perdicate).map(SiteVisit::duration).average()

fun main(args: Array<String>) {
    val averageWindowsDuration = log
            .filter { it.os == OS.WINDOWS }
            .map(SiteVisit::duration)
            .average()
    println(averageWindowsDuration)

    println(log.averageDurationFor(OS.IOS))

    println(log.averageDurationBy { it.os == OS.IOS && it.path == "/signub" })
}
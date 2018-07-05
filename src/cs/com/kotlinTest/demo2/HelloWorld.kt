package cs.com.kotlinTest.demo2

fun main(args: Array<String>) {
    var a="Hello"
    val b="world"
    val name =if (args.size>0 ) args[0] else "kotlin"



    val rectangle=Rectangle(23,23)
    println(rectangle.isSquare)

    var c=Person("高手",true)
    println(c.name+" "+c.ismarried)

    println("$a,${args[1]}")
    val languages= arrayListOf("java")
    languages.add("kotlin")
    println(languages)

    println("Hello,World!")
    println(a)
    println(max(2,5))
    println(max1(7,5))


}

fun max(a:Int,b:Int):Int{
    return if (a>b) a else b
}

fun max1(a:Int,b:Int)=if (a>b) a else b




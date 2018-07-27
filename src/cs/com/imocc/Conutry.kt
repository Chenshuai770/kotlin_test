package cs.com.imocc

data class Conutry(val id:Int,val name:String)

class ComponentX{
    operator fun component1():Int{
        return 1
    }

    operator fun component2():Int{
        return 1
    }

    operator fun component3():Int{
        return 0
    }
}

fun main(args: Array<String>) {
    val china=Conutry(0,"中国")
    println(china)
    println(china.component1())
    println(china.component2())
    val(id,name)=china

    /*for ((index,value) in args.withIndex()){
        println("index$index,  value$value")
    }*/

    val componentX=ComponentX()
    val (a,b,c)=componentX
    println("$a$b$c")
}
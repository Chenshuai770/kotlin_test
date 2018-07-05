package cs.com.kotlinTest.demo2

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalAccessException("Unkonw expression") as Throwable
}

fun eval1(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval1(e.right) + eval1(e.left)
            else -> throw IllegalAccessException("Unkonw expression")
        }

fun evalWithlogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num :${e.value}")
                e.value
            }

            is Sum -> {
                val left = evalWithlogging(e.left)
                val right = evalWithlogging(e.right)
                println("sum:$left+$right")
                left + right
            }
            else -> throw IllegalAccessException("Unkonw expression")
        }






fun main(args: Array<String>) {
    var a = Sum(Num(1), Num(2))
    var b = Sum(a, Num(4))
    //println(eval(b))
    // println(eval1(b))
    println(evalWithlogging(b))
}





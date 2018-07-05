package cs.com.kotlinTest.demo2

const val TNAME = "GAOSHOU"
var opCont = 0

fun perforOperation() {
    opCont++
}

fun String.lastChar(): Char = this.get(this.length - 1)

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}
package cs.com.kotlinTest.demo11

class Greeter(val greeting:String){
    operator fun invoke(name:String){
        println("$greeting,$name")
    }
}

fun main(args: Array<String>) {
    val bavarianGreeter=Greeter("Servus")
    bavarianGreeter("cs")
}
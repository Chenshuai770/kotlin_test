package cs.com.kotlinTest.demo8

data class PersonFroInline(val name: String, val age: Int)

val peoPle = listOf(PersonFroInline("Alice", 20)
        , PersonFroInline("Bob", 31))

fun main(args: Array<String>) {
    println(peoPle.filter { it.age < 30 }.map(PersonFroInline::name))
}
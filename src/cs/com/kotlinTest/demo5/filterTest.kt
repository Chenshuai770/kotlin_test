package cs.com.kotlinTest.demo5


fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    val numbers = mapOf(0 to "zero", 1 to "one")
    println(list.filter { it % 2 == 0 })
    println(numbers.mapValues { it.value.toUpperCase() })

    println(list.all { i -> i == 3 }) //todo 所有元素都是3
    println(list.any { it != 3 }) //


    val listString = listOf("A","Ab","bc","BB")

    println(listString.groupBy(String::first))

    val naturalNumbers= generateSequence(0) { it+1 }.takeWhile { it<=100 }
    println(naturalNumbers)//todo 惰性操作下不会执行代码
    println(naturalNumbers.sum())


}
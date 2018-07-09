package cs.com.kotlinTest.demo5

data class Person2(val name: String, val age: Int) //主构造方法

fun findTheOldest(peoPle: List<Person2>) {
    var maxAge = 0;
    var theOldest: Person2? = null
    for (person in peoPle) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person;
        }
    }
    println(theOldest)
}

val canBeInClub29 = { p: Person2 -> p.age <= 30 }

val sum = { x: Int, y: Int -> x + y } //todo 花括号那边是lambda函数体

fun person2() = println("Person2")

fun main(args: Array<String>) {
    println(sum(1, 2))
    val peoplefromOld = listOf(Person2("Alice", 29), Person2("Bob", 32))
    println(findTheOldest(peoplefromOld))

    val peoplefromNew = listOf(Person2("Alice", 29), Person2("Bob", 32))

    println(peoplefromNew.maxBy({ p: Person2 -> p.age })) //todo 花括号代码是lanmda函数体
    println(peoplefromNew.minBy() { p: Person2 -> p.age })//todo 如果labda表达式是函数调用的最后一个实际参数,他可以放到括号外面
    println(peoplefromNew.minBy { p: Person2 -> p.age })//todo 当labda表达式是函数唯一的实参时,还可以去掉代码中的括号
    println(peoplefromNew.minBy { p -> p.age })//todo 推导出函数类型
    println(peoplefromNew.maxBy { it.age })//todo it 是自动声明的参数名称


    val names = peoplefromNew.joinToString("") { p: Person2 -> p.name }
    println(names)

    val getAge = { p: Person2 -> p.age }
    println(peoplefromNew.minBy(getAge))

    println(peoplefromNew.minBy(Person2::age))//todo 更简单易懂的lanmda表达式

    println(peoplefromNew.filter { it.age > 30 })

    println(peoplefromNew.map { Person2::age }) //todo lambda表达式区别
    println(peoplefromNew.map { it.name+">>>" })//todo lambda表达式区别

    println(peoplefromNew.filter { it.age > 30 }.map { it.name })//todo 组合写法 但是每个map 或者filter 都会创建实例会影响性能
    println("KKK  "+peoplefromNew.asSequence().map(Person2::name).filter { it.startsWith("A") }.toList())




    println(peoplefromNew.all(canBeInClub29))
    println(peoplefromNew.all{it.age>20})

    val peopleforMap = listOf(Person2("Alice", 29), Person2("Bob", 32), Person2("CC",34))
    println(peopleforMap.groupBy { it.age == 29 })


}
package cs.com.kotlinTest.demo8

data class PersonbyLookForAlice(val name: String, val age: Int)

val people = listOf(PersonbyLookForAlice("Alice", 20),
        PersonbyLookForAlice("Bob", 31))

fun lookForAlice(people: List<PersonbyLookForAlice>) {
    for (person in people) {
        if (person.name=="Alice"){
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}

fun lookForAlicefromLambda(people: List<PersonbyLookForAlice>) {
    people.forEach{
        if (it.name=="Alice") {
            println("Found!")
            return
        }

    }
    println("Alice is not found")
}
// todo return 终止 lambda循环体,但是不终止方法体
fun lookForAlicefromLambdaforLaber (people: List<PersonbyLookForAlice>) {
    people.forEach label@{
        if (it.name=="Alice") {
            println("Found!")
            return@label
        }

    }
    println("Alice is not found")
}
//todo lambda 终止的另外种写法
fun lookForAlicefromLambdaforLaber1 (people: List<PersonbyLookForAlice>) {
    people.forEach {
        if (it.name=="Alice") {
            println("Found!")
            return@forEach
        }

    }
    println("Alice is not found")
}

//todo 匿名函数处理 取代lambda表达式
fun lookForAliceAnonymous(people:List<PersonbyLookForAlice>){
    people.forEach(fun (person){
        if (person.name=="Alice")return //todo 在匿名函数里面 return 从最近的fun关键字声明的函数返回
        println("${person.name} is not Alice" )
    })
}




fun main(args: Array<String>) {
    lookForAlice(people)
    lookForAlicefromLambda(people)
    lookForAlicefromLambdaforLaber(people)
    lookForAlicefromLambdaforLaber1(people)
    lookForAliceAnonymous(people)

}
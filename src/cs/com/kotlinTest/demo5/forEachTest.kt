package cs.com.kotlinTest.demo5

fun printMessagesWithprefix(messages:Collection<String>,prefix:String){
    messages.forEach{
        println("$prefix $it")
    }

}

fun printProblemCounts(responses:Collection<String>){
    var clientErrors=0
    var serverError=0

    responses.forEach{
        if (it.startsWith("4")){
            clientErrors++
        }else if (it.startsWith("5")){
            serverError++
        }
    }
    println("$clientErrors client errors,$serverError server errors")
}


fun main(args: Array<String>) {
    val errors= listOf("403 Forbidden","404 Not Found")
    println(printMessagesWithprefix(errors,"Error:"))

   /* val time1=System.currentTimeMillis()
    for (i in 1..100000){
        println(i)
    }
    val time2=System.currentTimeMillis()
    println(time2 - time1)*/

    val responses= listOf("200 Ok","418 I'm a teapot","500 Internal Server Error")

    println(printProblemCounts(responses))

}
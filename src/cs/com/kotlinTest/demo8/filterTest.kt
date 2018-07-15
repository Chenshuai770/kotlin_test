package cs.com.kotlinTest.demo8

fun String.filter(predicate:(Char)->Boolean):String{
    val sb =StringBuilder()
    for (index in 0 until this.length){//todo 传进来的 lambda 的区间值
        val element=get(index)
        if (predicate(element)){ //todo lambda 返回的类型是boolean
            sb.append(element)
        }
    }
    return sb.toString()
}

fun main(args: Array<String>) {
    println("ab1c".filter { it in 'a'.. 'z'})
}
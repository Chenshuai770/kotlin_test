package cs.com.kotlinTest.demo9

//todo 带不变型类型参数的数据拷贝函数,但不支持非同类函数,因为前面的泛型限制了后面的类型
fun <T> copyData(source: MutableList<T>,
                 destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}

//todo 带不变型类型参数的数据拷贝函数,支持非同类函数,因为前面的泛型限制了后面的类型,注意T和R T必须R的子类型,否则不通过
fun <T:R,R> copyDataWithR(source: MutableList<T>,
                 destination: MutableList<R>) {
    for (item in source) {
        destination.add(item)
    }
}

//todo 带不变型类型参数的数据拷贝函数,支持非同类函数,使用out关键字,效果和copyDataWithR一样,代码少了,如果没有前面的T的限制,out不能被使用
fun <T> copyDataWithOut(source: MutableList<out T>,
                          destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}


//todo 带不变型类型参数的数据拷贝函数,支持非同类函数,使用in关键字,效果和copyDataWithR一样,代码少了,如果没有前面的T的限制,out不能被使用
fun <T> copyDataWithInt(source: MutableList<T>,
                        destination: MutableList<in T>) {
    for (item in source) {
        destination.add(item)
    }
}



//todo in 和 out 本质是一样的

val sourceList = mutableListOf<Int>(1, 3, 4)
val destinateStringList = mutableListOf<String>()
val destinateIntList = mutableListOf<Int>()
val destinateAnyList = mutableListOf<Any>()

fun main(args: Array<String>) {
   // copyData(sourceList, destinateStringList)//出现异常
    destinateAnyList.clear()
    copyData(sourceList, destinateIntList)
    println(destinateIntList)

    destinateAnyList.clear()
    copyDataWithR(sourceList, destinateAnyList)
    println(destinateAnyList)

    destinateAnyList.clear()
    destinateAnyList.add(true)
    copyDataWithOut(sourceList, destinateAnyList)
    println(destinateAnyList)

    destinateAnyList.clear()
    destinateAnyList.add(true)
    copyDataWithInt(sourceList, destinateAnyList)
    println(destinateAnyList)
}


package cs.com.kotlinTest.demo6

import java.io.BufferedReader
import java.io.StringReader

fun readNumbers(reader:BufferedReader):List<Int?> {
    val result=ArrayList<Int?>()

    for (line in reader.lineSequence()){
        try {
            val number=line.toInt()
            result.add(number)
        }catch (e:NumberFormatException){
            result.add(null)
        }
    }
    return result

}

fun addValidNumbers(numbers: List<Int?>) {
    var sumofValidNumber=0
    var invalidNumber=0

    for (number in numbers){
        if (number!=null){
            sumofValidNumber+=number
        }else{
            invalidNumber++
        }
    }
    println("Sum of valid numbers: $sumofValidNumber")
    println("Invalid numbers: $invalidNumber")

}

fun main(args: Array<String>) {
    val reader=BufferedReader(StringReader("1\nabc\n42"))
    val numbers= readNumbers(reader)
    addValidNumbers(numbers)

    println(numbers.filterNotNull())

}
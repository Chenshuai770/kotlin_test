package cs.com.kotlinTest.demo2

import java.util.*

var binaryReps=TreeMap<Char,String>()

var list= arrayListOf( "11","23","234")

fun main(args: Array<String>) {
    for (c in 'A'..'F'){
        val binary=Integer.toBinaryString(c.toInt())
        binaryReps[c]=binary
    }
    for ((letter,binary) in binaryReps){
       //println("$letter=$binary")
    }

    for ((index,elemet)in list.withIndex()){
        //println("$index: $elemet")
    }
    println(isLetter('x'))

    println("kotlin" in "java".."scale")

}

fun isLetter(c :Char)=c in 'a'..'g'
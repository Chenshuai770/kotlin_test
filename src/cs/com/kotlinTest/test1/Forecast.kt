package com.cs.ktTest.bean

import java.util.*

/**
 * Created by chenshuai on 2018/7/19/019.
 */
data class Forecast(val date:Date,val temperature:Float,val details:String)

fun main(args: Array<String>) {
    val f1=Forecast(Date(),27.5f,"晴天")
    val f2=f1.copy(temperature = 30f)
    println(f1)
    println(f2)

    val(data,temprature,details)=f1
    val data1=f1.component1()
    val temperature1=f1.temperature
    val details1=f1.details

    println(data1)
    println(temperature1)
    println(details1)
}
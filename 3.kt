package com.example.test

import java.util.*

fun main()
{
    val sc= Scanner(System.`in`)
    println("enter marks of three subjects")
    var a=sc.nextInt()
    var b=sc.nextInt()
    var c=sc.nextInt()
    var d=a+b+c
    var e=d/3
    println("Total  of the student $d")
    println("Percentage of the student $e")


}
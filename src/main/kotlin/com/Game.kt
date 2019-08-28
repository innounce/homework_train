package com

import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    val secret = Random.nextInt(10)+1
    println("secret=$secret")
    val scanner = Scanner(System.`in`)
    var num=0
    while ( secret != num){
        println("Please enter a number：")
        num = scanner.nextInt()
        if (num > secret)
            println("Smaller")
        else if (num < secret)
            println("Bigger")
        else
            println("great!! the num is $secret")
    }
}
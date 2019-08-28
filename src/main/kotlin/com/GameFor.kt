package com

import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {

    var secret = Random.nextInt(1,10)
    println("secret=$secret")
    val scanner = Scanner(System.`in`)
    for(i in 1..4){
        println("Please enter a number(${i}/4)：")
        var number = scanner.nextInt()
        println("第${i}次 $number")
        if(secret > number)
            println("Bigger")
        else if (secret < number)
            println("Smaller")
        else if (secret == number) {
            println("great!! the num is $secret")
            break
        }
        if (number == -1){
            break
        }
    }
}
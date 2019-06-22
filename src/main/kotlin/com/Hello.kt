package com

fun main(args: Array<String>) {
//    println("Hello Kotlin!")

    val h= Human(66.5f, 1.7f)
    h.Hello()
    h.bmiK()

}

class Human(var weight :Float, var height :Float){

    fun bmiK(){
        println(weight / (height*height))
    }


    fun Hello(){
        println("Hello Kotlin 2!")
    }
}
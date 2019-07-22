package com.Student

import java.util.*


fun main(args: Array<String>) {

//    userInput()
    val stu = Student("Jack", 66, 88)
    stu.Print()
    println("high scire: ${stu.hightest()}")

}


class Student(var name: String, var math: Int, var english:Int){

    fun Print(){
        println(name + "\t" + math + "\t" + english + "\t" + (math + english) / 2)
    }

    fun hightest():Int{
        var max = if(math > english){
             math
        }else{
            english
        }
        return max
    }
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name:")
    var name = scanner.next()
    print("Please enter student's math:")
    var math = scanner.nextInt()
    print("Please enter student's english:")
    var english = scanner.nextInt()


    val stu = Student(name, math, english)
    stu.Print()
}

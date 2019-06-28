package com.Student

import java.util.*


fun main(args: Array<String>) {

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

class Student(var name: String, var math: Int, var english:Int){

    fun Print(){
        println(name + "\t" + math + "\t" + english + "\t" + (math + english) / 2)
    }
}
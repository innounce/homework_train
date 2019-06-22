package com.Student

fun main(args: Array<String>) {
    val stu = Student("Jack", 60, 70)
    stu.Print()
}

class Student(var name: String, var math: Int, var english:Int){

    fun Print(){
        println(name + "\t" + math + "\t" + english + "\t" + (math + english) / 2)
    }
}
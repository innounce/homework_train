package com.Student

import java.util.*


fun main(args: Array<String>) {

//    userInput()
    val stu = Student("Jack", 66, 88)
    stu.Print()
    println("high score: ${stu.hightest()}")

}


class Student(var name: String, var math: Int, var english:Int){

    fun Print(){
        println("$name\t$math\t$english\t${getAverage()}\t${passOrFailed()}\t${getGrade()}")
    }

    fun passOrFailed() = if( getAverage() >=60 ) "PASS" else "FAILED"

    fun getGrade() = when ( getAverage() ) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun getAverage() = (math + english) / 2

    fun hightest() = if(math > english){
        math
    }else{
        english
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

package com.Student

import java.util.*


fun main(args: Array<String>) {

//    userInput()
    val stu = Student("Jack", 66, 88)
    val stu2 = Student("Eric", 66, 44)
    val stu3 = Student("Luie", 66, 22)
    stu.Print()
    stu2.Print()
    stu3.Print()
//    println("high score: ${stu.hightest()}")
    Student.PASS = 50
    stu.Print()
    stu2.Print()
    stu3.Print()

    val gstu = GraduadeStudent("Edward", 50,55,60)
    gstu.Print()

}
class GraduadeStudent(name: String?, math: Int, english: Int, val thesis: Int) : Student(name, math, english) {
    companion object {
        var PASS = 70
    }

    override fun Print() {
        println("$name\t$math\t$english\t$thesis\t${getAverage()}\t${passOrFailed()}\t${getGrade()}")
    }

    override fun passOrFailed() = if( getAverage() >= PASS) "PASS" else "FAILED"
}

open class Student(var name: String?, var math: Int, var english:Int){
    companion object {
        var PASS = 60
    }

    open fun Print(){
        println("$name\t$math\t$english\t${getAverage()}\t${passOrFailed()}\t${getGrade()}")
    }

    open fun passOrFailed() = if( getAverage() >= PASS ) "PASS" else "FAILED"

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

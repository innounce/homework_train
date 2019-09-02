package com.Student

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest{

    @Test
    fun hightestTest(){
        val stu = Student("HANK", 60, 80)
        Assertions.assertEquals(80 , stu.hightest())
    }

    @Test
    fun getAverageTest(){
        val stu = Student("HANK", 60, 80)
        Assertions.assertEquals(70 , stu.getAverage())
    }
    @Test
    fun getGradeTest(){
        val stu = Student("HANK", 60, 80)
        Assertions.assertEquals('C' , stu.getGrade())
    }
}
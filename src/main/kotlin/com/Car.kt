package com

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {

    var enter = LocalDateTime.of(2019, 9,17,8,0,0)
    var leave = LocalDateTime.of(2019, 9,17,10,0,0)
    val car = Car("AA-0001", enter)
    car.leave = leave

    println(car.durationMinute())
    println(car.durationHours())

    var leave2 = LocalDateTime.of(2019, 9,17,10,8,0)
    car.leave = leave2

    println(car.durationMinute())
    println(car.durationHours())
}

class Car(var id : String, var enter: LocalDateTime){
    var leave:LocalDateTime? = null
    set(value) {
        if(enter.isBefore(value))
            field = value
    }

    fun durationMinute() = Duration.between(enter, leave).toMinutes()

    fun durationHours() = Math.ceil(Duration.between(enter, leave).toMinutes()/60.0).toLong()
}
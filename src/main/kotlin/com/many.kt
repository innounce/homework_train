package com

import java.time.LocalDateTime

fun main(args: Array<String>) {
//    list()
    var enter = LocalDateTime.of(2019, 9,17,8,0,0)
    val map = HashMap<String , Car>()
    //car enter
    map.put("AAA-0001", Car("AAA-0001", enter))
    map.put("BBB-0002", Car("BBB-0002", enter.plusMinutes(15)))

    var leave = LocalDateTime.of(2019, 9,17,10,0,0)
    var car: Car? = map.get("AAA-0001")
    car?.leave = leave

    println("${car?.id} durationMinute:${car?.durationMinute()}")
    println("${car?.id} durationHours:${car?.durationHours()}")
    map.remove("AAA-0001")
    println(map.size)
    car = map.get("BBB-0002")
    car?.leave = leave.plusHours(1)
    println("${car?.id} durationMinute:${car?.durationMinute()}")
    println("${car?.id} durationHours:${car?.durationHours()}")
    map.remove("BBB-0002")
    println(map.size)

}

private fun list() {
    val list = listOf(5, 1, 4, 7)
    println(list)
    val scores = listOf(68, 88, 77, 99, 50)
    for (i in scores)
        println(i)

    val mutablelist = mutableListOf(5, 1, 4, 7)
    mutablelist.add(6)
    println(mutablelist)
}
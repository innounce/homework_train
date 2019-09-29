package com

fun main(args: Array<String>) {
    val list = listOf(5,1,4,7)
    println(list)
    val scores = listOf(68, 88, 77, 99, 50)
    for(i in scores)
        println(i)

    val mutablelist = mutableListOf(5, 1, 4, 7)
    mutablelist.add(6)
    println(mutablelist)

}
package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets: ")
    var buy = scanner.nextInt()
    println("How many round-trip tickets: ")
    var roundTrip = scanner.nextInt()
    val ticketKt = TicketKt(buy, roundTrip)
    ticketKt.calc()
}

class TicketKt(var buy: Int, var roundTrip: Int){
    val price = 1000
    val roundTripPrice = 1800

    fun calc(){
        println("Total tickets: $buy")
        println("Round-trip: $roundTrip")
        println("Total: " + (roundTrip * roundTripPrice + (buy - roundTrip) * price))
    }

}
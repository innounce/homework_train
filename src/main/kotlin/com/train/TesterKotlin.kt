package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var buy = 0
    var roundTrip = 0
    while(true) {
        println("Please enter number of tickets: ")
        buy = scanner.nextInt()
        if(buy == -1) break
        println("How many round-trip tickets: ")
        roundTrip = scanner.nextInt()
        val ticketKt = TicketKt(buy, roundTrip)
        ticketKt.calc()
    }
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
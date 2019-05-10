package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int buy = 0, roundTrip ;
        while(true){
            System.out.println("Please enter number of tickets: ");
            buy = scanner.nextInt();
            if(buy == -1)
                break;
            System.out.println("How many round-trip tickets: ");
            roundTrip = scanner.nextInt();

            if(buy > roundTrip){
                Ticket ticket = new Ticket(buy, roundTrip);
                ticket.calc();
            }
        }
    }
}

class Ticket{
    int buy;
    int roundTrip;
    static final int price = 1000;
    static final int roundTripPrice = 1800;

    public Ticket(int buy, int roundTrip){
        this.buy = buy;
        this.roundTrip = roundTrip;
    }

    public void calc() {
        System.out.println("Total tickets: " + buy);
        System.out.println("Round-trip: " + roundTrip);
        System.out.println("Total: " + ( roundTrip*roundTripPrice + (buy-roundTrip)*price) );
    }
}
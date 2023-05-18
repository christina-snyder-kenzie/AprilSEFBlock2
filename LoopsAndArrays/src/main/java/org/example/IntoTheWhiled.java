package org.example;

import java.util.Arrays;

public class IntoTheWhiled {
    public static void main(String[] args) {
        int number = 5;

        if (number < 10){
            System.out.println("The number is: " + number);
        }
        System.out.println("---------");
        while (number <= 10){ //while loops run continuously until
                    //the condition becomes false
            System.out.println("The number is: " + number);
            number = number + 1; //incrementation
        }

        /*
            While loops (Iterative statement) (Iteration)
                1. Initialize the variable (our starting point)
                2. while (condition) {
                    3. Do stuff
                    4. Incrementation / update
                }
         */

        //Let's count in steps of 3 from 0 to 20
            // 0, 3, 6, 9, 12, 15, 18
        int counter = 0;
        while (counter < 20){
            System.out.print(counter + ", ");
            counter = counter + 3;
        }
        System.out.println();

        //Rocket ship!
        //We want to count down from 10 to blastoff
        System.out.println("~~Initializing countdown sequence~~");
        int countdown = 10;
        while (countdown >= 0){ //stopping point
            System.out.println(countdown);
            countdown = countdown - 1;
        }

        System.out.println("BLASTOFF!!");

        //I want all the powers of 2 less than 100
            //1, 2, 4, 8, 16, 32, 64
            //0, 1, 2, 3,  4,  5,  6
        //Math.pow(2, exponent); 2 ^ exp
        int powerOf2 = 1;
        while (powerOf2 < 100){
            System.out.print(powerOf2 + " ");
            powerOf2 = powerOf2 * 2;
        }
        System.out.println();

        int exponent = 0;
        while (Math.pow(2, exponent ) < 100){
            System.out.print((int) Math.pow(2, exponent) + " ");
            exponent += 1; //exponent = exponent + 1;
        }
        System.out.println();

        //could we double a penny every day for 31 days?
        long numPennies = 1;
        int dayNumber = 1;
        while (dayNumber <= 31){
            numPennies *= 2; //numPennies = numPennies * 2
            dayNumber += 1;
        }
        System.out.println("After 31 days, you have " + numPennies + " pennies");
        System.out.println("After 31 days, you have $" + numPennies / 100.0 + " dollars");


    } //ends the main method
} //ends the class/file

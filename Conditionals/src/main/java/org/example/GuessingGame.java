package org.example;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        //Guessing Game:

        //I want it to be interactive (Use a scanner)
        //I want the computer to make a secret number
        //The user should guess
        //The computer should determine if its right, too high, or too low
        //if they get it wrong, they get to guess again
        //if it's still wrong, they get one more try


        System.out.println("Welcome to my guessing game!!");
        boolean hasRightAnswer = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("You get to decide your range of numbers");
        System.out.println("Enter the smallest number you'd like to guess");
        int small = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the biggest number you'd like to guess");
        int big = Integer.parseInt(scan.nextLine());
        //TODO: Make the number random
        int secretNumber = (int) (Math.random() * (big - small + 1) + small);
        /*
            random numbers
            Math.random() -> generates a double on the range [0, 1)
                0 is included
                1 is excluded
                    [0, .9999999]

                I want numbers on the range, [25, 35)

                [a, b)
                    Math.random() * (b - a) + a;
                [25, 35) (exclusive)
                    Math.random() * (35 - 25) + 25;
                    [25, 34.999999] (inclusive)

                    (int) ( Math.random() * (35 - 25) + 25 ) ;
                        [25, 34] (we lose out on the 35)

                int version = (int) (doubleNumber);
                    forces truncation


                when we want ints, on the range, [a, b] inclusive!
                    New formula!
                (int) (Math.random() * (b - a + 1) + a) ;

                [25, 35]
                    (int) (Math.random() * (35 - 25 + 1) + 25);

                        (int) (Math.random() * 11 + 25);




         */

        System.out.println("Enter a number between " + small + " and " + big);
        int guessNumber = Integer.parseInt(scan.nextLine()); //scan.nextInt()
        if (guessNumber == secretNumber){
            System.out.println("WOW You got it on the first try!");
            hasRightAnswer = true;
        } else if (guessNumber < secretNumber){
            System.out.println("Too low! Guess again");
        } else {
            System.out.println("Too high! Guess again");
        }

        //second guess: We only want it if they DONT have the right answer
        if ( !hasRightAnswer ){ //same as: hasRightAnswer == false
            System.out.println("Second try: Enter a number between " + small + " and " + big);
            guessNumber = Integer.parseInt(scan.nextLine());
            if (guessNumber == secretNumber){
                System.out.println("You got it! Second try- not bad.");
                hasRightAnswer = true;
            } else if (guessNumber < secretNumber){
                System.out.println("Too low! Try one more time");
            } else {
                System.out.println("Too high! Try one more time");
            }
        }

        //third guess:
        if (!hasRightAnswer){
            System.out.println("Do you want a hint? (yes/no)");
            String response = scan.nextLine();
            if (response.equals("yes")){
                if (secretNumber % 2 == 0){
                    System.out.println("The secret number is even!");
                } else {
                    System.out.println("The secret number is odd!");
                }
            }
            System.out.println("Last try! Enter a number between " + small + " and " + big);
            //TODO: Tell them if it's odd or even
            guessNumber = Integer.parseInt(scan.nextLine());
            if (guessNumber == secretNumber){
                System.out.println("WOOHOO You did it. Three tries, but okay...");
            } else {
                System.out.println("Bummber, the secret number is: " + secretNumber);
            }
        }

    } //ends main method
} //ends the class/file

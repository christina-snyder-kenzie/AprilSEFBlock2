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
        //TODO: Make the number random
        int secretNumber = 7;
        System.out.println("Enter a number between 1 and 10");
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
            System.out.println("Second try: Enter a number between 1 and 10");
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
            System.out.println("Last try! Enter a number between 1 and 10");
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

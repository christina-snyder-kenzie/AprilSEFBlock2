package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VariableReview {
    public static void Exercise1(int number){
        //instructions
        //int otherNumber = 7;
        //write your code here
        if (number > 10 && number < 20){
            System.out.printf("between");
        }
        //if (number == 7){
          //  System.out.println("Lucky 7");
        //}
    }

    public static void lifetimeSupply(){
        //instructions
        //inputs require the scanner
        //variables
        int numSnacks = 0;
        //more instructions
    }

    public static void main(String[] args) {
        //GOAL: Ask if they like dogs? And retreive y or n (y or Y)

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you like dogs? (y/Y or n/N)");
        String answer = scan.nextLine();

        if (answer.equalsIgnoreCase("y") ){
            System.out.println("AWESOME DOGS ARE AWESOME");
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("i guess that's fine...");
        } else {
            System.out.println("That's not an answer!");
        }

        if (answer.equals("yes") || answer.equals("no")){
            if (answer.equals("yes")){
                //do thing 1
            } else {
                //do thing 2
            }
        }

    }
}

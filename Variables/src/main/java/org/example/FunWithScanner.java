package org.example;

import java.util.Scanner;

public class FunWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = scan.nextLine();

        System.out.println("Hello, " + name + "!!");
        System.out.println("What is your favorite food?");

        String favFood = scan.nextLine();

        System.out.println("YUM! I Love " + favFood);

        //TASK: ASk for your favorite movie

        System.out.println("What is your favorite movie?");
        String favMovie = scan.nextLine();
        System.out.println("Cool, I like " + favMovie + " too!");


        //TASK: Calculate num siblings based on brothers and sisters (and niblings)
        System.out.println("HOw many brothers do you have?");
        String brothers = scan.nextLine();
        System.out.println("How many sisters do you have?");
        String sisters = scan.nextLine();

        int numBrothers = Integer.valueOf(brothers);
        int numSisters = Integer.parseInt(sisters);

        System.out.println("Wow! You have " + (numBrothers + numSisters) + " siblings!");

        //TASK: Calculate how many pets someone has
            //ask for number of dogs
            //ask for number of cats
            //ask for number of idk a different animal?

    }


}

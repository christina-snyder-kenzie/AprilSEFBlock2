package org.example;

import java.sql.SQLOutput;

public class IfStatementPractice {
    public static void main(String[] args) {
        int number = 17;

        if (number == 0){
            System.out.println("ZERO");
        } else if (number >= 0) {
            System.out.println("POSITIVE");
        } else {
            System.out.println("NEGATIVE");
        }

        /*
            if (condition1){
                //do thing 1
            } else if (condition2){
                //do thing 2
            } else {
                //do the default thing
            }
            //END
         */


        //sequential if statements
        if (number == 0){
            System.out.println("ZERO");
        }

        if (number >= 0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        //

        //even means divisible by 2
        if (number % 2 == 0){
            System.out.println("The number is EVEN");
        } else {
            System.out.println("The number is ODD");
        }

        //positive and even
        //positive and odd
        //negative and even
        //negative and odd

        //how do we combine boolean expressions?
            //and vs or
            //and - && - both conditions need to be true
            //or - || - only one condition needs to be true

        // cond1 && cond2
        //i'm offering cake and brownies
            //picky toddler- both (i want cake AND brownies)
                //if I don't get both, I'm v sad
            //chill toddler- either (I'm fine with cake OR brownies)
                //as long as I get one, I'm happy

        if (number > 0 && number % 2 == 0){
            System.out.println("The number is Positive and EVEN");
        } else if (number > 0 && number % 2 == 1){
            System.out.println("The number is Positive and ODD");
        } else if (number < 0 && number % 2 == 0){
            System.out.println("The number is Negative and EVEN");
        } else if (number < 0 && number % 2 == -1){
            System.out.println("The number is Negative and ODD");
        } else {
            System.out.println("SHOULDNT GET HERE");
        }

        //how do we code in between?
        //I want to know if my number is a teen
            //between 13 and 19
            // >= 13
            // <= 19
        if ((number >= 13 && number <= 19) || (number <= -13 && number >= -19)){
            System.out.println("Teen number");
        } else {
            System.out.println("Not a teen!");
        }

        int windSpeed = 142;
        if (windSpeed > 155){
            System.out.println("Oh no! A catastrophic category 5 is here!");
        } else if (windSpeed >= 131 && windSpeed<= 155){
            System.out.println("Take cover! Cat 4 coming through");
        } else if (windSpeed >= 111){ //I don't need a top end-
                                    // it would have already been caught
            System.out.println("Category 3- womp womp");
        } else if (windSpeed >= 96){
            System.out.println("Look out! 100 mph winds- Cat 2!");
        } else if (windSpeed >= 74){
            System.out.println("Hurricane Party! Cat 1!");
        } else {
            System.out.println("Heavy rain- no hurricane");
        }
        //END

    } //ends main method
} //enc the class/file

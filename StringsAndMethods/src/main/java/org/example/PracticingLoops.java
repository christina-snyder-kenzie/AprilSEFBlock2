package org.example;

import java.util.Arrays;

public class PracticingLoops {
    public static void main(String[] args) {
        //Collect any number that has an 8

        int[] numbers = {12, 782, 33, 38, 888, 306};

        //how do we know if a number has an 8?

//        int digit;
//        if (digit == 8){
//
//        }

        //mod 10 divide 10
        //int rightMostDigit = number % 10;
        //number = number / 10;

        //continue until you hit zero

        int numberToTest = 792;
        int saved = numberToTest;
        boolean foundThe8 = false;
        while (numberToTest > 0){
            int digit = numberToTest % 10;
            if (digit == 8){
                foundThe8 = true;
            }
            numberToTest = numberToTest / 10;
        }
        System.out.println(saved + " has an 8: " + foundThe8);

        int counter = 0;
        for (int i= 0; i < numbers.length; i++){
            int currentNumber = numbers[i];
            boolean foundIt = false;
            while (currentNumber > 0){
                int digit = currentNumber % 10;
                if (digit == 8){
                    foundIt = true;
                }
                currentNumber /= 10;
            }
            if (foundIt){
                System.out.print(numbers[i] + " ");
                counter++;
            }
        }
        System.out.println("\nThere are " + counter + " numbers with 8's");

        int[] only8s = new int[counter];
        int index = 0;
        for (int i= 0; i < numbers.length; i++){
            int currentNumber = numbers[i];

            boolean foundIt = false;
            while (currentNumber > 0){
                int digit = currentNumber % 10;
                if (digit == 8){
                    foundIt = true;
                }
                currentNumber /= 10;
            }
            if (foundIt){
                System.out.print(numbers[i] + " ");
                only8s[index] = numbers[i];
                index++;
            }
        }
        System.out.println("\n" + Arrays.toString(only8s));

        String version = 788 + "";
        for (int i = 0; i < version.length() - 1; i++){
            char me = version.charAt(i);
            char neighbor = version.charAt(i + 1);
            if ( me == neighbor){
                System.out.println("WE have a match!");
            }
        }


        //init basket
        int sum = 0;
        //loop
        for (int x : numbers) {
            //update the basket
            sum += x; //sum = sum + x;
        }




        // 16
            // 16 % 2 -> 0
            //16 / 2 -> 8

            //17 / 2-> 8

        //16 / 4 -> 4
        //16 % 4 -> 0

    }
}

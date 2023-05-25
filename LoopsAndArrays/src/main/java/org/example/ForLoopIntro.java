package org.example;

import java.util.Arrays;

public class ForLoopIntro {
    public static void main(String[] args) {
        /*
            for (initialization; condition; incrementation){
                do stuff
            }
         */

        //I want to count from 1 to 100 in steps of 6
        for (int counter = 1; counter <= 100; counter = counter + 6) {
            System.out.print(counter + " ");
        }
        System.out.println();

        System.out.println("Initialzing countdown sequence");
        for (int countDown = 10; countDown > 0; countDown--){
            System.out.println(countDown);
        }
        System.out.println("BLASTOFF!");

        int[] numbers = {7, 5, 1, 3, 8, 2};

        //GOAL: Print out the array with a for loop
        for (int index = 0; index < numbers.length; index++){
            int currentValue = numbers[index];
            System.out.print(currentValue + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++){
            int currentValue = numbers[i];
            if (currentValue <= 3){
                System.out.print(currentValue + " ");
            }
        }
        System.out.println();

        //What If I want to COUNT the numbers less = 3?
        /*
            init counter
            loop
                if statement (determines what we count)
                    counter++;
            @end-> counter has the answer!
         */
        int counter = 0;
        for (int i = 0; i < numbers.length; i++){
            int curr = numbers[i];
            if (curr <= 3){
                counter++;
            }
        }
        System.out.println("Number less or equal to 3: " + counter);

        //Let's calculate an AVERAGE
            //sum / number of numbers
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("AVERAGE: " + (sum / numbers.length));

        //Now I want to count adjacent duplicates
        int dupCounter = 0;

        int[] doubles = {8, 8, 5, 2, 2, 7, 4, 4, 9};
        for (int i = 0; i < doubles.length - 1; i++){
            int mainDude = doubles[i];
            int neighbor = doubles[i + 1];
            if (mainDude == neighbor){
                dupCounter++;
            }
        }
        System.out.println("I have " + dupCounter + " adjacent duplicates");

        int[] sandwiches = {1, 7, 1, 2, 4, 2, 5, 8, 3, 8};

        //We want to make a new array with only CERTAIN VALUES from my old array
        //{7, 5, 1, 3, 8, 2, -2};

            // New array with numbers less than or equal to 3
                // {1, 3, 2, -2}

        //COUNT whatever we're collecting
        //Make a new array of the RIGHT SIZE
        //Fill that new array with the RIGHT DATA
            //so we need different indexes for each array

        int countLess3 = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] <= 3){
                countLess3++;
            }
        }

        int[] smallNumbers = new int[countLess3];

        /*
        numbers = {7, 5, 1, 3, 8, 2}

        smallNumbers = {0,  0,  0}
         */

        int smallIndex = 0;
        for (int i = 0; i < numbers.length; i++){
            int currNumber = numbers[i];
            if (currNumber <= 3){
                //we want to put currNumber INTO smallNumbers
                smallNumbers[smallIndex] = currNumber;
                smallIndex++;
            }
        }

        System.out.println(Arrays.toString(smallNumbers));


    }
}

package org.example;

public class LoopingOverArrays {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 5, 1, 3, 8};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println("------------");
        int spot = 0;
        while (spot < numbers.length){
            System.out.println(numbers[spot]);
            spot += 1;
        }

        /*
        In general, how to loop over an array:
            int index = 0;
            while (index < arr.length){
                do something with arr[index]
                index = index + 1;
            }
         */

        //NEW PROBLEM: I want to only print out numbers less than or equal to 5
        int index = 0;
        while (index < numbers.length){
            int currentNumber = numbers[index];
            if (currentNumber <= 5){
                System.out.print(currentNumber + " ");
            }
            index += 1;
        }
        System.out.println();

        //GOAL: ONly print out odd numbers:
        System.out.println("ODD NUMBERS ONLY BELOW:");
        int i = 0;
        while (i < numbers.length){
            int curr = numbers[i];
            if (curr % 2 != 0){
                System.out.print(curr + " ");
            }
            i++; //i += 1 // i = i + 1;
        }
        System.out.println();

        //Let's go BACKWARDS:
        //starting points -> length - 1
        //stopping points -> 0 (include it)
        int backwardsIndex = numbers.length - 1;
        while (backwardsIndex >= 0){
            System.out.print(numbers[backwardsIndex] + " ");
            backwardsIndex--; // backwardsIndex -= 1;
        }
        System.out.println();

    } //ends the main method
} //ends the class/file

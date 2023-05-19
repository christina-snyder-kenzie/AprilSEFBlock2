package org.example;

import java.util.Arrays;

public class ArrayAlgorithms {
    public static void main(String[] args) {
        //Algorithm : a fancy way of saying a sequence of steps to solve a problem
            //inputs and outputs

        //Fill up an array
            //Populating an array
        //GOAL: I want 10 random numbers between 1 and 100
            // (int) (Math.random() * 100 + 1);

        int[] numbers = new int[10];
        System.out.println(Arrays.toString(numbers));
            //numbers[index] = newValue;
        int index = 0;
        while (index < numbers.length){
            numbers[index] = (int) (Math.random() * 100 + 1);
            index++;
        }
        System.out.println(Arrays.toString(numbers));

        //summing (sum = adding things together)
            //Collecting
            //Aggregating
            //Accumulating
        int basket = 0;
        int aisleNumber = 0;
        while (aisleNumber < numbers.length){
            int currNumber = numbers[aisleNumber];
            basket = basket + currNumber; // basket += currNumber;
            //basket += numbers[aisleNumber];
            aisleNumber++;
        }
        System.out.println("SUM: " + basket);

        //what if I only want to add the numbers greater than 50?
        basket = 0;
        aisleNumber = 0;
        while (aisleNumber < numbers.length){
            int currNumber = numbers[aisleNumber];
            if (currNumber > 50){
                basket += currNumber;
            }
            aisleNumber++;
        }
        System.out.println("SUM > 50: " +  basket);

        //COUNTING
        int i = 0;
        int counter = 0;
        while ( i < numbers.length){
            int curr = numbers[i];
            if (curr > 50){ //determines WHAT YOU count
                counter = counter + 1; //counter++;
            } //ends my if statement
            i++; //i = i + 1;
        } //ends my while loop
        System.out.println("# > 50: " + counter);

        //We're gonna try to find the Maximum (the biggest)
        int stickyNoteMax = numbers[0];
        i = 0;
        while (i < numbers.length){
            int currNumber = numbers[i];
            if (currNumber > stickyNoteMax){
                stickyNoteMax = currNumber;
            }
            i++;
        }
        System.out.println("MAX: " + stickyNoteMax);

        int smallest = numbers[0];
        i = 0;
        while (i < numbers.length){
            if (numbers[i] < smallest){
                smallest = numbers[i];
            }
            i++;
        }
        System.out.println("MIN: " + smallest);
    } // ends the main method
} //ends the file/class

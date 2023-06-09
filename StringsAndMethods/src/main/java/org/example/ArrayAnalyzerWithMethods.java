package org.example;

import java.util.Arrays;

public class ArrayAnalyzerWithMethods {

//    The largest number in the array
    public static int findLargestNumber(int[] numbers) {
        int largestNumber = numbers[0];  // what if they're all negative???
        for (int i = 1; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber > largestNumber) {
                largestNumber = currentNumber;
            }
        }
        return largestNumber;
    }
//    The smallest number in the array
    public static int findSmallestNumber(int[] integers) {
        int smallestNumber = integers[0];
        for (int currentInteger : integers) {
            if (currentInteger < smallestNumber) {
                smallestNumber = currentInteger;
            }
        }
        return smallestNumber;
    }

    //    The average value of all the numbers in the array (the sum of all values divided by the number of values).
//    Hint: This should be a double
    public static double findAverage(int[] array) {
        // in order to find average, we need to SUM then divide by the total numbers
        int sum = findSum(array);

        double average = (double) sum / array.length;
        return average;
       // return findSum(array) / (double) array.length;
    }

//    The sum of all the numbers in the array
    public static int findSum(int[] numbers) {
        // initialize a bucket
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }

        return sum;
    }

//    A new array containing all even numbers in the array
    public static int[] findEvenNumbers(int[] numbers) {
        int counter = 0;
        for(int number : numbers) {
            if (number % 2 == 0) {
                counter += 1;
            }
        }

        int[] evenNumbers = new int[counter];
        int evenNumbersIndex = 0;
        for(int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenNumbersIndex++] = number;
            }
        }

        return evenNumbers;
    }
//    A new array containing all odd numbers in the array
    public static int[] findOddNumbers(int[] numbers) {
        int counter = 0;
        for(int number : numbers) {
            if (number % 2 != 0) {
                counter += 1;
            }
        }

        int[] oddNumbers = new int[counter];
        int oddNumbersIndex = 0;
        for(int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers[oddNumbersIndex] = number;
                oddNumbersIndex += 1;
            }
        }

        return oddNumbers;
    }

    public static int findOccurrences(int[] numbers, int divisor) {
        int counter = 0;
        for(int number : numbers) {
            if (number % divisor == 0) {
                counter += 1;
            }
        }

        return counter;
    }
//    A new array containing all numbers divisible by 8 in the array
    public static int[] findNumbersDivisbleBy8(int[] numbers) {
        int counter = findOccurrences(numbers, 8);

        int[] numbersDivisbleBy8 = new int[counter];
        int index = 0;
        for (int number : numbers) {
            if (number % 8 == 0) {
                numbersDivisbleBy8[index] = number;
                index++;
            }
        }

        return numbersDivisbleBy8;
    }

    public static int[] findDivisbleNumbers(int[] numbers, int divisor, boolean isDivisble) {

    }

    public static void arrayAnalyzer(int[] numbers) { // This curly brace
        System.out.println("****Array Analyzer Program****");
        // Write your code here
        // You can create variables to store each result, for example: int total = 0;
        int largestNumber = findLargestNumber(numbers);
        System.out.println("The largest number is: " + largestNumber);

        int smallestNumber = findSmallestNumber(numbers);
        System.out.println("The smallest number is: " + smallestNumber);

        int sum = findSum(numbers);
        System.out.println("The sum is: " + sum);

        double average = findAverage(numbers);
        System.out.println("The average is: " + average);

        int[] evenNumbers = findEvenNumbers(numbers);
        System.out.println("The even numbers are: " + Arrays.toString(evenNumbers));

        // i'm done with variables
        System.out.println("The odd numbers are: " + Arrays.toString(findOddNumbers(numbers)));

        // okay i'm back to variables...
        int[] numbersDivisbleBy8 = findNumbersDivisbleBy8(numbers);
        System.out.println("The numbers divisble by 8 are: " + Arrays.toString(numbersDivisbleBy8));



    } // This curly brace
    public static void main(String[] args) {
        int[] data = new int[]{ 469, 755, 244, 245, 758, 450, 302, 20, 712, 71, 456, 21, 398, 339, 882, 848, 179, 535, 940, 472 };
        arrayAnalyzer(data);
    }
}

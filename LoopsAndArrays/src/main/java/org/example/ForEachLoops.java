package org.example;

public class ForEachLoops {
    public static void main(String[] args) {

        int[] numbers = {7, 5, 1, 3, 8};
        for (int i = 0; i < numbers.length; i++){
            int currValue = numbers[i];
        }

        //For Each Loops (AKA the enhanced for loop)
        for (int currValue : numbers){
            System.out.println(currValue);
        }

        //In general, syntax:
            //for (dataType currentElementName : arrName) { }

        //Find the smallest:
        int min = numbers[0];
        for (int currentNumber : numbers){
            if (currentNumber < min){
                min = currentNumber;
            }
        }
        System.out.println("MIN: " + min);

        String[] animals = {"llama", "giraffe", "elefant", "penguin"};
        //How many letters are in all of the animal?
            //I want to sum the lengths of all the strings

        int total = 0;
        for (String currAnimal : animals){
            total += currAnimal.length();
        }
        System.out.println("Total: " + total);

        //How would I find the animal with the longest length?


        // {"llama", "giraffe", "penguin", "elefant"};
        //init max
        String maximal = animals[0];
        //loop
        for (String currAnimal : animals) {
            //if greater
            if (currAnimal.length() > maximal.length()){
                //update max
                maximal = currAnimal;
            }
        }
        System.out.println("LongestLengthAnimal: " + maximal);


        //init
        //while (condition)
            //do stuff
            //update

        //for (init; condition; update){
            //do stuff

        //init
        //for ( ; condition ; ){
            //do stuff
            //update





    }
}

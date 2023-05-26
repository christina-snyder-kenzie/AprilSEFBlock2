package org.example;

import java.util.Arrays;

public class AdvancedPokeProblems {
    public static void main(String[] args) {
        //Can we collect all the pokemon stronger than the average?

            //first, we just print the names stronger than the average



        //1. Get the average
            //SUM (basket problem)
            //Divide by (length?)
        //2. Print the pokemon stronger than average
            //Comparison -> if statement
            //Look at everyone -> for loop
        //3. Catch em all-> collect in a new array
        int[] attackValues = {88,        44,       23,      95,         47,     12,    102};
        String[] pokeNames = {"pika", "bulba", "squirt", "caterpie", "flora", "char", "rock"};
        String[] elementTypes = {"electric", "grass", "water", "bug", "grass", "fire", "rock"};

        double sum = 0;
        for (int i = 0; i < attackValues.length; i++){
            int currValue = attackValues[i];
            sum = sum + currValue;

            //sum += attackValues[i];
        }
        double average = sum / attackValues.length;
        System.out.println("Average: " + average);

        int counter = 0;
        for (int i = 0; i < attackValues.length; i++){
            int currAttack = attackValues[i];
            if (currAttack > average){
                counter++;
                String corresponding = pokeNames[i];
                System.out.println(corresponding + " has an attack of " + currAttack + " and a type of " + elementTypes[i]);
            }
        }

        //I want an array of the strongest pokemon
            //Which means: I need to make one, and I need a size

        //1. We need to count!
        String[] strongest = new String[counter];

        int strongIndex = 0;
        for (int i = 0; i < attackValues.length; i++){
            int currAttack = attackValues[i];
            if (currAttack > average){
                strongest[strongIndex] = pokeNames[i] + "_" + elementTypes[i];
                strongIndex++;
            }
        }
        System.out.println(Arrays.toString(strongest));

        String test = "pika,caterpie,rock";
        String[] names = test.split(",");


    }
}

package org.example;

public class QuizOnData {
    public static void main(String[] args) {
        int a = 8 / 2; // 4
        int b = 7 / 2; // 3 (truncation is happening)
        double c = 7.0 / 2; // 3.5
        double d = 7 / 2.0; // 3.5
        double e = 7; // 7.0 promoted
            //promotion automatically happens when an int is assigned to a double
            //it adds the .0
        double f = 7 / 2; // 3.0
            // double f = 3;

        //int x = 3.5; ERROR

        //what if I want to actually chop off the decimal?
        //Can I force it to do that?
            //yes, we can round
            //but how to truncate?
        //cast
        //a cast is a forcible change of data type
        int y = (int) 3.5;

        double g = (double) 7 / 2;
            //double g = 7.0 / 2;

        //PEMDAS
            //Parentheses
            //Casting
            //Exponents
            //Multiplication/Division/Modulus
            //Addition/Subtraction

        int z = 2 * (1 + 2 * 3); //14

        String word = "hello";
        //concatenation (fancy glue together)
        String h = 5 + "hello"; //5hello
        String i = "hello" + 5; //hello5

        String j = 2 + 5 + "hello"; //7hello
            //j = 7 + "hello"
            //j = 7hello
        String k = "hello" + 2 + 5; //hello25
            //k = "hello2" + 5;
            //k = hello25

        //context clues
        // + sign sometimes means math (addition) sometimes means concatenation

        String l = (2 + 3) + 5 + "hello"; //10hello
        String m = "hello" + (2 + 3) + 5; //hello55

        String hello = "good morning how are you";
        System.out.println("hello");

        char firstInitial = 'C';
        char secondIntial = 'E';


    } //ends the main method
} //ends the class/file

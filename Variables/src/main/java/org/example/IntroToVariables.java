package org.example;

public class IntroToVariables {
    public static void main(String[] args) {
        System.out.println(16 / 2);

        System.out.println(15 / 2); //truncation
            //truncation means chop off the decimal (no rounding)

        System.out.println(15.0 / 2);

        //data type
            //data = a piece of information
            //type = the KIND of information
        //a datatype describes the kind of value you have

        /*
            Primitive data types:
                int -> whole numbers (like integer)
                double -> numbers with decimals (double the memory of a float for number storage)
                    float -> numbers with decimals (short for floating point number)
                long, short, byte -> whole numbers (but we like never use them...)
                    long -> like int, but bigger (it can hold bigger numbers)
                    short -> like int, but smaller (it has a smaller range of numbers)
                    byte -> exactly 8 bits (use this for bit strings)
                boolean -> yes / no (true / false)
                char -> single letters (short for character)
            Object data types:
                String -> text, words, phrases
                Scanner -> we use for user input (reading what you type on the keyboard)
         */

        //statically typed vs dynamically typed
            //static typing means each variable has a data type and it is stuck as that type forever

        //a variable is a way to store information (or remember something)

        //how do we make variables?
        //general syntax:
            //syntax: grammar rules of coding
        //dataType variableName = value ;
        int numMugs = 2;
        System.out.println(numMugs);
        System.out.println("numMugs");
        double coffeeRating = 4.8;
        System.out.println(coffeeRating);
        System.out.println("My \"coffee\" was " + coffeeRating + "/5");

        /*
        Variable Names

        Rules (requirements you must follow)
        1. NO spaces
        2. NO reserved word (keyword, an orange word)
        3. AlphaNumeric (plus the underscore)
            alpha = letters
            numeric = numbers
        4. Must start with a letter (not a number)

        Conventions (hard suggestions that all programmers have agreed on)
        1. Descriptive
        2. Start with a lower case letter
            (file names start with a capital letter)
        3. Use camelCase to deal with no spaces
            aComplicatedVariableName
            a_complicated_variable_name
         */
        int NumDogs = 3; //does not follow convention # 2, but is still following the rules
        int numDogs = 3;

        //to see if a number is divisible by something else, see if the mod is zero
        System.out.println(numDogs % 2);

        // + - * / %

        //2 to the 5th
        //2^5 (math syntax, not java syntax)

        //Math.pow(base, exponent) (base ^ exp)
        System.out.println(Math.pow(2, 5));

        //Math.sqrt(number) (square root)
        System.out.println(Math.sqrt(144));
        System.out.println(Math.sqrt(145));

        //Math.abs(number) (absolute value)
        System.out.println(Math.abs(-15));
        System.out.println(-15);

        //Math.round(number) (rounds to the nearest whole number)
        System.out.println(Math.round(4.87));

        //Math.random() (gives you a random number between 0 and 1)
        System.out.println(Math.random());
    }

}





















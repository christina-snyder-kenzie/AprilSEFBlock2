package org.example;

import java.lang.reflect.Method;
import java.util.Arrays;

public class StringReIntro {
    public static void main(String[] args) throws InterruptedException {
        String sentence = "Do or do not, there is no try";

        int numLetters = sentence.length();

        //Strings get methods because they are objects
            //Primitive types do not get methods :(

        //"call" we "call" methods
            //variable.methodName(stuff);
        //stuff is a parameter (or argument)

        String firstBit = sentence.substring(0, 5);

        //overloaded = means same method name, different parameters

        String lastChunk = sentence.substring(2);

        char lastLetter = sentence.charAt(sentence.length() - 1);

        int position = sentence.indexOf("D"); // 0
        int position2 = sentence.indexOf("or"); // 3
        int position3 = sentence.indexOf("o"); // 1
        int position4 = sentence.indexOf("maybe"); // -1
/*
        System.out.println(sentence);
        sentence = sentence.substring(3).substring(5);
        System.out.println(sentence);
*/
        //replace method
            //.replace(oldStr, newString)
        String crazyEights = sentence.replace("o", "8");
        System.out.println("8's: " + crazyEights);
        System.out.println("sentence: " + sentence);

        String LowerCaseD = sentence.replace("D", "d");
        System.out.println(LowerCaseD);

        String noComma = sentence.replace("," , "");
        String noSpaces = noComma.replace(" ", "");
        System.out.println(noSpaces);

        // .toCharArray()

        char[] letters = sentence.toCharArray();
        System.out.println(Arrays.toString(letters));
        char firstLetter = letters[0];

        // .split(delimiter)
            //delimiter = fancy for separator

        //.split chops up a string around the delimiter and returns and array of strings
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        for (String word : words){
            System.out.println(word);
           // Thread.sleep(2000);
        }


        String[] wonky = sentence.split("o");
        for (String s : wonky){
            System.out.println(s);
        }


        //for each loops
        //for (dataType currElement : arrName) { use currElement in the loop }

        String fullName = "Christina Elvira Michelle Elizabeth Snyder";
                        //{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12...}
        //GOAL: to find our initials
        //String initials = "CES";

        int positionOfSpace = fullName.indexOf(" ");
        int positionOfSecondInitial = positionOfSpace + 1;

        char second = fullName.charAt(positionOfSecondInitial);
        String secondI = fullName.substring(positionOfSecondInitial, positionOfSecondInitial + 1);

        String[] names = fullName.split(" ");
        System.out.println(Arrays.toString(names));

        /*
        char firstInitial = names[0].charAt(0);
        char secondInitial = names[1].charAt(0);
        char thirdInitial = names[2].charAt(0);
         */

        String basket = "";
        for (String currentName : names){
            char currentInitial = currentName.charAt(0);
            System.out.println(currentInitial);
            basket = basket + currentInitial + ".";
        }
        System.out.println(basket);



    //sentence = "Do or do not, there is no try";

        //GOAL: I want to count how many o's there are (5?)
            //We need to look at each letter:
                //for (int i = 0; i < str.length(); i++) { String letter = str.substring(i, i + 1); }
                //for (int i = 0; i < str.length(); i++) { char letter = str.charAt(i); }
                //for (char letter : str.toCharArray() ) { }

                //char letter;
                    //if (letter == 'o') { }

                //String letter;
                    //if (letter.equals("o")) { }
                    //if (letter.equalsIgnoreCase("o")) { }

        //initialize a counter
        int counter = 0;
        //loop over the String
        for (int i = 0; i < sentence.length(); i++) {
            String letter = sentence.substring(i, i + 1);
            //if we have an o
            if (letter.equals("o")) {
                //counter++;
                counter++;
            }
        }
        System.out.println("I have " + counter + " o's in my sentence");

        counter = 0;
        for (char letter : sentence.toCharArray()){
            if (letter == 'o'){
                counter++;
            }
        }
        System.out.println("I have " + counter + " o's in my sentence");

        //mod 10 divide 10
            //7512 % 10 -> 2
            //7512 / 10 -> 751

            //751 % 10 -> 1
            //751 / 10 -> 75

            //75 % 10 -> 5
            //75 / 10 -> 7

            //7 % 10 -> 7
            //7 / 10 -> 0

        //to see all the digits in a number:
        int number = 7512;
        while (number > 0){
            System.out.println(number % 10);
            number = number / 10;
        }

        System.out.println(MethodIntro.detSign(-17));

    }
}










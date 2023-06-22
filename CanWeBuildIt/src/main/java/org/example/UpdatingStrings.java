package org.example;

import java.util.Arrays;

public class UpdatingStrings {
    public static void main(String[] args) {
        String str = "hello!";

        //method(str, "Christina") -> hello, Christina!
        //method("goodbye?", "sally") -> goodbye, sally?

        str = greetName(str, "Christina");
        System.out.println(str);

        StringBuilder strBuild = new StringBuilder("Starting String");
        System.out.println(strBuild.length());
        System.out.println(strBuild.substring(0, 2));
        System.out.println(strBuild.indexOf("Start"));
        strBuild.append(", ");
        strBuild.append("More Stuff");
        System.out.println(strBuild);

        StringBuilder builderGreeting = new StringBuilder("hello!");
        //same goal: insert a name before the last character
        greetName(builderGreeting, "Christina");

        System.out.println(builderGreeting);

        StringBuilder aaaa = crazyConcatWithBuilder(51);
        System.out.println(aaaa);

        StringBuilder sentence = new StringBuilder("My band rocks!");
        //.delete(starting, stopping);
        sentence.delete(sentence.length() - 1, sentence.length());
        System.out.println(sentence);

        //replace with STRINGS
        //str = str.replace(oldThing, newThing);

        //replace with StringBUILDER
        //builder.replace(startingPoint, stoppingPoint, newThing);
        sentence.replace(0, 2, "The");
        System.out.println(sentence);

        sentence.append("!");
        sentence.replace(sentence.length() - 1, sentence.length(), "......");
        System.out.println(sentence);

        String wordToGetRidOf = "rocks";
        String replacement = "jams";
        int startingPoint = sentence.indexOf(wordToGetRidOf);
        int stoppingPoint = startingPoint + wordToGetRidOf.length();
        sentence.replace(startingPoint, stoppingPoint, replacement);
        System.out.println(sentence);

        //GOAL: replace all . with !
        //Process: use a while to keep going while there are still .
        while (sentence.indexOf(".") >= 0){
            sentence.replace(sentence.indexOf("."), sentence.indexOf(".") + 1, "!");
        }
        System.out.println(sentence);

        String[] text = {"abc", "123", "xyz"};
        String textString = Arrays.toString(text);
        System.out.println(textString);

        String starString = String.join("***", text);
        System.out.println(starString);

        String emptyDelim = String.join("", text);
        System.out.println(emptyDelim);

        int[] numbers = {7, 5, 1, 3};
        //String fancyNumbers = String.join("*", numbers);

        System.out.println(joinInts("*", new int[]{7}));
        int[] toTest = new int[]{7, 5};
        System.out.println(joinInts("*", toTest));
        System.out.println(joinInts("*", new int[]{7, 5, 1, 3}));
    } //ends my main method

    //GOAL: make our own Join method that works with ints!
        //joinInts("*", {7, 5, 1, 3}) -> 7*5*1*3
        //joinInts("*", {7}) -> 7
        //joinInts("*", {7, 5}) -> 7 and 5
    public static String joinInts(String delim, int[] numbers){
        StringBuilder toReturn = new StringBuilder();
        if (numbers.length == 1){
            toReturn.append(numbers[0]);
        } else if (numbers.length == 2){
            toReturn.append(numbers[0]);
            toReturn.append(" and ");
            toReturn.append(numbers[1]);
        } else {
            for (int i = 0; i < numbers.length; i++){
                toReturn.append(numbers[i]);
                if (numbers.length - 1 != i) {
                    toReturn.append(delim);
                }
            }
        }
        return toReturn.toString();
    }


    public static StringBuilder crazyConcatWithBuilder(int x){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++){
            sb.append("a");
        }
        return sb;
    }
    public static void greetName(StringBuilder greeting, String name){
        greeting.insert(greeting.length() - 1, ", " + name);
    }

    public static String crazyConcat(int x){
        String toReturn = "";
        for (int i = 0; i < x; i++){
            toReturn += "a";
        }
        return toReturn;
    }

    public static String greetName(String greeting, String name){
        String firstBit = greeting.substring(0, greeting.length() - 1);
        String lastChar = greeting.substring(greeting.length() - 1);
        greeting = firstBit + ", " + name + lastChar;
        return greeting;
    }

}

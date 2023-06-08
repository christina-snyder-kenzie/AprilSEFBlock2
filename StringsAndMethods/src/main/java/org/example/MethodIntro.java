package org.example;

import java.util.Arrays;

public class MethodIntro {

    //METHODS CAN GO HERE

    public static void main(String[] args) {
        double answer = Math.pow(2, 5);
        // ^^ is a static method (no object needed)
        //Static methods are attached to classes, rather than objects

        String str = "hello, world";
        String piece = str.substring(0, 5);
        //an instance method requires an object to act upon

        //a method is a reusable, labeled block of code

        String result = detSign(-7);
        System.out.println(result);

        String sentence = "The   flowers   are        beautiful  today";
        System.out.println("Num words: " + wordCount(sentence));

        String text = "rice,beans,yuca,plantain";
        String[] data = text.split(",");

        String[] words = collectRealWords(sentence);
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(sentence.split(" ")));

        System.out.println(countLs(sentence));
        System.out.println(countAnyLetter(sentence, 'l'));
        System.out.println(countAnyLetter(sentence, "l"));
    } //ends my main method

    //GOAL: counting ANY letter
    //inputs -> String to look through
    //          The letter to look FOR (to be char or String?)
    //outputs -> int (we're still counting)
    public static int countAnyLetter(String str, char letter){
        int count = 0;
        for (char l : str.toCharArray()){
            if (l == letter){
                count++;
            }
        }
        return count;
    }

    public static int countAnyLetter(String str, String letter){
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.substring(i, i + 1).equals(letter)){
                counter++;
            }
        }
        return counter;
    }


    //GOAL: Count how many 'l's are in a string
    //inputs -> String
    //outputs -> int (we're counting!)
    //methodName -> countLs

    public static int countLs(String inputString){
        //init counter
        int counter = 0;
        //loop
        for (char letter : inputString.toCharArray()) {
            //if statement
            if (letter == 'l') {
                //counter++
                counter++;
            }
        }
        return counter;
/*
        String withoutLs = inputString.replace("l", "");
        int missingLetters = inputString.length() - withoutLs.length();
        return missingLetters;
 */
    }






    //GOAL: I want to collect real words out of a string with extra spacing
        //I want us to return the array of only real words
        //count
        //make our new array
        //fill it up

    //inputs -> a string with extra spaces
    //outputs-> an array with only words

    public static String[] collectRealWords(String phrase){
        int numberOfWords = wordCount(phrase);

        String[] realWords = new String[numberOfWords];

        //we need some data to fill up with!
        //this could be a word or an empty String
        String[] couldBeWords = phrase.split(" ");

        //we need a special index for realWords
        int specialIndex = 0;

        for (String potentialWord : couldBeWords){
            if (potentialWord.length() != 0){
                realWords[specialIndex++] = potentialWord;
            }
        }
        return realWords;
    }


    //GOAL: WordCount: Given  a string, determine how many words are in that string
    //inputs: String
    //outputs: int
    //the work: length/count (get a number)
        //split! to get the words
    public static int wordCount(String sentence){
        String[] words = sentence.split(" ");
        //return words.length;

        int counter = 0;
        for (String word : words){
            if (word.length() > 0){
                counter++;
            } //ends if statement
        } //ends loop
        return counter;
    }//ends the method



    //METHODS CAN ALSO GO HERE
    //method signatures look like this:
    //public static returnDataType methodName(dt1 param1, dt2 param2, etc) { }

    //GOAL: Given a number, determine if it is positive or negative or zero
    //returnDataType: String
    //methodName: detSign
    //parameters: int number

    public static String detSign(int number) {
        if (number > 0){
            return "Positive";
        } else if (number < 0){
            return "Negative";
        } else {
            return "Zero";
        }
    }

} //ends my class/file

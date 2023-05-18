package org.example;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        double monday = 78;
        double tuesday = 82;
        double wednesday = 88;
        double thursday = 65;
        double friday = 72.2;

        //arrays: collection of data
            //we can store more than one thing in a single variable

        double[] temperatures = { 78 , 82 , 88 , 65 , 72.2 };

        //in general, to make an array:
            //option 1:
                //dataType[] arrName = {value1, value2, etc };
            //option 2:
                //dataType[] arrName = new dataType[size];
                //this will make an array of length size, and fill it with
                    //default values
                        //int -> 0
                        //double -> 0.0
                        //boolean -> false
                        //String -> null
                        //Objects -> null

        int numElements = temperatures.length;
        System.out.println("Num things: " + numElements);

        //access something:
            //dataType varName = arrName[index]; "at" [index]
        double firstTemp = temperatures[0];
        System.out.println("Monday: " + firstTemp);
        double lastTemp = temperatures[temperatures.length - 1];
        System.out.println("Friday: " + lastTemp);

        //update something: (change an element)
            //arrName[index2Update] = newValue;
        //Thursday is actually going 102
        temperatures[3] = 102;
        System.out.println("Thursday's new temp: " + temperatures[3]);

        System.out.println(temperatures);
        System.out.println(Arrays.toString(temperatures));


        String[] guestList = new String[6];
        System.out.println(Arrays.toString(guestList));
        guestList[0] = "ME";
        guestList[1] = "Charles";
        System.out.println(Arrays.toString(guestList));
        guestList[2] = "Michael";
        guestList[3] = "Keanu Reeves";
        guestList[4] = "Sia";
        guestList[5] = "Pedro Pascal";
        System.out.println(Arrays.toString(guestList));

        guestList[2] = "Lady Gaga";
        System.out.println(Arrays.toString(guestList));

        //GOAL: I want to swap places with Pedro Pascal
        //I am at position zero
        //Pedro is at position 5

        //WRONG ANSWER FIRST:
            //guestList[0] = guestList[5];
            //guestList[5] = guestList[0];

        //A swap requires 3 lines of code (MINIMUM)
        String tempSave = guestList[0];
        guestList[0] = guestList[5];
        guestList[5] = tempSave;
        System.out.println(Arrays.toString(guestList));

    } //ends main method
} //end our class / file

package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberCollector {
    //GOAL: collect numbers from a user until they say quit
    //Then, find the average

    //Scanner
        //1. Make the scanner
        //2. prompt the user
        //3. read in data (scan.nextLine())
    //While loop
        //while that response is not quit
    //Something to put numbers into
        //Array?
        //or
        //ArrayList? DING DING-> can grow!


    /*
    Boolean Flag Way: (Christina's Preferred method)
        boolean keepGoing = true;
        while (keepGoing){
            //do stuff (ask and retrieve the number)
            //update keepGoing if we need to
                    (this might be if they say quit!)
        }

    Double Ask- Way:
        Ask for the number
        response = scan.nextLine();
        while (response is not quit){
            collect the response
            re-ask for a new response
            response = scan.nextLine();
        }
     */

    public static void main(String[] args) {
        //make some variables
            //scanner
        Scanner scan = new Scanner(System.in);
            //arrayList for collecting
        ArrayList<Integer> numberBasket = new ArrayList<Integer>();
            //boolean flag
        boolean keepGoing = true;

        //while loop
        while (keepGoing) {
            //ask for a number or enter quit
            System.out.println("Enter a number, or quit to stop");
            //grab that response (scan.nextLine)
            String response = scan.nextLine();
            //if it is quit? ->
            if (response.equalsIgnoreCase("quit")) {
                //  booleanFlag = false
                keepGoing = false;
                // calcualte our average! (should this be a method?)
            } else {
                //add it if it's NOT quit
                int number = Integer.parseInt(response);
                numberBasket.add(number);
            }
        }
        System.out.println("You entered: " + numberBasket);
    }
    
    public static double calcAverage(ArrayList<Integer> list){
        //account for zero length!
        return 0.0;
    }

}

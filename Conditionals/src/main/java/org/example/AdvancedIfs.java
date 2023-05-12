package org.example;

import java.nio.file.Path;
import java.sql.SQLOutput;

public class AdvancedIfs {
    public static void main(String[] args) {
        /*
            booleans -> true/false

            boolean operators (work well with primitive types)
                (primitive types: int, double, boolean, char)
                >
                <
                >=
                <=
                ==
                !=

            Those operators are wonky with objects
                how do we compare strings?
                    we use .equals()

                str.equals(anotherString)
         */


        String x = "hello";
        String y = "hello";
        String z = new String("hello");

        System.out.println(x + y + z);

        boolean a = x == y;
        boolean b = x == z;
        System.out.println("a (x == y): " + a);
        System.out.println("b (x == z): " + b);

        boolean c = x.equals(y);
        boolean d = x.equals(z);
        System.out.println("c (x.equals(y)): " + c);
        System.out.println("d (x.equals(z)): " + d);


        double grade = 97.8;
        //90+ -> A
        //80-90 -> B
        //70-80 -> C
        //<70 -> F

        //sequential if statements
            //if, if, if,
        if (grade >= 90){
            System.out.println("A");
        }
        if (grade >= 80 && grade < 90){
            System.out.println("B");
        }
        if (grade >= 70 && grade < 80){
            System.out.println("C");
        }
        if (grade < 70){
            System.out.println("F");
        }

        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        int number = 7;
        String word = "hello";
        String firstTwo = word.substring(0,2);

        //positive and even
        //positive and odd
        //negative and even
        //negative and odd

        //nested if statements
            //nested -> we have one inside of another

        if (number > 0){
            System.out.println("Positive");
            if (number % 2 == 0){
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            } //closes the little else
        } else if (number < 0){
            System.out.println("Negative");
            if (number % 2 == 1){
                System.out.println("Odd");
            } else {
                System.out.println("Even");
            } //closes my little else
        } else {
            System.out.println("ZERO");
        }


        //given a month-> determine how many days are in that month
        String month = "something";

        //solution # 1: 12 if statements

        if (month.equals("January")){
            System.out.println("31 days");
        }

        //solution #2: 3 if statements
        //  (group all our 30s together, (April, June, November, September)
        //  we test for february
        // the rest have 31

        if (month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November")){
            System.out.println("30 days");
        } else if (month.equals("February")){
            System.out.println("28 days");
        } else {
            System.out.println("31 days");
        }

        // Solution #3 -> switch statement
            //a new conditional statement!
        switch (month) {
            case "February" :
                System.out.println("28 days");
                break;
            case "April", "June", "September", "November" :
                System.out.println("30 days");
                break;
            default :
                System.out.println("31 days!");
                break;
        }

    } //ends main method
} //ends class/file

package org.example;

public class BooleanIntro {
    public static void main(String[] args) {
        boolean iAm31 = true;
        boolean iAm102 = false;

        //boolean operators
            // > (greater than)
            // < (less than)
            // >= (greater than or equal to)
            // <= (less than or equal to)
            // == (equals equals) (comparison operator)
            // != (not equals)

        int myAge = 31;
        boolean isAdult = myAge >= 18; //true
        boolean getsSeniorDiscount = myAge >= 65; //false

        int numberOfAccidents = 2;
        boolean isGoodDriver = numberOfAccidents <= 1; //false

        System.out.println(isAdult);
        System.out.println(getsSeniorDiscount);
        System.out.println(isGoodDriver);

        //$100 if you're a good driver
        //$200 if you're a bad driver

        //if statements:
            /*
                if (condition is true) {
                    do something;
                } else {
                    do something different;
                }

             */

        if (isGoodDriver == true){
            System.out.println("$100 for a good driver");
        } else {
            System.out.println("$200 for a bad driver");
        }


    } //ends main method
} //ends class

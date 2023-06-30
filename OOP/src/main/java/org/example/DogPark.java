package org.example;

public class DogPark {
    public static void main(String[] args) {
        Dog dalmation = new Dog(7, 50.5, true);
        //dalmation.age = 7;
        //dalmation.weight = 50.5;
        //dalmation.hasSpots = true;

        //System.out.println(dalmation.age);
        System.out.println(dalmation.getAge());
        System.out.println(dalmation.getDoggyAge());

        Dog bruce = new Dog(2, 105, false);
        //bruce.age = 2;
        //bruce.weight = 105;
        //bruce.hasSpots = false;
       // System.out.println(bruce.age);
        System.out.println(bruce.getAge());
        System.out.println(bruce.getDoggyAge());

        dalmation.bark();
        bruce.bark();

        //void method call:
        //bruce.eat();
        //sout(bruce.weight);

        //return type of double:
        //double updatedWeight = bruce.eat();
        //sout(updatedWeight);

        //double updatedWeight = bruce.eat(32);
        //System.out.println(updatedWeight);

        //System.out.println(bruce.eat(32));

        bruce.eat(32);
        //System.out.println(bruce.weight);

        boolean success = bruce.goForWalk(3);
        //System.out.println(bruce.weight);

        String x = new String("hello");
        String y = "hello";
        String z = "hello";
        System.out.println(x.substring(0, 1));
        System.out.println(x.charAt(0));
        System.out.println(y == z); //true
        System.out.println(x == z); //false

        //encapsulation -> the idea of providing a public interface
                        //while hiding implementation details
        //oven?

        System.out.println(bruce.getAge("1234"));
        System.out.println(bruce.getAge("1111"));





        // Milestone recap
        //String inputString = "Hello! Welcome to Kenzie";

        String name = "Bulbasaur";


    }

//    public static int countLetter(String string, String character) {
//        String[] characters = string.split("");
//        int count = 0;
//        for (String currentCharacter : characters) {
//            // is the currentCharacter equal to the character (ignoring the case)
//            // if so, increase count by 1
//        }
//
//        // returning count
//    }
}
















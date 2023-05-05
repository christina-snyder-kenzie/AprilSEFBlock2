package org.example;

public class StringIntro {
    public static void main(String[] args) {
        String animal = "squirrel";

        System.out.println(animal);

        //how many letters are in a String?
        //.length()

        //methods are chunks of code that operate on something
        //variableName.methodName();

        System.out.println(animal.length());

        int numLetters = animal.length();

        //to access a character at a particular index, use:
            //.charAt(index)
            //returns the char at the index
        char firstLetter = animal.charAt(0);
        char lastLetter = animal.charAt(animal.length() - 1);
        char middleLetter = animal.charAt(animal.length() / 2);

        String fullName = "Christina Elvira Snyder";

        System.out.println(firstLetter);
        System.out.println(numLetters + firstLetter); //123
        System.out.println("" + numLetters + firstLetter); //8s
        System.out.println(numLetters + firstLetter + ""); // "123"
        System.out.println(numLetters + "" + firstLetter);  //8s

        String a = "hello";
        String b = "goodbye";
        b = a;
        //now they're both hello

        //now I want multiple letters at one time
        //.substring(startingPoint)
            //returns the string starting at that point, and goes all the way to the end

        //"squirrel"
        String portion = animal.substring(2);
        System.out.println(portion);
        String last3 = animal.substring(animal.length() - 3);
        System.out.println(last3);

        //.substring(startingPoint, stoppingPoint);
            //the stoppingPoint is EXCLUSIVE
                //we go up to but NOT including that stopping point
        String first3 = animal.substring(0, 3);
        System.out.println(first3);

        //"squirrel"
        System.out.println(animal.substring(4, 6));
        System.out.println(animal.substring(0, animal.length()));

        //can I find the location of a smaller string inside of a bigger string?
        //.indexOf(smallerString)
            //this returns the index of the smaller string
            //it also returns -1 if that smaller string is not in the big one
        int posOfU = animal.indexOf("u");
        System.out.println(posOfU);
        int posOfrr = animal.indexOf("rr");
        System.out.println(posOfrr);
        int missingPos = animal.indexOf("pizza");
        System.out.println(missingPos);

        //.length()
        //.charAt(index)
        //.substring(startingPoint)
        //.substring(start, stop)
        //.indexOf(littleString)

        String a2 = "hello";
        a2 = a2 + "world";
        System.out.println(a2);



    }

}

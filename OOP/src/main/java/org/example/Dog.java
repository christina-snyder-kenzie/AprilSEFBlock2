package org.example;

public class Dog {
    //instance variables
        //accessModifier dataType varName;

    //access modifier
        //public -> anybody has access
        //default -> anybody in the same package
        //protected -> anybody in the same package + subclasses
        //private -> can only be seen in the file where it is created
    private int age;
    private double weight;
    private boolean hasSpots;

    private String accessCode;

    //constructor
        //the job of a constructor is to initialize instance variables
    //very specific syntax:
        //public ClassName(parameters) { assign variables }

    public Dog(int ageParam, double weightParam, boolean spotsParam){
        age = ageParam;
        weight = weightParam;
        hasSpots = spotsParam;
        accessCode = "1234";
    }

    //getter method (accessor methods)
    //a getter method retrieves an instance variable
    //public dataType getVarName() { return varName; }

    public int getAge(){
        //could we somehow get an accessCode and see if matches the secret one?
        return age;
    }

    //overloading
        //substring(start, stop)
        //substring(start)

        //add(thing) -> puts it at the end
        //add(index, thing) -> puts it at the index

    //means same method name, different parameters

    public int getAge(String secretCode){
        if (secretCode.equals(accessCode)) {
            return age;
        } else {
            System.out.println("YOU SHALL NOT PASS");
            return -100;
        }
    }

    //methods
    //calculates doggyAge
    public int getDoggyAge(){
        return age * 7;
    }

    public void bark(){
        //when does a yap turn into a woof
        //when does a woof turn into a bork
        if (weight < 15){
            System.out.println("yap yap!");
        } else if (weight < 100){
            System.out.println("woof!");
        } else{
            System.out.println("WOOOOOOF");
        }
    }

    //eating
    //we return the updated weight
    //we take in ounces of food (double)
        //weight += (ounces / 16)
    //we print out something depending on how much food
    public double eat(double ouncesOfFood){
        weight += (ouncesOfFood / 16);
        if (ouncesOfFood < 5){
            System.out.println("Please sir, may I have some more?");
        } else if (ouncesOfFood < 16){
            System.out.println("Yum!");
        } else {
            System.out.println("Nom nom nom");
        }
        return weight;
    }

    //walking
    //take in distance (miles)
        //1 mile = 1 lost pound
    //there is a 75% chance of territory marking
        //we return true or false depending on the success
    public boolean goForWalk(double miles){
        weight -= miles;
        //Math.random() -> double on the range 0 - 1
        // Math.random() <= .75
        // Math.random() >= .25
        if (Math.random() <= .75){
            System.out.println("Good dog! have a treat!");
            return true;
        } else {
            return false;
        }

        /*
        double result = Math.random();
        if (result < .33){

        } else if (result < .66){

        } else {

        }
         */
    }




}

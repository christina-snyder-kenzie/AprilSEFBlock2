package org.example;

public class Animal {
    // properties: qualities ALL animals have
    // numLegs, hasEyes, exterior, diet, canFly, weight, isInjured, endothermic
    private int numLegs;
    private String exterior;
    private double weight;
    private boolean hasEyes, canFly, isInjured;

    public Animal(int numLegs, String exterior, double weight, boolean hasEyes, boolean canFly) {
        this.numLegs = numLegs;
        this.exterior = exterior;
        this.weight = weight;
        this.hasEyes = hasEyes;
        this.canFly = canFly;
        this.isInjured = false;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public String getExterior() {
        return exterior;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHasEyes() {
        return hasEyes;
    }

    public void setHasEyes(boolean hasEyes) {
        this.hasEyes = hasEyes;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    // instance methods
    // eat, sleep, talk, breathe, fight

    public void eat() {
        double amountIncrease = this.weight * .005;
        this.weight += amountIncrease;
        System.out.println("I'm an animal - that was delicious!!!");
    }

    public void sleep() {
        double amountDecrease = this.weight * .0025;
        this.weight -= amountDecrease;
        System.out.println("ZZZZZzzzzzZZZZZzzzzzZZZZZZ");
    }

    public void talk() {
        System.out.println("I'm a talking animal");
    }

    public void breathe() {
        System.out.println("Ahhhhhh what a refreshing breath :)");
    }

    public void fight(Animal otherAnimal) {
        // if either animal is already injured, we're not fighting
        if (this.isInjured || otherAnimal.isInjured) {
            System.out.println("Hey..... let's not do this today");
            return;
        }

        // check if THIS animal is injured
        if (Math.random() >= .5) {
            this.isInjured = true;
        }

        // check if otherAnimal is injured
        if (Math.random() >= .5) {
            otherAnimal.isInjured = true;
        }

        // possible outcomes
        if (this.isInjured && otherAnimal.isInjured) {
            System.out.println("DRAW");
        } else if (this.isInjured) {
            System.out.println("Other animal wins!");
        } else if (otherAnimal.isInjured) {
            System.out.println("This animal wins!");
        } else {
            System.out.println("undecided.... overtime?");
        }
    }
}

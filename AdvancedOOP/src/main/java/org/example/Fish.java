package org.example;

public class Fish extends Animal {
    // properties:
    // color
    // skeletal structure
    // isFreshwater
    // hasScales
    // hasTeeth
    // numberOfFins
    private String color;
    private boolean isFreshwater, hasTeeth;

    public Fish(int numLegs, String exterior, double weight, boolean hasEyes, boolean canFly, String color, boolean isFreshwater, boolean hasTeeth) {
        // ALWAYS: must call parent constructor inside the constructor of a child class
        super(numLegs, exterior, weight, hasEyes, canFly);
        this.color = color;
        this.isFreshwater = isFreshwater;
        this.hasTeeth = hasTeeth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFreshwater() {
        return isFreshwater;
    }

    public void setFreshwater(boolean freshwater) {
        isFreshwater = freshwater;
    }

    public boolean isHasTeeth() {
        return hasTeeth;
    }

    public void setHasTeeth(boolean hasTeeth) {
        this.hasTeeth = hasTeeth;
    }

    // instance methods
    // swim, talk, breathe

    public void swim() {
        //this.weight -= this.weight * .0025; -> bad, we don't have access
        this.setWeight(this.getWeight() - this.getWeight() * .0025);
        System.out.println("Swimming.... swimming.... swimming");
    }

    public void talk() {
        System.out.println("Bubble bubble bubble I'm a fish");
    }

    public void breathe() {
        System.out.println("Getting that sweet oxygen using my gills");
    }
}


class Shark extends Fish {
    // properties:
    // bloodDistance -> kilometers
    // isHungry -> true
    private double bloodDistance;
    private boolean isHungry;

    public Shark(int numLegs, String exterior, double weight, boolean hasEyes, boolean canFly, String color, boolean isFreshwater, boolean hasTeeth, double bloodDistance) {
        super(numLegs, exterior, weight, hasEyes, canFly, color, isFreshwater, hasTeeth);
        this.bloodDistance = bloodDistance;
        this.isHungry = true;
    }

    public double getBloodDistance() {
        return bloodDistance;
    }

    public void setBloodDistance(double bloodDistance) {
        this.bloodDistance = bloodDistance;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    // instance methods
    // swim, bite

    public void swim() {
        System.out.println("Sharks keep swimming!!!");
        this.isHungry = true;
    }

    public void bite() {
        if (this.isHungry) {
            System.out.println("CHOMP CHOMP");
            this.eat();
            this.isHungry = false;
        } else {
            System.out.println("Just tastin... I'm not really hungry");
        }
    }
}

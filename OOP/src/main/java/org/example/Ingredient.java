package org.example;

public class Ingredient {
    //measurement/ unit -> String (enum?)
    //the amount -> double
    //the name of the ingredient -> String
    //1.0 tsp salt

    //instance variables
    private String unit, name;
    private double amount;

    //constructor(s)
    public Ingredient(double amount, String unit, String name){
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    //methods
    //getter methods:
        //public dataType getVarName() { return varName; }
    public double getAmount(){
        return amount;
    }

    //setter method:
        //public void setVarName(dataType varName) { this.varName = varName; }
    public void setAmount(double amount){
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return amount + " " + unit + " " + name;
    }

}

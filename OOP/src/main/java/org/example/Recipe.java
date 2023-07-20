package org.example;


import java.util.ArrayList;

public class Recipe {
    //ingredients -> a collection of Ingredients
        //measurement/ unit
        //the amount
        //the name of the ingredient
            //1 tsp salt

    //cooktime -> int (minutes)
    //method/steps
        //temperature?
        //String -> ArrayList<String>
    //serving size
        // 8
        // 8.5 -> double!
        // "8 Servings"
    //utensils/supplies
        // "spoon, pot, and a lid"
        // ["spoon", "pot", "lid"} -> collection (array or arrayList?) (maybe array if it doesn't change)
    //backstory X
    //name -> String

    private ArrayList<Ingredient> ingrList;
    private int cookTime;
    private ArrayList<String> steps;
    private double servingSize;
    private String[] supplies;
    private String name;

    public Recipe(String name, String[] supplies, double servingSize, ArrayList<String> steps, int cookTime, ArrayList<Ingredient> ingrList) {
        this.name = name;
        this.supplies = supplies;
        this.servingSize = servingSize;
        this.steps = steps;
        this.cookTime = cookTime;
        this.ingrList = ingrList;
    }

    public Recipe(String name){
        this.name = name;
        supplies = null; //could cause NPEs (null pointer exceptions!)
            //NPE happens when you call a method upon an object which is null
            //supplies.length (null.length) -> trigger a NPE!
        this.supplies = new String[0];
            //supplies.length -> 0
        this.servingSize = 0;
        steps = new ArrayList<String>();
        cookTime = 0;
        ingrList = new ArrayList<Ingredient>();
    }

    public ArrayList<Ingredient> getIngrList() {
        return ingrList;
    }

    public void setIngrList(ArrayList<Ingredient> ingrList) {
        this.ingrList = ingrList;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }

    public double getServingSize() {
        return servingSize;
    }

    public void setServingSize(double servingSize) {
        this.servingSize = servingSize;
    }

    public String[] getSupplies() {
        return supplies;
    }

    public void setSupplies(String[] supplies) {
        this.supplies = supplies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //RecipeName
    //~~~~~~~~~~~
    //Ingr 1
    //ingr 2
    //ingr 3
    //~~~~~~~~~~
    //step 1
    //step 2
    //step 3
    public String toString(){
        StringBuilder sb = new StringBuilder(name);
        sb.append("\n~~~~~~~~~~~~");
        // for (dataType varname : collectionName){
        for (Ingredient currentIngr : ingrList){
            sb.append("\n");
            sb.append(currentIngr); // automatically calls toString()
        }
        sb.append("\n~~~~~~~~~~~~");
        int stepCounter = 1;
        for (String currentStep : steps){
            sb.append("\n");
            sb.append("Step #");
            sb.append(stepCounter);
            sb.append(" - ");
            sb.append(currentStep);
            stepCounter++;
        }
        return sb.toString();
    }




}

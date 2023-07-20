package org.example;

import java.util.ArrayList;

public class RecipeTester {
    public static void main(String[] args) {
        String myName = "Papi's Rice";

        String[] mySupplies = {"teaspoon", "cup", "pot", "lid"};

        double servingSize = 7;

        ArrayList<String> mySteps = new ArrayList<String>();
        mySteps.add("Put ingredients in pot");
        mySteps.add("Bring to a boil");
        mySteps.add("Cook until tender");

        int cookTime = 20;

        ArrayList<Ingredient> myIngrList = new ArrayList<Ingredient>();
        Ingredient first = new Ingredient(1, "tsp", "salt");
        myIngrList.add(first);
        myIngrList.add(new Ingredient(1, "cup", "rice"));
        myIngrList.add(new Ingredient(2, "cups", "water"));

        Recipe r1 = new Recipe(myName, mySupplies, servingSize, mySteps, cookTime, myIngrList);

        System.out.println(r1.getName());
        System.out.println(r1.getIngrList());
        System.out.println(r1);


    }
}

package org.example;

public class IngredientTester {
    public static void main(String[] args) {
        Ingredient i1 = new Ingredient(1, "tsp", "salt");

        System.out.println(i1.getName());
        System.out.println(i1.getUnit());
        System.out.println(i1.toString());

        Ingredient i2 = new Ingredient(1, "cup", "rice");
        System.out.println(i2);
    }
}

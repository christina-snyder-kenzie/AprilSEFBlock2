package org.example;

public class Main {
    public static void main(String[] args) {

        // Recipe vs Ingredient
          // Recipes HAVE Ingredients
          // HAS-A relationship

        // Animal vs Reptile
          // Not all animals are reptiles, but all reptiles are animals
          // IS-A relationship


        Employee bezos = new Employee("Jeff");
        System.out.println(bezos);

        Employee gates = new Employee("Bill", Department.OPS, Shift.RT);
        System.out.println(gates);

    }
}
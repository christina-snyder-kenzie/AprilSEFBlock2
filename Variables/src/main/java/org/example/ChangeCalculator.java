package org.example;

import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double foodCost = 46.23;
        System.out.println("Your cost is $" + foodCost);
        System.out.println("Enter how much money to make change for:");
        String response = scan.nextLine();

        double amtTendered = Double.parseDouble(response);

        double changeBack = amtTendered - foodCost;
        System.out.println("I owe you $" + changeBack);

        int num20s = (int) (changeBack / 20);
        System.out.println("20s: " + num20s);

        changeBack = changeBack % 20;
        System.out.println("Change remaining: " + changeBack);

        int num10s = (int) (changeBack / 10);
        System.out.println("10s: " + num10s);

        changeBack = changeBack % 10;

        int num5s = (int) (changeBack / 5);
        System.out.println("5s: " + num5s);
        changeBack = changeBack % 5;

        int num1s = (int) changeBack;
        System.out.println("1s: " + num1s);
        changeBack = changeBack % 1;


        System.out.println("Change remaining: " + changeBack);

        //can you make it work for quarters, dimes, nickels, and pennies?



    }
}

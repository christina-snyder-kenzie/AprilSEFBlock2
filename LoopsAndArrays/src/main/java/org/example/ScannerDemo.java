package org.example;

import java.nio.file.Path;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //a circle
        //I want to ask to you want the area or circumference
            //a for area (pi * r^2)
            //c for circ (2 * pi * r)
        //we also need to ask for the radius
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want area (a) or circumference (c)?");
        String areaORCirc = scan.nextLine();
        System.out.println("Enter a radius to calculate");
        String response = scan.nextLine();
        double radius = Double.parseDouble(response);

        if (areaORCirc.equals("a") || areaORCirc.equals("A")){
            System.out.println("The area is: " + (Math.PI * radius * radius));
        } else if (areaORCirc.equalsIgnoreCase("c")){
            System.out.println("The circumference is: " + (2 * Math.PI * radius));
        } else {
            System.out.println("THat's not a valid response");
        }

    }
}

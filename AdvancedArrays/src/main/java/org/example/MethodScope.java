package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class MethodScope {

    public static void main(String[] args) {
        double a = 6.1;
        double[] b = {1.2, 2.3, 3.4, 4.5};
        double c = funTimes(b, a);

        //what is a, b, c, y, z? after the method call
        //a -> 6.1
        //b -> {1.2, 2.3, 3.4, 1.2}
        //c -> 12.2
        // y and z go poof
        System.out.println("A:" + a);
        System.out.println("B:" + Arrays.toString(b));
        System.out.println("C:" + c);
        //System.out.println("Y:" + y);
        times10(b);
        System.out.println("B:" + Arrays.toString(b));

        ArrayList<Double> listOfNumbers = new ArrayList<Double>();
        listOfNumbers.add(1.2);
        listOfNumbers.add(2.2);
        listOfNumbers.add(3.2);
        listOfNumbers.add(4.2);
        listOfNumbers.add(5.2);
        times10(listOfNumbers);
        System.out.println(listOfNumbers);
    }

    //SAME GOAL: Multiply every number in a list by 10
    public static void times10(ArrayList<Double> list){
        for (int i = 0; i < list.size(); i++){
            double number = list.get(i);
            number *= 10;
            list.set(i, number);

            //list.set(i, list.get(i) * 10)
        }
    }

    //GOAL: multiply every number by 10 (this should update the array)
    public static void times10(double[] arr){
        //array[index] = newValue; //this is how we update an array
        for (int i = 0; i < arr.length; i++){
            double number = arr[i];
            number = number * 10;
            arr[i] = number;

            //arr[i] *= 10;
        }

        //WRONG ANSWER BELOW
        for (double number : arr){
            number *= 10;
        }
    }


    public static double funTimes(double[] z, double y){
        y *= 2;
        z[z.length - 1] = z[0];
        return y;
    }
}

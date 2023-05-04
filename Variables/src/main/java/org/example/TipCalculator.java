package org.example;

public class TipCalculator {
    public static void main(String[] args) {
        //GOAL: display the final total including the tip

        //INPUTS
            //subtotal
            //tax rate
            //how much we want to tip
        //THE ALGORITHM
            //update our subtotal to have tax
            //calculate that tip amount (subtotal * tipPercentage)
            //calculating the final amouint (subtotal + tip amount)
        //OUTPUTS
            //the final total
            //and the tip

        double subTotal = 45.55;
        //7.5% (7.5 vs 0.075)
        double taxPercent = 0.075;
        double tipPercent = 0.22;

        double taxAmount = subTotal * taxPercent;
        //double savedOldSubtotal = subTotal;
        subTotal = subTotal + taxAmount; //an update to subtotal
        System.out.println("Subtotal with tax: " + subTotal);

        double tipAmount = Math.round(subTotal * tipPercent * 100) / 100.0;
        System.out.println("Tip amount: " + tipAmount);

        double totalWithTip = subTotal + tipAmount;
        System.out.println("Total cost: " + totalWithTip);
        System.out.println("Total rounded: " + Math.round(totalWithTip));
        double roundedTo2 = Math.round(totalWithTip * 100) / 100.0;
        System.out.println("Total rounded: " + roundedTo2);

        System.out.println(1 / 3.1); //.333333333
    } //ends the main method

} //ends the file (the class)

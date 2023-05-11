package org.example;

public class Warmup {
    public static void main(String[] args) {
        //Variable is a way to store/remember data in code
        //dataType varName = value;
            //dataTypes: int, double, float, boolean, char, (long, short, byte)
                // String, Scanner
            //Variable Names:
                //Rules:
                    //No keywords (reserved words)
                    //Cannot start with number
                    //AlphaNumeric (and _ $)
                    //No Spaces
                //Conventions:
                    //camelCase (or _)
                    //descriptive
                    //start with a lowercase letter

        int z = 9 / 2; // 4 (truncation)
        int y = 9 % 2; // 1 (modulus)
        double x = 9.0 / 2; // 4.5
        double w = 9 / 2; // 4.0 (promotion)

        String v = 1 + 3 + "hello" + 1 + 3; // 4hello13
            //+ sign is contextual (sometimes math, sometimes concatenation)

        String u = v.substring(0, 3);
        int t = v.indexOf("4"); // 0
        int s = v.indexOf("e"); // 2
        int r = v.indexOf("abc"); // -1


    } // ends the main method
} // ends the class/file

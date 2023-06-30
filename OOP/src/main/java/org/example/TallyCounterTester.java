package org.example;

public class TallyCounterTester {
    public static void main(String[] args) {
        TallyCounter defaultCounter = new TallyCounter();
        // System.out.println(defaultCounter.color); // can't do because property is private!
        System.out.println(defaultCounter.getColor());
        System.out.println("Current count: " + defaultCounter.getCount());

        // first click
        defaultCounter.click();
        System.out.println("Current count: " + defaultCounter.getCount());

        // click 25 times
        defaultCounter.click(25);
        System.out.println("Current count: " + defaultCounter.getCount());

        // reset the count
        defaultCounter.resetCount();
        System.out.println("Current count: " + defaultCounter.getCount());


        // %0Xd
          // % - flag, saying we want to pad with a certain value
          // 0 - what we want to pad with
          // X - total number of "digits"/"place values"
          // d - represents a "number" variable

        System.out.printf("Current count: %04d", defaultCounter.getCount());
        System.out.println();

        defaultCounter.click(7);

        String formattedOutput = defaultCounter.formatCount();
        System.out.println("Current count: " + formattedOutput);

        // souf
        System.out.printf("Current count: %s", formattedOutput);
        System.out.println();

        TallyCounter customTallyCounter = new TallyCounter("red");
        System.out.println("Nico's counter is: " + customTallyCounter.getColor());



    }
}

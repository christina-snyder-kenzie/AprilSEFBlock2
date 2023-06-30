package org.example;

public class TallyCounter {
    // PROPERTIES/INSTANCE VARIABLES
    // accessModifier dataType varName;
    // what properties should belong to this counter?
    // count
    private int count;
    // color
    private String color;

    // METHODS
    // Constructor(s)
    // Example:
    // Scanner scan = new Scanner(System.in);  // calling a constructor method to create an instance of Scanner
    public TallyCounter() {
        // initialize our properties/variables (give them values)
        this.count = 0;
        this.color = "silver";
    }

    // OVERLOADING
    // allow someone to choose a color
    public TallyCounter(String color) {
        this.count = 0;
        this.color = color;
    }

    // allow someone to choose a starting count and a color
    public TallyCounter(int count, String color) {
        this.count = count;
        this.color = color;
    }

    // Getters (get methods)
    public int getCount() {
        return this.count;
    }

    public String getColor() {
        return this.color;
    }

    // Setter!
    public void setCount(int count) {
        this.count = count;
    }

    // Other methods
    public void click() {
        this.count += 1; // could do this.count++
    }

    public void click(int numClicks) {
          // this.count += numClicks;
//        for (int i = 0; i < numClicks; i++) {
//            this.count += 1;
//        }
        this.setCount(this.count + numClicks);
    }

    public void resetCount() {
        this.setCount(0);
    }

    public String formatCount() {
        return String.format("%04d", this.count);
    }
}

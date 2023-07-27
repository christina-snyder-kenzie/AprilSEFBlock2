package org.example;


// How do we inherit? EXTENDS ParentClass (SuperClass)
public class CheckingAccount extends BankAccount {
    // properties:
    // already inheriting all properties which belong to BankAccount
    // maximumWithdrawals -> default to 5
    // currentNumberOfWithdrawals -> default to 0
    protected int maximumWithdrawals, currentNumberOfWithdrawals;

    // constructor(s)
    public CheckingAccount() {
        // the first thing we have to do inside child class constructors is call a super class constructor
        super();
        this.maximumWithdrawals = 5;
        this.currentNumberOfWithdrawals = 0;
    }

    public CheckingAccount(double balance) {
        super(balance);
        this.maximumWithdrawals = 5;
        this.currentNumberOfWithdrawals = 0;
    }

    public CheckingAccount(double balance, int maximumWithdrawals) {
        super(balance);
        this.maximumWithdrawals = maximumWithdrawals;
        this.currentNumberOfWithdrawals = 0;
    }

    // getters and setters

    public int getMaximumWithdrawals() {
        return this.maximumWithdrawals;
    }

    public void setMaximumWithdrawals(int maximumWithdrawals) {
        this.maximumWithdrawals = maximumWithdrawals;
    }

    public int getCurrentNumberOfWithdrawals() {
        return this.currentNumberOfWithdrawals;
    }

    public void setCurrentNumberOfWithdrawals(int currentNumberOfWithdrawals) {
        this.currentNumberOfWithdrawals = currentNumberOfWithdrawals;
    }

    // override withdraw method
    // we need to check if we've reached max withdrawals
    public double withdraw(double amount) {
        if (this.currentNumberOfWithdrawals < this.maximumWithdrawals) {
            this.currentNumberOfWithdrawals += 1; // or ++
            System.out.println("Remaining withdrawals: " + (this.maximumWithdrawals - this.currentNumberOfWithdrawals));
            return super.withdraw(amount);
        }

        System.out.println("No more withdrawals available!");
        return this.balance;
    }

    // override toString
    public String toString() {
        String output = super.toString();
        output += "\nRemaining withdrawals: " + (this.maximumWithdrawals - this.currentNumberOfWithdrawals);
        return output;
    }

}

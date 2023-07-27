package org.example;

public class SavingsAccount extends BankAccount {
    // property:
    // interestRate -> .01
    private double interestRate;

    // constructor(s)
    public SavingsAccount() {
        super();
        this.interestRate = .01;
    }

    public SavingsAccount(double balance) {
        super(balance);
        this.interestRate = .01;
    }

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    // getters and setters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // accrueInterest - return the amount of interest earned
    public double accrueInterest() {
        double interestedAccrued = this.balance * this.interestRate;
        this.balance += interestedAccrued;

        return interestedAccrued;
    }
}

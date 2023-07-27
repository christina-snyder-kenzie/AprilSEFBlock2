package org.example;

public class BankAccount {
    // properties/instance variables
      // balance
      // signUpBonus

    // access modifiers!
      // private - can only access something within the class its defined (must use getters and setters in this case)
      // public - can be accessed within the entire project (anywhere in project)
      // protected - can be accessed within the class its defined along with any class which inherits the class in which its defined

    protected double balance;
    protected double signUpBonus;

    // methods
    // OVERLOADED
      // constructor(s)
    public BankAccount() {
        this.signUpBonus = 200;
        this.balance = this.signUpBonus;
    }

    public BankAccount(double balance) {
        this.signUpBonus = 200;
        this.balance = this.signUpBonus + balance;
    }

      // getters and setters
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getSignUpBonus() {
        return signUpBonus;
    }

    public void setSignUpBonus(double signUpBonus) {
        this.signUpBonus = signUpBonus;
    }

    // deposit
    public double deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited $" + amount + ". New balance is: $" + this.balance);
        }

        return this.balance;
    }

    // withdraw
    public double withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Successfully withdrawn $" + amount + ". New balance is: $" + this.balance);
        }

        return this.balance;
    }

    // transfer
    public void transfer(BankAccount otherAccount, double amount) {
        // transfer money from this account to the otherAccount
        if (this.balance >= amount && amount > 0) {
            this.withdraw(amount);
            otherAccount.deposit(amount);
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer unsuccessful :/");
        }
    }

    // OVERRIDING the inherited toString method from the Object class
    // toString
    // POLYMORPHISM!!!
    public String toString() {
        return "Balance: $" + String.format("%.2f", this.balance);
    }
}

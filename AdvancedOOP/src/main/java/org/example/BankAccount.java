package org.example;

public class BankAccount {
    // properties/instance variables
      // balance
      // signUpBonus
      // enum -> status

    // access modifiers!
      // private - can only access something within the class its defined (must use getters and setters in this case)
      // public - can be accessed within the entire project (anywhere in project)
      // protected - can be accessed within the class its defined along with any class which inherits the class in which its defined

    protected double balance;
    protected double signUpBonus;
    protected Status status;

    // methods
    // OVERLOADED
      // constructor(s)
    public BankAccount() {
        this.signUpBonus = 200;
        this.balance = this.signUpBonus;
        this.status = Status.OPEN;
    }

    public BankAccount(double balance) {
        this.signUpBonus = 200;
        this.balance = this.signUpBonus + balance;
        this.status = Status.OPEN;
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

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
//        if (amount > 0 && this.balance >= amount) {
//            this.balance -= amount;
//            System.out.println("Successfully withdrawn $" + amount + ". New balance is: $" + this.balance);
//        }
        // what if we want to allow the Account to overdraft?
        if (amount > 0) {
            this.balance -= amount;
            System.out.println("Successfully withdrawn $" + String.format("%.2f", amount) + ". New balance is: $" + String.format("%.2f", this.balance));

            if (this.balance < 0) {
                this.status = Status.OVERDRAWN;
            }
        }

        return this.balance;
    }

    // close account :(
    public void closeAccount() {
        this.withdraw(this.balance);
        this.status = Status.CLOSED;
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
        return "Balance: $" + String.format("%.2f", this.balance) + "\nStatus: " + this.status;
    }
}

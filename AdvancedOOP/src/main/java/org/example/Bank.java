package org.example;

import java.util.ArrayList;

public class Bank {
    public static void main(String[] args) {
        BankAccount noDepositBankAccount = new BankAccount();
        System.out.println(noDepositBankAccount);

        noDepositBankAccount.deposit(500);

        BankAccount firstDepositBankAccount = new BankAccount(1000);

        firstDepositBankAccount.transfer(noDepositBankAccount, 100);

        System.out.println(noDepositBankAccount);
        System.out.println(firstDepositBankAccount);

        System.out.println("-----------------");

        CheckingAccount zeroDepositCheckingAccount = new CheckingAccount();

        zeroDepositCheckingAccount.deposit(300);
        System.out.println(zeroDepositCheckingAccount);

        System.out.println(firstDepositBankAccount);
        firstDepositBankAccount.transfer(zeroDepositCheckingAccount, 200);

        System.out.println(firstDepositBankAccount);
        System.out.println(zeroDepositCheckingAccount);

        zeroDepositCheckingAccount.withdraw(100);
        zeroDepositCheckingAccount.withdraw(100);
        zeroDepositCheckingAccount.withdraw(100);
        zeroDepositCheckingAccount.withdraw(100);
        zeroDepositCheckingAccount.withdraw(100);
        zeroDepositCheckingAccount.withdraw(100);

        System.out.println("----------------------");

        SavingsAccount firstSavings = new SavingsAccount();
        System.out.println(firstSavings);

        firstSavings.accrueInterest();
        System.out.println(firstSavings);

        System.out.println("-------------------------");

        // POLYMORPHISM
        BankAccount someOtherAccount = new SavingsAccount(2000);
        BankAccount anotherOtherAccount = new CheckingAccount(1500, 10);

        System.out.println(someOtherAccount);
        System.out.println(someOtherAccount instanceof BankAccount);
        System.out.println(someOtherAccount instanceof SavingsAccount);

        // can't do this because we're wearing a BankAccount jacket
        // someOtherAccount.accrueInterest();

        // when we print the object, we call the CheckingAccount toString method because BankAccount also has a toString method and when we CAN do the a more specific thing, we DO the more specific thing
        System.out.println(anotherOtherAccount);

        System.out.println(anotherOtherAccount instanceof BankAccount);
        System.out.println(anotherOtherAccount instanceof CheckingAccount);

        ArrayList<BankAccount> allAccounts = new ArrayList<>();

        allAccounts.add(firstDepositBankAccount);
        allAccounts.add(firstSavings);
        allAccounts.add(anotherOtherAccount);


    }
}

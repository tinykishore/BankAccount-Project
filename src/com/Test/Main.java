package com.Test;

import com.banksystems.*;

public class Main {
    public static void main(String[] args) {
        CurrentAccount mark = new CurrentAccount("Mr. Y", "Badda",
                "123456789", "+880 1234-567890", 1050);

        SavingAccount jack = new SavingAccount("Mr. X", "Motijheel",
                "123456789", "+880 1234-567890", 1000);

        BusinessAccount linc = new BusinessAccount("Mr. Z", "Wari",
                "123456789", "+880 1234-567890", 30000);


        System.out.println("printing account summary");
        mark.printAccountDetails();
        jack.printAccountDetails();
        linc.printAccountDetails();
        System.out.println();

        System.out.println("Printing only balance");
        System.out.println(mark.getBalance());
        System.out.println(jack.getBalance());
        System.out.println(linc.getBalance());
        System.out.println();

        System.out.println("***Deposit happens***");
        mark.deposit(200);
        jack.deposit(500);
        linc.deposit(10000);
        System.out.println();


        System.out.println("Printing balance after deposit");
        System.out.println(mark.getBalance());
        System.out.println(jack.getBalance());
        System.out.println(linc.getBalance());
        System.out.println();

        System.out.println("***Withdraw happens***");
        mark.withdraw(500.0);
        jack.withdraw(1500);
        linc.withdraw(20000);
        System.out.println();

        System.out.println("Printing balance after withdraw");
        System.out.println(mark.getBalance());
        System.out.println(jack.getBalance());
        System.out.println(linc.getBalance());
        System.out.println();

        System.out.println("***AGAIN Withdraw happens***");
        mark.withdraw(200);
        jack.withdraw(100);
        linc.withdraw(500);
        System.out.println();

        System.out.println("Printing balance after second withdraw");
        System.out.println(mark.getBalance());
        System.out.println(jack.getBalance());
        System.out.println(linc.getBalance());
        System.out.println();


        jack.deposit(1200);

        System.out.println("Interest happens");
        mark.interest();
        jack.interest();
        linc.interest();
        System.out.println();


        System.out.println("Printing balance after Interest");
        System.out.println(mark.getBalance());
        System.out.println(jack.getBalance());
        System.out.println(linc.getBalance());
        System.out.println();


        System.out.println("Yearly Charge");
        mark.yearlyCharge();
        jack.yearlyCharge();
        linc.yearlyCharge();
        System.out.println();

        System.out.println("Printing balance after yearly charge");
        System.out.println(mark.getBalance());
        System.out.println(jack.getBalance());
        System.out.println(linc.getBalance());
        System.out.println();

    }
}

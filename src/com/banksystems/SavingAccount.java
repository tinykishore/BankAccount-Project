package com.banksystems;

import static java.lang.System.exit;

public class SavingAccount extends Account {

    private static final double INTEREST_PERCENTAGE = 0.12;

    public SavingAccount(String name, String nidNO, String contactNumber, String presentAddress, double balance) {
        super(name, nidNO, contactNumber, presentAddress);
        if (balance < 1000) {
            System.out.println("Cannot Create Saving Account. Deposit should be greater than or equal 1000");
            exit(0);   // Fixme : need a better way of solving this.
        } else {
            setBalance(balance);
        }
    }

    @Override
    public void interest() {
        super.setBalance(getBalance() + getBalance() * INTEREST_PERCENTAGE);
    }
}

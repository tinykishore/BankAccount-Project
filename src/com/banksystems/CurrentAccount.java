package com.banksystems;

import static java.lang.System.exit;

public class CurrentAccount extends Account {

    private static final double INTEREST_PERCENTAGE = 0.00;

    public CurrentAccount(String name, String nidNO, String contactNumber, String presentAddress, double balance) {
        super(name, nidNO, contactNumber, presentAddress);
        if (balance < 500) {
            System.out.println("Cannot Create Current Account. Deposit should be greater than or equal 500");
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

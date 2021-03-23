package com.banksystems;

import static java.lang.System.exit;

public class BusinessAccount extends Account{

    private static final double INTEREST_PERCENTAGE = 0.15;

    public BusinessAccount(String name, String nidNO, String contactNumber, String presentAddress, double balance) {
        super(name, nidNO, contactNumber, presentAddress);
        if (balance < 2000) {
            System.out.println("Cannot Create Business Account. Deposit should be greater than or equal 2000");
            exit(0);  // need a better way of solving this.
        } else {
            setBalance(balance);
        }
    }

    @Override
    public void interest() {
        super.setBalance(getBalance() + getBalance()*INTEREST_PERCENTAGE);
    }
}

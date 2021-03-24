package com.banksystems;

import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

abstract class Account {
    private String name;
    private String nidNO;
    private String contactNumber;
    private LocalDate openingDate;
    private String presentAddress;
    private double balance = 0;

    private static final int ANNUAL_CHARGE = 500;

    // Getter-Setter method for every private fields -----------------------------------------------------------------
    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getNidNO() {
        return nidNO;
    }

    protected void setNidNO(String nidNO) {
        this.nidNO = nidNO;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    protected void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getOpeningDate() {
        return String.valueOf(openingDate);
    }

    protected void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    protected void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
    // End of getter-setter methods ----------------------------------------------------------------------------------

    // Constructor
    public Account(String name, String nidNO, String contactNumber, String presentAddress) {
        setName(name);
        setNidNO(nidNO);
        setContactNumber(contactNumber);
        setPresentAddress(presentAddress);
        setOpeningDate(LocalDate.now());
    }

    // copy constructor
    public Account(Account account){
        setName(account.name);
        setNidNO(account.nidNO);
        setContactNumber(account.contactNumber);
        setPresentAddress(account.presentAddress);
        setOpeningDate(LocalDate.parse(account.getOpeningDate()));
        setBalance(account.getBalance());
    }

    // prints account details
    public void printAccountDetails() {
        System.out.println("Name                    : " + getName());
        System.out.println("NID Number              : " + getNidNO());
        System.out.println("Contact Number          : " + getContactNumber());
        System.out.println("Account Opening Date    : " + getOpeningDate());
        System.out.println("Present Address         : " + getPresentAddress());
        System.out.println("Balance                 : " + getBalance());
    }

    public void deposit(double balance) {
        setBalance(this.balance + balance);
    }

    public void withdraw(double balance) {
        if(this.balance >= balance) setBalance(this.balance - balance);
        else System.out.println("NOT ENOUGH MONEY, Remaining :" + this.balance);
    }


    public static void yearlyCharge(Account account) {
        account.setBalance(account.getBalance() - ANNUAL_CHARGE);
    }

    public abstract void interest();

    /*

    Fixme
      For calling yearlyCharge() once in a year automatically.

    public static void callFunctionSchedule() {

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                yearlyCharge
            }
        };

        Timer timer = new Timer();
        timer.schedule(timerTask, 0 ,31536000);         // 1 year = 31,536,000 secs.
    }
    */

}

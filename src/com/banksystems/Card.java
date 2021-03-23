package com.banksystems;

import java.time.LocalDate;

abstract class Card {
    private String cardHolderName;
    private String cardIdentifierNumber;
    private LocalDate validFrom;
    private LocalDate validTo;
    private String CVN;
    private double balance;


    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardIdentifierNumber() {
        return cardIdentifierNumber;
    }

    public void setCardIdentifierNumber(String cardIdentifierNumber) {
        this.cardIdentifierNumber = cardIdentifierNumber;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    public String getCVN() {
        return CVN;
    }

    public void setCVN(String CVN) {
        this.CVN = CVN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }






}

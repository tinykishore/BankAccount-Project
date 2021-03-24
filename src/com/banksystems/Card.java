/*
    Fixme
        How to implement Card System...
 */

package com.banksystems;

import java.time.LocalDate;

abstract class Card {
    private String cardHolderName;
    private String cardIdentifierNumber;
    private LocalDate validFrom;
    private LocalDate validTo;
    private String cvn;


    public String getCardHolderName() {
        return cardHolderName;
    }

    protected void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardIdentifierNumber() {
        return cardIdentifierNumber;
    }

    protected void setCardIdentifierNumber(String cardIdentifierNumber) {
        this.cardIdentifierNumber = cardIdentifierNumber;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    protected void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    protected void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    public String getCvn() {
        return cvn;
    }

    protected void setCvn(String cvn) {
        this.cvn = cvn;
    }


}

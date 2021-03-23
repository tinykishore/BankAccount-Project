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


    }

}

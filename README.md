# BankAccount-Project

##Question:

###Class Designing for Banking System

In this assignment you need to design java classes for implementing a software system for banking.

Consider, a bank maintains several accounts for its clients. But accounts can be of multiple types likewise **Current Account**, **Savings Account**, **Business account**. Regardless of the type of the account it has a **balance**, client details like (**client name**, **present address**, **nid**, **contact number**, **opening date**).

Current accounts do not provide any interest whereas savings accounts provide interest at a fixed rate set by the bank at the time of the opening of the account. A client can withdraw/deposit any valid amount of money from his/her account. Every account has to have a minimum balance requirement which cannot be withdrawn unless one closes his/her account but the minimum balance varies depending on the type of account. For example, a current account must have a minimum balance of 500 BDT, for savings account 1000 BDT and for business accounts the minimum balance is 2000 BDT. However, every account has a fixed annual maintenance charge set by the bank regardless of the type of the account.

Apart from the accounts, the bank provides visa card services. Card can be of two types likewise Debit Card and Credit Card. Every card has a card identifier number, card holder name, valid from & valid to date and another number called CVN. Debit card is associated with an account and its balance is the balance of the account. However, credit cards are not associated with any account. It keeps a client with whom the cards are associated with. Additionally, a credit card has to maintain a maximum credit amount set by the bank at the time of issuing the card and also a running credit amount - the amount of loan one has taken from the bank via the credit card.

Now you have to implement the above scenario in java using oop concepts like inheritance, encapsulation, polymorphism and abstraction. In order to cope up with the theory class you need to complete this following the steps below sequentially:

1. Find out the java classes from the above scenario
2. Now, infer the inheritance hierarchy among the classes 3. After that, add the attributes i.e. variables into the classes keeping inheritance in mind
4. Finally, add the methods keeping body empty for now

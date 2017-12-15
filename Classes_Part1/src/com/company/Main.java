package com.company;

public class Main {

    public static void main(String[] args) {

        // Instantiate new object
        Account myAccount = new Account();
        myAccount.setAccountNumber("123SAV");
        myAccount.setBalance(2000.00);
        myAccount.setCustomerName("Me Ed");
        myAccount.setEmail("my@email.com");
        myAccount.setPhoneNumber("999-555-1212");

        // Object methods
        myAccount.Deposit(300.00);
        myAccount.Withdraw(3100.00);

    }
}

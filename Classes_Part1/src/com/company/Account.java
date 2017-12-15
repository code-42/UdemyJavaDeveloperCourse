package com.company;

import java.math.BigDecimal;

public class Account {

    // private fields
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Methods
    public void Deposit(double amount){
        this.balance += amount;
        this.setBalance(balance);
        System.out.println("Balance = " + getBalance());
    }

    public void Withdraw(double amount){
        if(this.balance > amount){
            this.balance -= amount;
        }
        else{
            System.out.println("Insufficient funds");
        }
        System.out.println("Balance = " + getBalance());
    }
}

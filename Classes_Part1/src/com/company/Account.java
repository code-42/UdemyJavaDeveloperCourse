package com.company;

public class Account {

    // Section 7 Lecture 37

    // private fields
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Default constructor this(must be the first line
    public Account() {
        this("123CK", 0.00, "default name", "default email", "default phone");
        System.out.println("Empty constructor");
    }

    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Account constructor call completed");
    }

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

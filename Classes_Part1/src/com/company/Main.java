package com.company;


public class Main {

    public static void main(String[] args) {

        // Instantiate new object
        Account myAccount = new Account("123SAV", 2000.00, "Me Ed", "my@email.com", "123-555-1212");
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getCustomerName());

        // Object methods
        myAccount.Deposit(300.00);
        myAccount.Withdraw(3100.00);
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getCustomerName());

        Account defaultAccount = new Account("Me Name", "me@email",  "555-1212");
        try{
//            System.out.println(defaultAccount.getCustomerName(), defaultAccount.getPhoneNumber());
            System.out.println(defaultAccount.getCustomerName() + " " + defaultAccount.getPhoneNumber());
        }

        catch (Exception e)
        {
            System.out.printf("err: %s%n", e);
        }

        Account myNewAccount = new Account("My Name", "My Email", "My Phone");
        System.out.println(myNewAccount.getCustomerName() + ", " + myNewAccount.getPhoneNumber());

        VipCustomer mEaVip = new VipCustomer();
        System.out.println(mEaVip.getCreditLimit());
        System.out.println(mEaVip.getEmail());
        System.out.println(mEaVip.getName());

        VipCustomer vip2 = new VipCustomer("Vip2", 1000, "Vip2@email.com");
        System.out.println(vip2.getCreditLimit() + " " + vip2.getName() + " " + vip2.getEmail());
    }
}

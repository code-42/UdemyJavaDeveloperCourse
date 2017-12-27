package net.ed;

import static org.junit.Assert.*;
import static junit.framework.TestCase.fail;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
//        fail("This test not yet implemented");
        BankAccount account = new BankAccount("Me", "LaStName", 1000);
        double balance = account.deposit(200, true);
        assertEquals(1200, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        fail("This test not yet implemented");
    }

    @org.junit.Test
    public void getBalance() {
        BankAccount account = new BankAccount("Me", "LaStName", 1000);
        account.deposit(200, true);
        assertEquals(1200, account.getBalance(), 0);
    }
}
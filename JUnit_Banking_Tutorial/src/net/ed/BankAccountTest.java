package net.ed;

import static org.junit.Assert.*;
import static junit.framework.TestCase.fail;

public class BankAccountTest {

    private BankAccount account;

    // @Before tells JUnit to run this setup for every test
    @org.junit.Before
    public void setup(){
        account = new BankAccount("Me", "LaStName", 1000.00, BankAccount.CHECKING);
        System.out.println("Running test...");
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200, true);
        assertEquals(1200, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        fail("This test not yet implemented");
    }

    @org.junit.Test
    public void getBalance_after_deposit() {
        account.deposit(200, true);
        assertEquals(1200, account.getBalance(), 0);

    }

    @org.junit.Test
    public void getBalance_after_withdraw() {
        account.withdraw(200, true);
        assertEquals(800, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true(){
        assertTrue("Test failed - NOT a checking account", account.isChecking());
    }

}

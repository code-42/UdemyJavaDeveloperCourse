package net.ed;

import static org.junit.Assert.*;
import static junit.framework.TestCase.fail;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes befoe any test cases. Count = " + count++);
    }

    // @Before tells JUnit to run this setup for every test
    @org.junit.Before
    public void setup(){
        account = new BankAccount("Me", "LaStName", 1000.00, BankAccount.CHECKING);
        System.out.println("Running test...");
    }

    @org.junit.Test
    public void deposit() throws Exception {
        double balance = account.deposit(200, true);
        assertEquals(1200, balance, 0);
    }

    @org.junit.Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
        account.withdraw(600.00, false);
        fail("Should throw IllegalArgumentException");
    }

    @org.junit.Test
    public void getBalance_after_deposit() throws Exception {
        account.deposit(200, true);
        assertEquals(1200, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_after_withdraw() throws Exception {
        account.withdraw(200, true);
        assertEquals(800, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true()throws Exception {
        assertTrue("Test failed - NOT a checking account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @org.junit.After
    public void teardown(){
        System.out.println("teardown() Count = " + count++);
    }
}

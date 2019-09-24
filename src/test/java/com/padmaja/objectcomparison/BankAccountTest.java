package com.padmaja.objectcomparison;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void test1() {
        BankAccount acct = new BankAccount();
        String str = "Bank";

        boolean RESULT = (str.equals(acct));
        System.out.println(RESULT);
        boolean expResult = false;
        assertEquals(expResult, RESULT);

        boolean Result2 = acct.equals(str);
        System.out.println(Result2);
        boolean expResults = true;
        assertEquals(expResults, Result2);

    }
}
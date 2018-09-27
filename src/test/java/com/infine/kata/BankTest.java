package com.infine.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BankTest {
    final String myAccount = "1234";
    @Test
    public void should_support_multitreading() throws InterruptedException {
        Bank bank = new Bank();
        bank.createAccount(myAccount, 1000);
        Thread threadWidthDraw = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                bank.withdraw(myAccount, 1);
            }
        });
        Thread threadDeposit = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                bank.deposit(myAccount, 1);
            }
        });
        threadWidthDraw.start();
        threadDeposit.start();
        threadDeposit.join();
        threadWidthDraw.join();
        assertEquals(1000, bank.getAmount(myAccount));
    }
}

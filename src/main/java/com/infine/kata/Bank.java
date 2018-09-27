package com.infine.kata;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<String, Integer> accounts = new HashMap<>();

    public int deposit(String account, int sum) throws IllegalArgumentException {
        if (sum < 0) {
            throw new IllegalArgumentException("sum cannot be negative");
        }
        return accounts.put(account, accounts.get(account) + sum);
    }

    public int withdraw(String account, int sum) {
        if (sum > accounts.get(account)) {
            return -1;
        }
        accounts.put(account, accounts.get(account) - sum);
        return sum;
    }

    public void createAccount(String account, int initialDeposit) {
        accounts.put(account, initialDeposit);
    }

    public int getAmount(String account) {
        return accounts.get(account);
    }
}
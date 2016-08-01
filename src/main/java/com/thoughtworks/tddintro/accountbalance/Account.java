package com.thoughtworks.tddintro.accountbalance;

/**
 * Created by sarahkrueger on 7/31/16.
 */
public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

}

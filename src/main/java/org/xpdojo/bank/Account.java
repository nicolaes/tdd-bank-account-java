package org.xpdojo.bank;

public class Account {
    private int balance;

    public static Account emptyAccount() {
        return new Account();
    }

    public int balance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
}

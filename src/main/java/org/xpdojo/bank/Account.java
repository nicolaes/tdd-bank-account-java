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
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot deposit negative amounts");
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}

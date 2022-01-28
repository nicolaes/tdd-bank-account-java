package org.xpdojo.bank;

public class TransferService {
    public static void transfer(Account from, Account to, int i) {
        from.withdraw(i);
        to.deposit(i);
    }
}

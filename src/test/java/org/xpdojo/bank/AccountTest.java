package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.xpdojo.bank.Account.emptyAccount;

public class AccountTest {

    @Test
    public void initialAccount_shouldHaveZeroBalance() {
        assertThat(emptyAccount().balance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmount_shouldIncreaseBalance() {
        Account account = emptyAccount();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void depositMore() {
        Account account = emptyAccount();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }

    @Test
    public void depositNegativeAmount_shouldNotWork() {
        Account account = emptyAccount();
        assertThatThrownBy(() -> account.deposit(-10));
    }

    @Test
    public void withdraw() {
        Account account = emptyAccount();
        account.deposit(30);
        account.withdraw(10);
        assertThat(account.balance()).isEqualTo(20);
    }

    @Test
    public void withdrawNegativeAmount_shouldNotWork() {
        Account account = emptyAccount();
        assertThatThrownBy(() -> account.withdraw(-10));
    }
}

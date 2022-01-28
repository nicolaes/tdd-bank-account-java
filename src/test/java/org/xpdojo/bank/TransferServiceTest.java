package org.xpdojo.bank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.xpdojo.bank.Account.emptyAccount;

public class TransferServiceTest {
    @Test
    public void transferAmount_shouldMoveAmountBetweenTwoAccounts() {
        Account from = emptyAccount();
        from.deposit(10);
        Account to = emptyAccount();
        TransferService.transfer(from, to, 1);
        Assertions.assertThat(from.balance()).isEqualTo(9);
        Assertions.assertThat(to.balance()).isEqualTo(1);
    }
}

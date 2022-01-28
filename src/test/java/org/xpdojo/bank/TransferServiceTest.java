package org.xpdojo.bank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.xpdojo.bank.Account.emptyAccount;

public class TransferServiceTest {
    private Account from;
    private Account to;

    @BeforeEach
    public void initializeTransferAccounts() {
        from = emptyAccount();
        to = emptyAccount();
    }

    @Test
    public void transferAmount_shouldMoveAmountBetweenTwoAccounts() {
        from.deposit(10);
        TransferService.transfer(from, to, 1);
        Assertions.assertThat(from.balance()).isEqualTo(9);
        Assertions.assertThat(to.balance()).isEqualTo(1);
    }

    public void transferAmount_shouldNotWorkIfSourceBalanceTooLow() {
        Assertions.assertThatThrownBy(() -> TransferService.transfer(from, to, 10));
    }
}

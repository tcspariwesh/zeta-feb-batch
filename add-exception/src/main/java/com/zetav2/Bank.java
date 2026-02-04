package com.zetav2;

import java.util.logging.Logger;

public class Bank {

    Logger logger = Logger.getLogger("bank");

    public void transfer(Account account1, Account account2, float amount) {
        try {
            account1.withdraw(amount);
        } catch (InsufficientBalanceException insufficientBalanceException) {
            logger.severe(insufficientBalanceException.getMessage());
            return;
        } catch (IllegalArgumentException illegalArgumentException) {
            logger.severe(illegalArgumentException.getMessage());
            return;
        }
        account2.deposit(amount);
    }
}

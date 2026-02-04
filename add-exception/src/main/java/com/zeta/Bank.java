package com.zeta;

import java.util.logging.Logger;

public class Bank {
	Logger logger = Logger.getLogger("bank");
    public boolean transfer(Account account1, Account account2, float amount) {
        try {
//        	logger.log(arg0);
        	float result = account1.withdraw(amount);
		} catch (InsufficientBalanceException insufficientBalanceException) {
			logger.severe(insufficientBalanceException.getMessage());
			return false;
		}catch(IllegalArgumentException illegalArgumentException) {
			logger.severe(illegalArgumentException.getMessage());
			
		}
        
        account2.deposit(amount);
    }
}

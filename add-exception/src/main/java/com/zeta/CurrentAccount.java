package com.zeta;

public class CurrentAccount extends Account{


    public CurrentAccount(int number) {
        super(number);
    }

    public CurrentAccount(float balance, int number, ACCOUNT_TYPE type) {
        super(balance, number, type);
    }

    @Override
    float deposit(float amount) {
        validateAmount(amount);
        this.setBalance(this.getBalance() + amount);
        return this.getBalance();
    }

    @Override
    float withdraw(float amount) {
        validateAmount(amount);
        if(this.getBalance() < amount) {
        	throw new InsufficientBalanceException("current Balance=\\{this.getBalance()} , Request amount=\\{amount}");
        } else {
            this.setBalance(this.getBalance() - amount);
            return this.getBalance();
        }
    }
}

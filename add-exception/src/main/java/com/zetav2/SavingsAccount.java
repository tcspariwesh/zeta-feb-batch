package com.zetav2;

public class SavingsAccount implements Account {

    private float balance; // mutable
    private final int number; // immutable
    ACCOUNT_TYPE type; // immutable

    public SavingsAccount(int number) {
        this.number = number;
    }

    public SavingsAccount(float balance, int number, ACCOUNT_TYPE type) {
        this.balance = balance;
        this.number = number;
        this.type = type;
    }

    int getNumber() {
        return number;
    }

    float getBalance() {
        return balance;
    }

    void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public float deposit(float amount) {
        Account.validateAmount(amount);
        this.setBalance(this.getBalance() + amount);
        return this.getBalance();
    }

    @Override
    public float withdraw(float amount) {
        Account.validateAmount(amount);
        if(this.getBalance() < amount) {
            throw new InsufficientBalanceException(String.format("Current Balance: %s Amount Requested: %s", this.getBalance(), amount));
        } else {
            this.setBalance(this.getBalance() - amount);
            return this.getBalance();
        }
    }
}

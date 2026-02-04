package com.zeta;

public abstract class Account {
    private float balance; // mutable
    private final int number; // immutable
    ACCOUNT_TYPE type; // immutable

    public Account(int number) {
        this.number = number;
    }

    public Account(float balance, int number, ACCOUNT_TYPE type) {
        this.balance = balance;
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void validateAmount(float amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
    }

    abstract float deposit(float amount);
    abstract float withdraw(float amount);

	protected void validateAmount(float amount) {
		if(amount <=0 ) {
			throw new IllegalArgumentException("amount cannot be -ve. Are you a *%$^%?");
		}
	}
}

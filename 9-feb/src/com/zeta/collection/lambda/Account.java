package com.zeta.collection.lambda;


public abstract class Account {
    private float balance; // mutable
    private final int number; // immutable

    public Account(int number) {
        this.number = number;
    }

    public Account(float balance, int number) {
        this.balance = balance;
        this.number = number;
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

    abstract float deposit(float amount);
    abstract float withdraw(float amount);

	protected void validateAmount(float amount) {
		if(amount <=0 ) {
			throw new IllegalArgumentException("amount cannot be -ve. Are you a *%$^%?");
		}
	}
	@Override
	public String toString() {
		return "account# "+this.getNumber()+", balance="+this.getBalance();
	}
}

package com.zeta.collection.lambda;

public class SavingsAccount extends Account {

	public SavingsAccount(int number) {
		super(number);
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
		if (this.getBalance() < amount) {
			throw new InsufficientBalanceException(
					"current Balance=" + this.getBalance() + ", Request amount=" + amount);
		} else {
			this.setBalance(this.getBalance() - amount);
			return this.getBalance();
		}
	}
}

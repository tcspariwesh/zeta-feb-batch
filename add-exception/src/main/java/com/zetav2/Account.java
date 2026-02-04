package com.zetav2;

public interface Account {

    static void validateAmount(float amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
    }

    float deposit(float amount);
    float withdraw(float amount);
}

package com.zeta;

public class CurrentAccount extends Account{
    public CurrentAccount(int number) {
        super(number);
    }

    @Override
    float deposit(float amount) {
        return 0;
    }
}

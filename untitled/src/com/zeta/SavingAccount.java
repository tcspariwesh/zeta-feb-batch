package com.zeta;

public class SavingAccount extends Account{

    public SavingAccount(int i) {
        super(i);
    }

    @Override
    float deposit(float amount) {
        return 0;
    }
}

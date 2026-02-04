package com.zeta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account account = new SavingsAccount(0);
        CurrentAccount current = new CurrentAccount(1234);
        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        accounts.add(current);
        accounts.forEach(account1 -> account1.deposit(2000));

        Account account1 = new SavingsAccount(1);
        Account account2 = new SavingsAccount(2);
        account1.deposit(5000);
        System.out.println("Balance of A1: " + account1.getBalance());
        System.out.println("Balance of A2: " + account2.getBalance());

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

        Bank bank = new Bank();
        boolean successfulTransfer = bank.transfer(account1, account2, -8000);
            System.out.println("Balance of A1: " + account1.getBalance());
            System.out.println("Balance of A2: " + account2.getBalance());
    }
}

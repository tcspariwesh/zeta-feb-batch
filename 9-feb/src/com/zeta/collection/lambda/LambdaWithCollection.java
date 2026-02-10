package com.zeta.collection.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaWithCollection {
	public static void main(String[] args) {
		showWithArrayList();
		
	}

	static Predicate<Account> removeFunction = account -> account.getNumber() % 2 == 0;

	private static void showWithArrayList() {
		List<Account> accounts = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			accounts.add(new SavingsAccount(i + 1));
		}
		accounts.forEach(account -> System.out.println(account));
		System.out.println("after  sorting -------");
		// accounts.sort((Account account1, Account account2) -> account2.getNumber() -
		// account1.getNumber());
//		accounts.sort(( account1,  account2) -> account2.getNumber() - account1.getNumber());
		accounts.removeIf(removeFunction);
//		accounts.
		accounts.forEach((Account account) -> System.out.println(account.getNumber()));

	}
}

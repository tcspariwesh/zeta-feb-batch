package com.zeta.collection.lambda;

public class InsufficientBalanceException  extends RuntimeException{  //POJO
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

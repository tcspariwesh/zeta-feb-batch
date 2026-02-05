package com.zeta;
public interface ICreditCard {
	boolean transaction(MerchantAccount recipient,float amount);
	boolean withdrawCash(float amount);
	
}

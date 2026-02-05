package com.zeta.impl;

import com.zeta.CreditCardBase;
import com.zeta.ICreditCard;
import com.zeta.MerchantAccount;

public class EmeraldCrediCard extends CreditCardBase implements ICreditCard{
	public EmeraldCrediCard(String customerName) {
//		com.zeta.String 
//		src.Bomb
		super(customerName);
	}

	@Override
	public boolean transaction(MerchantAccount recipient, float amount) {
		return false;
	}

	@Override
	public boolean withdrawCash(float amount) {
		return false;
	}

	@Override
	public boolean transaction(MerchantAccount recipient, float amount) {
		// TODO Auto-generated method stub
		return false;
	}

}

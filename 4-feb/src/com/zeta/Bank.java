package com.zeta;
import java.util.ArrayList;
import java.util.List;

public class Bank {
	List<ICreditCard> cards = new ArrayList<>();
	ICreditCard issueCard(Customer customer, CARD_TYPE tpye) {
		//check for blank
		ICreditCard card = new EmeraldCrediCard(customerName);
		cards.add(card);
		return card;		
	}
}

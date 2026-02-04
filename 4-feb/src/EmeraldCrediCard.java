
public class EmeraldCrediCard extends CreditCardBase implements ICreditCard{
	public EmeraldCrediCard(String customerName) {
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

}

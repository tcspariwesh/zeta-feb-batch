import java.util.concurrent.Callable;

class DepositTask implements Callable {//Worker
    private final BankAccount account;
    private final int amount;

    public DepositTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

	@Override
	public Object call() throws Exception {
		Thread.sleep((long)Math.random()*10000);
		String thread = Thread.currentThread().getName();
		System.out.println(thread + " depositing ?" + amount);
		if(true)
			throw new RuntimeException("something went wrong!!");
		account.deposit(amount);
		System.out.println(thread + " completed deposit of ?" + amount);
		return account.getBalance();
	}
}

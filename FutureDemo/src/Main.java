import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		depositMoney();
	}

	private static void depositMoney() throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		BankAccount account = new BankAccount(1000);
		Future future = executorService.submit(new DepositTask(account , 1000));
//		Future future1 = executorService.submit(new DepositTask(account , 1000));
		try {
			System.out.println(future.get(10, TimeUnit.SECONDS));
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			if(e instanceof TimeoutException) {//Don't do this
				
			}
			e.printStackTrace();
		}
		//blocking
//		System.out.println(future1.get());
//		Thread.sleep(3000);
		System.out.println(account.getBalance());
	}
}

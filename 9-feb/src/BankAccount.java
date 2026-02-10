
import java.util.logging.Logger;

public class BankAccount {
    Logger logger = Logger.getLogger("BankAccount");
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    synchronized int getBalance() {
        return balance;
    }

    public synchronized boolean withdraw(float amount) {
        logger.info(Thread.currentThread().getName() + "checking balance");
        if (amount <= balance) {
            try {
                Thread.sleep(1000); //simulate processing
            } catch (Exception e) {
                e.printStackTrace();
            }
            balance -= amount;
            return true;
        } else {
            logger.info("insufficient balance");
            return false;
        }
    }

    public synchronized void deposit(float amount) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance += amount;
    }
}
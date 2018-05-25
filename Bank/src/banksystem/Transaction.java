package banksystem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Transaction implements Runnable {

	protected BankAccount account;
	protected char txType; // 'w' -> withdraw, 'd' -> deposit

	protected int amount;

	public Transaction(BankAccount account, char txType, int amount) {
	}

	public void run() {

		if (txType == 'w') {
			account.withdraw(amount);
		} else if (txType == 'd') {
			account.deposit(amount);
		}
		
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		Transaction[] workers = // retrieve worker instance
				
			for (Transaction worker : workers) {
				es.submit(worker);
			}
		
		//shutdown es and wait
	}
}

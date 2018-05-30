package banksystem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Worker implements Runnable {
	
	private BankAccount account;
	
	public Worker(BankAccount account) {
		this.account = account;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			//deposit 10 dollars ten times = 100
	
		int startBalance = account.getBalance();
		
		synchronized (account) {
		account.deposit(10);
		
		}
		
		int endBalance = account.getBalance();
		}
	
	
	ExecutorService es = Executors.newFixedThreadPool(5);
	BankAccount account	 = new BankAccount(100);
		
	for (int i = 0; i < 5; i++) {
		
		Worker worker = new Worker(account);
		es.submit(worker);
	}
		
	}
}		

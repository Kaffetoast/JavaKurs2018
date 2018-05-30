package banksystem;

public class BankAccount {

	private int balance;
	private int amount;
	
	public BankAccount(int startBalance) {
		balance = startBalance;
		
	}
	
	
	//synchronized disables multithreading / its threadsafe
	public synchronized int getBalance() {
		return balance;	
	}
	
	public  void deposit(int amount) {
		balance += amount;

	}
	
	public void withdraw(int amount) {
		balance += amount;
		
	}
}

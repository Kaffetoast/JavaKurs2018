package banksystem;

import java.util.ArrayList;

public class Account {

	double balance;
	int accNum;
	public String accName;
	boolean lock;
	double amount;
	
	//map for accounts and balance?
	ArrayList<String> transactions = new ArrayList<>();
	
	public int accNum() {
		return accNum;
	}
	
	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void lock(boolean lock, Account account) {
		this.lock = lock;
	}
	
	public boolean getLock() {
		return this.lock;
	}
	
	void deposit(double amount) {
		if(amount != 0) {
			balance = balance + amount;
		}
	}
	
	void withdraw(double amount) {
		if(amount != 0) {
			balance = balance - amount;
		}
	}
	
	
	
}

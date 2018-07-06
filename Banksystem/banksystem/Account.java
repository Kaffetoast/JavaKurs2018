package banksystem;

import java.util.ArrayList;


public class Account {

	public ArrayList<Account> accountList = new ArrayList<>();

	
	double balance = 0;
	public int accNum;
	private String accName;
	boolean lock;
	String withdraw;
	String deposit;
	 
	
	public int getAccNum() {
		return this.accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public String getAccName() {
		return this.accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
   

	public synchronized boolean depositBalance(double depositBalance) {

		if(depositBalance >= 0) {
			this.balance += depositBalance;	
			 	toTransactionsList("Deposit: " + depositBalance + " to Account "  + this.getAccNum());
			 	
			 	return true;
		}
		return false;
		
	}
	
	public synchronized boolean withdrawBalance(double withdrawAmount) {
		if (lock) {
			System.out.println("--Is locked--");
			return false;
		} 
		
		//Har jag 500 kr?
		//Om ja: Dra av 500kr från konto
		//Annars: Dra inte av
		
		if(hasAmount(withdrawAmount)) {
			
			 this.balance -= withdrawAmount;
			 toTransactionsList("Withdraw: " + withdrawAmount + " from Account "  + this.getAccNum());
			 
			 return true;
			
		} else {
		
		System.out.println("Account Number: " +this.getAccNum() + "\n" + "Account name: " 
				+this.getAccName() + "\n" + "Balance: " + this.getBalance() + "\n"); 
		return false;
		}
	}
	

	public void lockAccont(boolean lock, Account account) {
		this.lock = lock;
		
	}
	

	public void setLock(boolean lock) {
		this.lock = lock;
	}
	public boolean getAccontLock() {
		
		return this.lock;
	}

	public boolean alreadyLocked() {
		
		if (lock) { 
			return true; 
		} else { 
			return false; 
		}
		 
		
	}
	public void transactionHistory(ArrayList<String> history) {
		
		for (String tx : history) { 
			System.out.println(tx);
		}
	}

	public ArrayList<String> transactionList = new ArrayList<String>(); 
	
	public void toTransactionsList(String transaction) {
		transactionList.add(transaction);
	    
	}

	public boolean hasAmount(double amount) {

		if(getBalance() - amount < 0 || amount < 0) { //if I don't have enough money, return false
			return false;
		}
			return true; //Return true if I have enough money
	}
	
	
	
	
}
package banksystem;

import java.util.ArrayList;


public class Account {

	double balance = 0;
	public int accNum;
	private String accName;
	double amount;
	boolean lock;
	String withdraw;
	String deposit;
	 
	
	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
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
	
   

	public synchronized void depositBalance(double depositBalance, Account account) {
		
		 {
			 this.balance += depositBalance;				   
		 }
		
		 toTransactionsList("Deposit: " + depositBalance + " to Account "  + account.getAccNum());
		
	}

	public void lockAccont(boolean lock, Account account) {
		this.lock = lock;
		
	}
	
	public synchronized void withdrawBalance(double withdrawBalance, Account account) {
		if (!lock) {
		   {
		      account.balance -= withdrawBalance;
		   }
		   
		   toTransactionsList("Withdraw: " + withdrawBalance + " from Account "  + account.getAccNum());
		} else {
			System.out.println("Account Number: " +account.getAccNum() + "\n" + "Account name: " 
					+account.getAccName() + "\n" + "Balance: " + account.getBalance() + "\n");
			System.out.println("--Is locked--");
		}
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
	
	
	
}

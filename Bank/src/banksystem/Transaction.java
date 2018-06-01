package banksystem;

import java.util.ArrayList;

public class Transaction {

	
	public String deposit;
	public String withdraw;
	double balance;
	
	public Transaction(String deposit, String withdraw, double balance) {
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "deposit =" + deposit +
				"withdraw=" + withdraw +
				"balance=" + balance;
		
				
		
	}
}

package banksystem;

import java.util.ArrayList;

public class Bank {
	
	public ArrayList<Account> accountList = new ArrayList<>();
	
	
	int accNum;
	public boolean addAccount(String accName) {
		
		accNum = accNum +1;
		Account account = new Account();
		account.setBalance(0);
		account.setAccName(accName);
		account.setAccNum(accNum);
		accountList.add(account);

	return true;
	} 
	
	public Account getAccount(int accountNum) {
		for(Account thisAccount : accountList) {
			if(thisAccount.getAccNum() == accountNum) {
				return thisAccount;
			}
		}
		return null;
	}
	
	
	
	public void displayAllAccounts(ArrayList<Account> accountList) {
		for(Account thisAccount : accountList) {
			System.out.println("Account Number: " +thisAccount.getAccNum() + "\n" + "Account name: " 
					+thisAccount.getAccName() + "\n");
			if(thisAccount.alreadyLocked()) {
				System.out.println("Account is locked");
			}
		}
	}
	
	public void displayAllAccountsAndBalance(ArrayList<Account> accountList) {
		for(Account thisAccount : accountList) {
			System.out.println("Account Number: " +thisAccount.getAccNum() + "\n" + "Account name: " 
					+thisAccount.getAccName() + "\n" + "Balance: " + thisAccount.getBalance() + "\n");
			if(thisAccount.alreadyLocked()) {
				System.out.println("Account is locked");
			}
		}
	}
	
	
	public void displayAccountBalance(Account thisAccount) {
		System.out.println("Balance for account " + "<" + thisAccount.getAccName()+  ">" + " is " +thisAccount.getBalance());
		if(thisAccount.alreadyLocked()) {
			System.out.println("Account is locked");
		}
		

	}
	

	public void transferBetweenAccounts(Account fromAccount, Account toAccount, double amount) {
		    if (fromAccount.hasAmount(amount)) {  
		    	fromAccount.withdrawBalance(amount, fromAccount);
		    	toAccount.depositBalance(amount, toAccount);

		    } else { 

		        System.out.println("Insufficent balance ");	

		    }
 
	}
	
	public boolean accountExists(int accNum) {
		for (Account account : accountList) {
			if(account.getAccNum() == accNum)
				return true;
		}
		System.out.println("Account " +accNum+ " does not exist!");
		return false;
		
	}
	


}
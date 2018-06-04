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
		account.setLock(false);
		accountList.add(account);
		
	
	return true;
	} 
	
	public Account getAccount(int accountNum) {
		for(Account thisAccount : accountList) {
			if(thisAccount.getAccNum() == accountNum) {
			}
		}
		return null;
	}
	
	
	public void displayAllAccounts(ArrayList<Account> accountList) {
		for(Account thisAccount : accountList) {
			System.out.println("Account Number: " +thisAccount.getAccNum() + "\n" + "Account name: " 
					+thisAccount.getAccName() + "\n" + "Balance: " + thisAccount.getBalance() + "\n");
		}
	}
	
	
	public void displayAccountBalance(Account thisAccount) {
		System.out.println("Balance is: " +thisAccount.getBalance());

	}
	
	
	
	

	
}

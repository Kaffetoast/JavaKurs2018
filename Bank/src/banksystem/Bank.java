package banksystem;

import java.util.ArrayList;

public class Bank {
	
	public ArrayList<Account> accountList = new ArrayList<>();
	
	public boolean addAccount(String name) {
		
		int accNum = 123;
		
		accNum = accNum +1;
		Account account = new Account();
		account.setBalance(0);
		account.setAccName(name);
		account.setAccNum(accNum);
		account.setLock(false);
		accountList.add(account);
		
	
	return true;
	} 
	
	public void displayAccountBalance(Account thisAccount) {
		
		System.out.println("Balance is: " +thisAccount.getBalance());

	}
	
	public void displayAllAccounts(ArrayList<Account> accountList) {
		for(Account thisAccount : accountList) {
			System.out.println("Account" +thisAccount.getAccNum());
		}
	}
	
	
	
	

	
}

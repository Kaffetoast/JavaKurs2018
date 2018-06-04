package banksystem;

import java.util.ArrayList;

public class Bank {
	
	public ArrayList<Account> accountList = new ArrayList<>();
	
	public boolean addAccount(String accName) {
		
		int accNum = 0;
		
		Account account = new Account();
		accNum = accNum +1;
		account.setBalance(0);
		account.setAccName(accName);
		account.setAccNum(accNum);
		account.setLock(false);
		accountList.add(account);
		
	
	return true;
	} 
	
	public void displayAccountBalance(Account thisAccount) {
		
		System.out.println("Balance is: " +thisAccount.getBalance());

	}
	
	

	
}

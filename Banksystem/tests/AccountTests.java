package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import banksystem.Account;
import banksystem.Bank;

class AccountTests {

	Bank banktest = new Bank();
	
	String accName;
	Account account;
	Account thisAccount;
	Account chosenAccount1;
	Account chosenAccount2;
	int accNum;
	double balance;
	
	@Test
	void addNegativeBalance() {
		
		Account negativeAccount = new Account();
		negativeAccount.setBalance(-500);
		Assert.assertTrue(-500 == negativeAccount.getBalance());
	}
	
	@Test
	void depositToAccount() {
		
			
		banktest.addAccount(accName);
		account = banktest.getAccount(1);
		account.setBalance(0);
		account.depositBalance(100, account);
		Assert.assertTrue(100 == account.getBalance());
		
	}
	
	@Test
	void withdrawFromAccount() {
		
		banktest.addAccount(accName);
		account = banktest.getAccount(1);
		account.setBalance(500);
		account.withdrawBalance(500, account);
		Assert.assertFalse(500 == account.getBalance());
	
	}
	

}

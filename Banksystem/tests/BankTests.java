package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;


import banksystem.Account;
import banksystem.Bank;

class BankTests {
	
	Bank banktest = new Bank();
	Account accounttest = new Account();
	
	
	String accName;
	Account account;
	Account chosenAccount1;
	Account chosenAccount2;
	Account thisAccount;
	int accNum;
	double balance;

	@Before
	public void setUp() throws Exception {
	   
	}
	
	@Test
	void addNewAccount() {
		banktest.addAccount(accName);
		Assert.assertTrue(true == banktest.addAccount(accName));
			
	}
	
	@Test
	void showAccountBalance() {

		banktest.addAccount(accName);
		thisAccount = banktest.getAccount(1);
		thisAccount.setBalance(500);
		banktest.displayAccountBalance(thisAccount);
		Assert.assertTrue(500  == thisAccount.getBalance());

	}
	
	@Test
	void TransferBalance() {
		
		banktest.addAccount(accName);
		banktest.addAccount(accName);
		chosenAccount1 = banktest.getAccount(1);
		chosenAccount1.setBalance(500);
		chosenAccount2 = banktest.getAccount(2);
		chosenAccount2.setBalance(0);
		banktest.transferBetweenAccounts(chosenAccount1, chosenAccount2, 200);
		Assert.assertTrue(300 == chosenAccount1.getBalance());
		Assert.assertTrue(200 == chosenAccount2.getBalance());
		
	}

}

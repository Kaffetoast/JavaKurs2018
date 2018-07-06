package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;


import banksystem.Account;
import banksystem.Bank;

class BankTests {
	
	Bank banktest = new Bank();
	Account accounttest = new Account();
	Account accounttest2 = new Account();
	public ArrayList<Account> accountList = new ArrayList<>();
	
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
	void transferBetweenAccounts() {
		banktest.addAccount(accName);
		account = banktest.getAccount(1);
		accounttest.setBalance(500);
		account = banktest.getAccount(2);
		accounttest2.setBalance(0);
		banktest.transferBetweenAccounts(accounttest, accounttest2, 250);
		Assert.assertTrue(250 == accounttest2.getBalance());
	}
	
	@Test
	void displayAllAccountsAndBalance() {
		banktest.addAccount(accName);
		banktest.displayAllAccountsAndBalance(accountList);
			
		}
	}


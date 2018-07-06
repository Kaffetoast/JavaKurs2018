package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import banksystem.Account;
import banksystem.Bank;

 

class AccountTests {

	public ArrayList<Account> accountList = new ArrayList<>();
	public ArrayList<String> transactionList = new ArrayList<String>();
	
	
	Bank banktest = new Bank();
	Account accounttest = new Account();
	Account accounttest2 = new Account();
	String accName;
	Account account;
	Account thisAccount;
	Account chosenAccount1;
	Account chosenAccount2;
	int accNum;
	double balance;
    
	
	
    int THREADS = 500;
    private ExecutorService executorService = Executors.newFixedThreadPool(THREADS);
    private CountDownLatch latch = new CountDownLatch(THREADS);
	
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
		accounttest.setBalance(100);
		accounttest.depositBalance(100);
		Assert.assertFalse(501 == account.getBalance());
		
	}
		
	
	@Test
	void depositToAccountMulitThread() {
        for(int i = 0; i < THREADS; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0; i < 100; i++) {
                        accounttest.depositBalance(100);
                    }
                    latch.countDown();
                }
            });
        }
        executorService.shutdown();
        try {
            latch.await();
            assertEquals(THREADS*10000, accounttest.getBalance());

        } catch(InterruptedException e) {

        }
    }

	
	@Test
	void withdrawFromAccount() {
		
		banktest.addAccount(accName);
		accounttest = banktest.getAccount(1);
		accounttest.setBalance(500);
		accounttest.withdrawBalance(200);
		Assert.assertTrue(300 == accounttest.getBalance());
	
	}
	
	@Test
	void withdrawFromAccountMultiThread() {

		banktest.addAccount(accName);
		accounttest = banktest.getAccount(1);
		accounttest.setBalance(1000);
		
        for(int i =0; i < THREADS; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    accounttest.withdrawBalance(1);
                    latch.countDown();
                }
            });
        }
        executorService.shutdown();
        try {
            latch.await();
            assertEquals(500, accounttest.getBalance());
        } catch(InterruptedException e) {

        }
    }

    
	
	@Test
	void showBalance() {
		banktest.addAccount(accName);
		accounttest = banktest.getAccount(1);
		accounttest.setBalance(500);
		banktest.displayAccountBalance(accounttest);
		Assert.assertTrue(500 == accounttest.getBalance());
	}

		
	

}

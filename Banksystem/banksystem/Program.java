package banksystem;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		Account chosenAccount1;
		Account chosenAccount2;
		int account = 0;
		int account2 = 0;
		double balance = 0;
		;
		Bank bank = new Bank();

		while (true) {

			System.out.println(" [1]. Create account");
			System.out.println(" [2]. Balance on all accounts");
			System.out.println(" [3]. Balance on chosen account");
			System.out.println(" [4]. Transaction history");
			System.out.println(" [5]. Deposit");
			System.out.println(" [6]. Withdraw");
			System.out.println(" [7]. Transfer to account");
			System.out.println(" [8]. Lock account");

			Account chosenAccount;

			switch (input.readLine()) {

			case "1":
				System.out.print("Enter account name:");
				bank.addAccount(input.readLine());
				System.out.println("--Account successfully created!--");
				break;
			case "2":
				bank.displayAllAccountsAndBalance(bank.accountList);
				if (bank.accountList.isEmpty()) {
					System.out.println("--There are no accounts!--");
				}
				break;
			case "3":
				if (bank.accountList.isEmpty()) {
					System.out.println("--There are no accounts!--");
				} else {

					System.out.println("--Choose account--");
					bank.displayAllAccounts(bank.accountList);
					try {
						bank.displayAccountBalance(bank.getAccount(Integer.parseInt(input.readLine())));
					} catch (NumberFormatException | NullPointerException e) {

					}
				}

				break;
			case "4":
				System.out.println("--Choose account--");
				bank.displayAllAccountsAndBalance(bank.accountList);
				try {
					account = Integer.parseInt(input.readLine());
				} catch (NumberFormatException e) {
					System.out.println("--Account " + account + " does not exist--");
					continue;
				}

				chosenAccount = bank.getAccount(account);
				if (chosenAccount != null) {
					chosenAccount.transactionHistory(chosenAccount.transactionList);
				} else {

				}
				break;
			case "5":
				System.out.println("--Choose account to deposit into--");
				bank.displayAllAccountsAndBalance(bank.accountList);
				try {
					account = Integer.parseInt(input.readLine());
					if (bank.accountExists(account)) {
						chosenAccount = bank.getAccount(account);
						System.out.println("--How much?--");

						balance = Double.parseDouble(input.readLine());
						boolean success = chosenAccount.depositBalance(balance, chosenAccount);
						if (success) {
							System.out.println("Success");
						} else {
							System.out.println("Failed");
						}

					} else {
						System.out.println("--Account" + account + "is missing--");
					}
				} catch (NumberFormatException | NullPointerException e) {
					continue;
				}

				break;

			case "6":
				System.out.println("--Choose account to withdraw from--");
				bank.displayAllAccountsAndBalance(bank.accountList);
				try {
					account = Integer.parseInt(input.readLine());
					if (bank.accountExists(account)) {
						chosenAccount = bank.getAccount(account);
						System.out.println("--How much?--");

						balance = Double.parseDouble(input.readLine());
						boolean success = chosenAccount.withdrawBalance(balance, chosenAccount);
						if (success) {
							System.out.println("Success");
						} else {
							System.out.println("Failed");
						}

					} else {
						System.out.println("--Account" + account + "is missing--");
					}
				} catch (NumberFormatException | NullPointerException e) {
					System.out.println("--Insufficent balance--");
					continue;
				}

				break;
			case "7":
				System.out.println("--Which account would you like to transfer from?--");
				bank.displayAllAccountsAndBalance(bank.accountList);
				try {
					account = Integer.parseInt(input.readLine()); //first account
					if (bank.accountExists(account)) {
						System.out.println("--Which account would you like to transfer to?--");

							account2 = Integer.parseInt(input.readLine()); //second account
							if (bank.accountExists(account2)) {
								System.out.println("--How much would you like to transfer?--");
									
								chosenAccount1 = bank.getAccount(account);
								chosenAccount2 = bank.getAccount(account2);
								
									balance = Double.parseDouble(input.readLine()); //money to transfer
									if (chosenAccount1.hasAmount(balance)) {
										bank.transferBetweenAccounts(chosenAccount1, chosenAccount2, balance);
										break;
									} else {
										System.out.println("--Not enough money on account--");
									}
								} 
							
							}
						}  catch (NumberFormatException | NullPointerException e) {
							System.out.println("--Numbers Only!--");
							continue;
				}

				break;
			case "8":
				System.out.println("--Which account would you like to lock?--");
				bank.displayAllAccounts(bank.accountList);
				try {
					account = Integer.parseInt(input.readLine());
					if (bank.accountExists(account)) {
						chosenAccount = bank.getAccount(account);
						if (chosenAccount != null) {
							chosenAccount.lockAccont(true, chosenAccount);
						} else {
							System.out.println("--AccountNr " + account + " is Missing!--");
						}
					}
				} catch (NumberFormatException e) {
					System.out.println("--Numbers Only!--");
					continue;

				}

				break;

			default:

			}

		}

	}

}
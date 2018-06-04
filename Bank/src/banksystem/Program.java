package banksystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		Account account;

		Bank bank = new Bank();

		while (true) {

			System.out.println(" [1]. Accounts");
			System.out.println(" [2]. Balance on all accounts");
			System.out.println(" [3]. Balance on one account");
			System.out.println(" [4]. Transaction history");
			System.out.println(" [5]. Deposit");
			System.out.println(" [6]. Withdraw");
			System.out.println(" [7]. Transfer to account");
			System.out.println(" [8]. Lock account");

		

			switch (input.readLine()) {
			
			case "1":
				bank.addAccount("hej");
				System.out.println("Account created");
				break;
			case "2":
				bank.displayAllAccounts(bank.accountList);
				break;
			case "3":
				
				break;
			case "4":

				break;
			case "5":

				break;

			default:

			}

		}

	}
}

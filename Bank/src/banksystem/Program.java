package banksystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		
		
		
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
				System.out.print("Enter account name:");
				bank.addAccount(input.readLine());
				System.out.println("--Account successfully created!--");
				break;
			case "2":
				bank.displayAllAccounts(bank.accountList);
				if(bank.accountList.isEmpty()) {
					System.out.println("--There are no accounts!--");
				}
				break;
			case "3":
				if(bank.accountList.isEmpty()) {
					System.out.println("--There are no accounts!--");
				}
				
				
				
				
				break;
			case "4":
				
				break;
			case "5":
				System.out.println("Deposit");
				
				break;
				
			case "6":
				System.out.println("Withdraw");
				
				break;
			case "7":
				System.out.println("Transfer to account");
				
				break;
			case "8":
				System.out.println("Lock account");
				
				break;

			default:

			}

		}

	}
}

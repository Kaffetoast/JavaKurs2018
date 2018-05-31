package banksystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		BankAccount account = new BankAccount(0);

		while (true) {

			System.out.println("");
			System.out.println(" [1]. Accounts");
			System.out.println(" [2]. Balance on all accounts");
			System.out.println(" [3]. Balance on one account");
			System.out.println(" [4]. Transaction history");
			System.out.println(" [5]. Deposit");
			System.out.println(" [6]. Withdraw");
			System.out.println(" [7]. Transfer to account");
			System.out.println(" [8]. Lock account");
			

			
			int choice = Integer.parseInt(input.readLine());

			switch (choice) {
			
			case 1: 
				
				
				break;
			case 2:
				
				
				break;
			case 3:
				
				
				break;
			case 4:
				
				
				break;
			case 5:
				
				
				break;

			
			}

	}

}
}

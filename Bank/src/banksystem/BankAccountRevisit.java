package banksystem;

public class BankAccountRevisit {

	private int balance;
	
	public BankAccountRevisit(int startBalance) {balance = startBalance;}
	
		public synchronized int getBalance() {
			return balance;
		}
		
		public  void deposit(int amount) {
			balance += amount;
			
		}
		
		public void withdraw(int amount) {
			balance += amount;
			
		}
}

package term2.daos.lesson16.udenTrådHåndtering;

public class BankAccount {

	private double balance;

	public void setBalance(double amount, String action) {
		if (action.equals("c")) {
			balance = balance + amount;
		}
		if (action.equals("d")){
			balance = balance - amount;
		}
		
	}

	public double getBalance() {
		return balance;
	}
}

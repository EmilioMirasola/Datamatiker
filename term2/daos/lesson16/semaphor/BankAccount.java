package term2.daos.lesson16.semaphor;

import java.util.concurrent.Semaphore;

public class BankAccount {

	private double balance;
	private final Semaphore s = new Semaphore(1);

	public void setBalance(double amount, String action) {
		try {
			s.acquire();
			if (action.equals("c")) {
				balance = balance + amount;
			}
			if (action.equals("d")) {
				balance = balance - amount;
			}
			s.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public double getBalance() {
		return balance;
	}
}

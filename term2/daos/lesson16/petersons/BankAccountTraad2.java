package term2.daos.lesson16.petersons;

public class BankAccountTraad2 extends Thread {

	private BankAccount ba;

	public BankAccountTraad2(BankAccount ba) {
		this.ba = ba;
	}

	public void run() {
		int i = 0;
		while (i < 4) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			TestBankAccount.setFlag(1, true);
			TestBankAccount.setTurn(0);

			while (TestBankAccount.getTurn() == 1 && TestBankAccount.getFlag(1))
				ba.setBalance(100, "d");
			TestBankAccount.setFlag(1, false);
			i++;
		}
		System.out.println("Balancen er: " + ba.getBalance());
	}

}

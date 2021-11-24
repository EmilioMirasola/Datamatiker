package term2.daos.lesson16.petersons;

public class BankAccountTraad extends Thread {

	private BankAccount ba;

	public BankAccountTraad(BankAccount ba) {
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
			TestBankAccount.setFlag(0, true);
			TestBankAccount.setTurn(1);

			while (TestBankAccount.getTurn() == 1 && TestBankAccount.getFlag(1))

			TestBankAccount.setFlag(0, false);
				ba.setBalance(100, "c");
			i++;
		}
		System.out.println("Balancen er: " + ba.getBalance());
	}

}

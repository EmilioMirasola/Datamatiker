package term2.daos.lesson16.petersons;

public class TestBankAccount {

	private static boolean[] flag = new boolean[2];
	private static int turn = 1;

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		BankAccountTraad bat1 = new BankAccountTraad(ba);
		BankAccountTraad2 bat2 = new BankAccountTraad2(ba);

		bat1.start();
		bat2.start();
		try {
			bat1.join();
			bat2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("slut balancen er: " + ba.getBalance());
	}

	public static int getTurn() {
		return turn;
	}

	public static void setTurn(int turn) {
		TestBankAccount.turn = turn;
	}

	public static boolean getFlag(int i) {
		return flag[i];
	}

	public static void setFlag(int i, boolean flag) {
		TestBankAccount.flag[i] = flag;
	}
}

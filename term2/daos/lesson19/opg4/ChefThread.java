package term2.daos.lesson19.opg4;

public class ChefThread extends Thread {
	Common common;
	int chefNumber;

	public ChefThread(Common common, int chefNumber) {
		this.common = common;
		this.chefNumber = chefNumber;
	}

	@Override
	public void run() {
		while (true) {
			try {
				sleep((int) (Math.random() * 4000));
				common.makeOrder(chefNumber);
			} catch (InterruptedException e) {
				System.out.println("Exception: " + e.getMessage());
			}
		}
	}
}

package term2.daos.lesson19.opg1;

public class ChefThread extends Thread {
	Common common;

	public ChefThread(Common common) {
		this.common = common;
	}

	@Override
	public void run() {
		while (true) {
			try {
				sleep((int) (Math.random() * 1000));
				common.makeOrder();
			} catch (InterruptedException e) {
				System.out.println("Exception: " + e.getMessage());
			}
		}
	}
}

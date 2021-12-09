package term2.daos.lesson19.opg3;

public class WaiterThread extends Thread {
	Common common;

	public WaiterThread(Common common) {
		this.common = common;
	}

	@Override
	public void run() {
		while (true) {
			try {
				sleep((int) (Math.random() * 9000));
				common.addOrder();
			} catch (InterruptedException e) {
				System.out.println("Exception: " + e.getMessage());
			}
		}
	}
}

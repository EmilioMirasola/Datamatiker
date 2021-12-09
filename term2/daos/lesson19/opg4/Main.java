package term2.daos.lesson19.opg4;

public class Main {
	public static void main(String[] args) {
		Common common = new Common();
		ChefThread chefThread1 = new ChefThread(common, 1);
		ChefThread chefThread2 = new ChefThread(common, 2);

		for (int i = 0; i < 9; i++) {
			WaiterThread thread = new WaiterThread(common);
			thread.start();
		}

		chefThread1.start();
		chefThread2.start();
	}
}

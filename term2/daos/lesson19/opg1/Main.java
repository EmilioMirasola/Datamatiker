package term2.daos.lesson19.opg1;

public class Main {
	public static void main(String[] args) {
		Common common = new Common();
		WaiterThread waiterThread = new WaiterThread(common);
		ChefThread chefThread = new ChefThread(common);

		waiterThread.start();
		chefThread.start();
	}
}

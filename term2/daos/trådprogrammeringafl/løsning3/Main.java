package term2.daos.trådprogrammeringafl.løsning3;

public class Main {
	private static final boolean[] flags = new boolean[2];
	private static int turn = 1;

	public static void main(String[] args) {
		Counter counter = new Counter();
		ThreadCounter thread0 = new ThreadCounter(counter, 1000);
		ThreadCounter1 thread1 = new ThreadCounter1(counter, 500);

		thread0.start();
		thread1.start();

		try {
			thread0.join();
			thread1.join();
			System.out.println("Counter has value: " + counter.getCount());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static int getTurn() {
		return turn;
	}

	public static void setTurn(int turn) {
		Main.turn = turn;
	}

	public static boolean getFlag(int i) {
		return flags[i];
	}

	public static void setFlag(int i, boolean flag) {
		Main.flags[i] = flag;
	}
}

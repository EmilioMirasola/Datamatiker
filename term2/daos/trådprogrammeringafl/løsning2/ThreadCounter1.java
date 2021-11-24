package term2.daos.trådprogrammeringafl.løsning2;

public class ThreadCounter1 extends Thread {
	private final Counter counter;
	private final int randomTime;

	public ThreadCounter1(Counter counter, int randomTime) {
		this.counter = counter;
		this.randomTime = randomTime;
	}

	@Override
	public void run() {
		Main.setFlag(1, true);
		Main.setTurn(0);

		while (Main.getTurn() == 0 && Main.getFlag(0)) {
			System.out.println("");
		}

		for (int i = 0; i < 100; i++) {
			counter.increment(randomTime);
			counter.randomTime(randomTime);
		}
		Main.setFlag(1, false);
	}
}

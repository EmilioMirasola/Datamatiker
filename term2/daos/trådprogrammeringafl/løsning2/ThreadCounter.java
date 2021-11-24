package term2.daos.trådprogrammeringafl.løsning2;

public class ThreadCounter extends Thread {
	private final Counter counter;
	private final int randomTime;

	public ThreadCounter(Counter counter, int randomTime) {
		this.counter = counter;
		this.randomTime = randomTime;
	}

	@Override
	public void run() {
		Main.setFlag(0, true);
		Main.setTurn(1);

		while (Main.getTurn() == 1 && Main.getFlag(1)) {
			System.out.println("");
		}

		for (int i = 0; i < 100; i++) {
			counter.increment(randomTime);
			counter.randomTime(randomTime);
		}
		Main.setFlag(0, false);
	}
}

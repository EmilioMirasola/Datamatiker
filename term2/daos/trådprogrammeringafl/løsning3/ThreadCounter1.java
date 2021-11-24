package term2.daos.trådprogrammeringafl.løsning3;

public class ThreadCounter1 extends Thread {
	private final Counter counter;
	private final int randomTime;

	public ThreadCounter1(Counter counter, int randomTime) {
		this.counter = counter;
		this.randomTime = randomTime;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			counter.increment(randomTime);
			counter.randomTime(randomTime);
		}
	}
}

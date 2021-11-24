package term2.daos.trådprogrammeringafl.løsning1;

public class ThreadCounter extends Thread {
	private final Counter counter;
	private final int randomTime;

	public ThreadCounter(Counter counter, int randomTime) {
		this.counter = counter;
		this.randomTime = randomTime;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			counter.increment();
			counter.randomTime(randomTime);
		}
	}
}

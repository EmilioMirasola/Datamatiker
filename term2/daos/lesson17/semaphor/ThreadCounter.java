package term2.daos.lesson17.semaphor;

public class ThreadCounter extends Thread {
	private final Counter counter;
	private final int time;

	public ThreadCounter(Counter counter, int time) {
		this.counter = counter;
		this.time = time;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			counter.increment();
			counter.randomTime(time);
		}
		System.out.println("Fra tråd: " + counter.getCount());
	}
}

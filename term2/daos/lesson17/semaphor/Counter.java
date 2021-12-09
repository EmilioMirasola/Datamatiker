package term2.daos.lesson17.semaphor;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Counter {
	private int count = 0;
	private final Semaphore semaphore = new Semaphore(1);

	public Counter() {
	}

	public int getCount() {
		return count;
	}

	public void increment() {
		try {
			semaphore.acquire();
			int temp = count;
			randomTime(100000);
			count = temp + 1;
			semaphore.release();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void randomTime(int max) {
		Random r = new Random();
		int newMax = Math.abs(r.nextInt()) % max + 1;
		for (int i = 0; i < newMax; i++) {
			for (int j = 0; j < newMax; j++) {
				int rand = i + j - j;
			}
		}
	}

}

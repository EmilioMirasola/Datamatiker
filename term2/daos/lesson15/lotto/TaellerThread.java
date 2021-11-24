package term2.daos.lesson15.lotto;

import lombok.Getter;

public class TaellerThread extends Thread {

	@Getter
	int tal;

	/**
	 * TaellerThread() constructor
	 */
	public TaellerThread(int n) {
		tal = n;
	}

	/**
	 * run() er trådens primære metode.
	 */
	public void run() {
		for (int k = 0; k < 10; k++) {
			System.out.print(tal);
		} //for
	} // run()
} // TaellerThread 
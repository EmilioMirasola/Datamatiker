package term2.daos.trådprogrammeringafl.løsning1;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		ThreadCounter thread1 = new ThreadCounter(counter, 1000000);
		ThreadCounter thread2 = new ThreadCounter(counter, 100000);

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
			System.out.println("Counter has value: " + counter.getCount());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

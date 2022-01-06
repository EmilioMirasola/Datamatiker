package term2.eksamensforberedelse.singletons.opg1Counter;

public class Counter {
	private int value;
	private static Counter counter;

	private Counter() {
	}

	public static Counter getCounter() {
		if (counter == null) {
			counter = new Counter();
		}
		return counter;
	}

	public void count() {
		value++;
	}

	public void times2() {
		value *= 2;
	}

	public void zero() {
		value = 0;
	}

	public int getValue() {
		return value;
	}
}


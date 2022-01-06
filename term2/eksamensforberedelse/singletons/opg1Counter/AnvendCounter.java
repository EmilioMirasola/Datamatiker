package term2.eksamensforberedelse.singletons.opg1Counter;

public class AnvendCounter {
	public static void main(String[] args) {
		Counter counter = Counter.getCounter();
		int value;

		counter.count();
		value = counter.getValue();
		System.out.println("value = " + value);

		counter.times2();
		value = counter.getValue();
		System.out.println("value = " + value);

		counter.zero();
		value = counter.getValue();
		System.out.println("value = " + value);
	}
}

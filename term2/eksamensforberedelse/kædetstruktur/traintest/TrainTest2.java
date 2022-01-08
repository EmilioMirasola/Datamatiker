package term2.eksamensforberedelse.kædetstruktur.traintest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import term2.eksamensforberedelse.kædetstruktur.train.LinkedListTrain2;
import term2.eksamensforberedelse.kædetstruktur.train.WagonNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainTest2 {
	private WagonNode locomotive;

	private WagonNode carriage;
	private WagonNode platformWagon;
	private WagonNode centerbeam;
	private WagonNode autorack;
	private WagonNode hopper;

	@BeforeEach
	void setUp() throws Exception {
		this.locomotive = new WagonNode("Locomotive");

		this.carriage = new WagonNode("Passenger carriage");
		this.platformWagon = new WagonNode("Platform wagon");
		this.centerbeam = new WagonNode("Centerbeam");
		this.autorack = new WagonNode("Autorack");
		this.hopper = new WagonNode("Hopper");
	}

	@Test
	@Order(1)
	void test_linkedListTrain2_canAddLastWagon() {
		LinkedListTrain2 linkedListTrain2 = new LinkedListTrain2();

		linkedListTrain2.addFirst(autorack);
		linkedListTrain2.addFirst(centerbeam);
		linkedListTrain2.addFirst(platformWagon);
		linkedListTrain2.addFirst(carriage);
		linkedListTrain2.addFirst(locomotive);
		linkedListTrain2.addLast(hopper);

		assertEquals(hopper, linkedListTrain2.getLast());
	}

	@Test
	@Order(2)
	void test_linkedListTrain2_canAddLastWagon_empty_train() {
		LinkedListTrain2 linkedListTrain2 = new LinkedListTrain2();

		linkedListTrain2.addLast(hopper);

		assertEquals(hopper, linkedListTrain2.getLast());
	}
}

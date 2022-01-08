package term2.eksamensforberedelse.kædetstruktur.traintest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import term2.eksamensforberedelse.kædetstruktur.train.LinkedListTrain;
import term2.eksamensforberedelse.kædetstruktur.train.WagonNode;


@TestMethodOrder(OrderAnnotation.class)
class LinkedListTrainTest {
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
	void test_linkedListTrain_canAddFirstWagon() {
		// --------------------------------------------------
		// ARRANGE
		// --------------------------------------------------

		LinkedListTrain train = new LinkedListTrain();

		// --------------------------------------------------
		// ACT
		// --------------------------------------------------

		train.addFirst(hopper);
		train.addFirst(autorack);
		train.addFirst(centerbeam);
		train.addFirst(platformWagon);
		train.addFirst(carriage);
		train.addFirst(locomotive);

		// --------------------------------------------------
		// ASSERT
		// --------------------------------------------------

		WagonNode wagonSelected = train.getFirst();
		assertEquals(locomotive, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(carriage, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(platformWagon, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(centerbeam, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(autorack, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(hopper, wagonSelected);
	}

	@Test
	@Order(2)
	void test_linkedListTrain_canRemoveFirstWagon() {
		// --------------------------------------------------
		// ARRANGE
		// --------------------------------------------------

		LinkedListTrain train = new LinkedListTrain();
		train.addFirst(hopper);
		train.addFirst(autorack);
		train.addFirst(centerbeam);
		train.addFirst(platformWagon);
		train.addFirst(carriage);
		train.addFirst(locomotive);

		// --------------------------------------------------
		// ACT & ASSERT
		// --------------------------------------------------

		WagonNode wagonRemoved = train.removeFirst();
		assertEquals(locomotive, wagonRemoved);

		wagonRemoved = train.removeFirst();
		assertEquals(carriage, wagonRemoved);

		wagonRemoved = train.removeFirst();
		assertEquals(platformWagon, wagonRemoved);

		wagonRemoved = train.removeFirst();
		assertEquals(centerbeam, wagonRemoved);

		wagonRemoved = train.removeFirst();
		assertEquals(autorack, wagonRemoved);

		wagonRemoved = train.removeFirst();
		assertEquals(hopper, wagonRemoved);

		assertThrows(NoSuchElementException.class, () -> {
			train.removeFirst();
		});
	}

	@Test
	@Order(3)
	void test_linkedListTrain_canCountWagons() {
		// --------------------------------------------------
		// ARRANGE
		// --------------------------------------------------

		LinkedListTrain train = new LinkedListTrain();
		train.addFirst(hopper);
		train.addFirst(autorack);
		train.addFirst(centerbeam);
		train.addFirst(platformWagon);
		train.addFirst(carriage);
		train.addFirst(locomotive);

		// --------------------------------------------------
		// ACT & ASSERT
		// --------------------------------------------------

		for (int expectedCount = 6; expectedCount > 0; expectedCount--) {
			int actualCount = train.count();
			assertEquals(expectedCount, actualCount);
			train.removeFirst();
		}
	}

	@Test
	@Order(4)
	void test_linkedListTrain_canRemoveWagon() {
		// --------------------------------------------------
		// ARRANGE
		// --------------------------------------------------

		LinkedListTrain train = new LinkedListTrain();
		train.addFirst(hopper);
		train.addFirst(autorack);
		train.addFirst(centerbeam);
		train.addFirst(platformWagon);
		train.addFirst(carriage);
		train.addFirst(locomotive);

		// --------------------------------------------------
		// ACT & ASSERT
		// --------------------------------------------------

		boolean wagonWasRemoved = train.remove(autorack);
		assertTrue(wagonWasRemoved);

		WagonNode wagonSelected = train.getFirst();
		assertEquals(locomotive, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(carriage, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(platformWagon, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(centerbeam, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(hopper, wagonSelected);

		wagonWasRemoved = train.remove(autorack);
		assertFalse(wagonWasRemoved);
	}

	@Test
	@Order(5)
	void test_linkedListTrain_canInsertWagonAtPosition() {
		// --------------------------------------------------
		// ARRANGE
		// --------------------------------------------------

		LinkedListTrain train = new LinkedListTrain();
		train.addFirst(hopper);
		train.addFirst(centerbeam);
		train.addFirst(platformWagon);
		train.addFirst(carriage);
		train.addFirst(locomotive);

		// --------------------------------------------------
		// ACT
		// --------------------------------------------------

		train.insertAt(autorack, 4);

		// --------------------------------------------------
		// ASSERT
		// --------------------------------------------------

		WagonNode wagonSelected = train.getFirst();
		assertEquals(locomotive, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(carriage, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(platformWagon, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(centerbeam, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(autorack, wagonSelected);

		wagonSelected = wagonSelected.getNextWagon();
		assertEquals(hopper, wagonSelected);
	}

	@Test
	@Order(6)
	void test_linkedListTrain_canInsertWagonAtZero() {
		// --------------------------------------------------
		// ARRANGE
		// --------------------------------------------------

		LinkedListTrain train = new LinkedListTrain();
		train.addFirst(hopper);
		train.addFirst(centerbeam);
		train.addFirst(platformWagon);
		train.addFirst(carriage);
		train.addFirst(locomotive);

		// --------------------------------------------------
		// ACT
		// --------------------------------------------------

		train.insertAt(autorack, 0);

		// --------------------------------------------------
		// ASSERT
		// --------------------------------------------------

		WagonNode wagonSelected = train.getFirst();
		assertEquals(autorack, wagonSelected);
	}

	@Test
	@Order(7)
	void test_linkedListTrain_can_not_insert_out_of_bounds() {
		// --------------------------------------------------
		// ARRANGE
		// --------------------------------------------------

		LinkedListTrain train = new LinkedListTrain();
		train.addFirst(hopper);
		train.addFirst(centerbeam);
		train.addFirst(platformWagon);
		train.addFirst(carriage);
		train.addFirst(locomotive);

		// --------------------------------------------------
		// ACT
		// --------------------------------------------------

		assertThrows(NoSuchElementException.class, () -> train.insertAt(autorack, 6));
	}
}

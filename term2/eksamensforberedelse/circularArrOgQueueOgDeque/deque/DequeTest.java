package term2.eksamensforberedelse.circularArrOgQueueOgDeque.deque;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DequeTest {
	private CircularArrayDeque circularArrayDeque;

	@BeforeEach
	public void setup() {
		this.circularArrayDeque = new CircularArrayDeque(5);
	}

	@Test
	@Order(1)
	public void test_add_first() {
		circularArrayDeque.addFirst(1);
		assertEquals(1, circularArrayDeque.getFirst());
		assertEquals(1, circularArrayDeque.getLast());
	}

	@Test
	@Order(2)
	public void test_add_last() {
		circularArrayDeque.addLast(1);
		assertEquals(1, circularArrayDeque.getLast());
		assertEquals(1, circularArrayDeque.getFirst());
	}

	@Test
	@Order(3)
	public void test_remove_first() {
		circularArrayDeque.addFirst(1);
		circularArrayDeque.removeFirst();

		assertNull(circularArrayDeque.getFirst());
		assertNull(circularArrayDeque.getLast());
	}

	@Test
	@Order(4)
	public void test_remove_last() {
		circularArrayDeque.addFirst(1);
		circularArrayDeque.removeLast();

		assertNull(circularArrayDeque.getLast());
		assertNull(circularArrayDeque.getFirst());
	}

	@Test
	@Order(5)
	public void test_remove_last_multiple_elements() {
		circularArrayDeque.addFirst(1);
		circularArrayDeque.addLast(2);
		circularArrayDeque.removeLast();

		assertEquals(1, circularArrayDeque.getLast());
		assertEquals(1, circularArrayDeque.getFirst());
	}

	@Test
	@Order(6)
	public void test_remove_first_multiple_elements() {
		circularArrayDeque.addFirst(1);
		circularArrayDeque.addLast(2);
		circularArrayDeque.removeFirst();

		assertEquals(2, circularArrayDeque.getLast());
		assertEquals(2, circularArrayDeque.getFirst());
	}

	@Test
	@Order(7)
	public void test_wrap() {
		circularArrayDeque.addFirst(1);
		circularArrayDeque.addLast(2);
		circularArrayDeque.addLast(3);
		circularArrayDeque.addLast(4);
		circularArrayDeque.addLast(5);
		circularArrayDeque.removeFirst();

		assertEquals(2, circularArrayDeque.getFirst());
	}

	@Test
	@Order(8)
	public void test_full_resize() {
		circularArrayDeque.addFirst(1);
		circularArrayDeque.addLast(2);
		circularArrayDeque.addLast(3);
		circularArrayDeque.addLast(4);
		circularArrayDeque.addLast(5);
		circularArrayDeque.addFirst(6);

		assertEquals(10, circularArrayDeque.length());
	}

	@Test
	@Order(9)
	public void test_full_remove_and_add_last_position() {
		circularArrayDeque.addFirst(1);
		circularArrayDeque.addLast(2);
		circularArrayDeque.addLast(3);
		circularArrayDeque.addLast(4);
		circularArrayDeque.addLast(5);

		circularArrayDeque.removeLast();
		circularArrayDeque.addLast(6);

		assertEquals(6, circularArrayDeque.getLast());
	}

	@Test
	@Order(10)
	public void test_full_remove_and_add_first_position() {
		circularArrayDeque.addFirst(1);
		circularArrayDeque.addLast(2);
		circularArrayDeque.addLast(3);
		circularArrayDeque.addLast(4);
		circularArrayDeque.addLast(5);
		circularArrayDeque.addFirst(6);

		assertEquals(6, circularArrayDeque.size());
	}

	@Test
	@Order(11)
	public void test_full_expand() {
		circularArrayDeque.addFirst(1);
		circularArrayDeque.addLast(2);
		circularArrayDeque.addLast(3);
		circularArrayDeque.addLast(4);
		circularArrayDeque.addLast(5);


		assertEquals(5, circularArrayDeque.length());
		circularArrayDeque.addFirst(6);

		assertEquals(10, circularArrayDeque.length());
		circularArrayDeque.addFirst(7);
		circularArrayDeque.addLast(8);
		circularArrayDeque.addLast(9);
		circularArrayDeque.addLast(10);

		assertEquals(10, circularArrayDeque.length());
		circularArrayDeque.addLast(11);
		assertEquals(20, circularArrayDeque.length());


	}

	@Test
	@Order(12)
	public void test_resize_and_head_and_tail_pointing_correctly() {
		circularArrayDeque.addFirst(1);
		circularArrayDeque.addLast(2);
		circularArrayDeque.addLast(3);
		circularArrayDeque.addLast(4);
		circularArrayDeque.addLast(5);

		assertEquals(1, circularArrayDeque.getFirst());
		circularArrayDeque.addLast(6);
		assertEquals(1, circularArrayDeque.getFirst());
		assertEquals(6, circularArrayDeque.getLast());
	}
}

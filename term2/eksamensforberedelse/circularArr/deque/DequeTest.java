package term2.eksamensforberedelse.circularArr.deque;

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
	public void test_is_full() {
		circularArrayDeque.addFirst(1);
		circularArrayDeque.addLast(2);
		circularArrayDeque.addLast(3);
		circularArrayDeque.addLast(4);
		circularArrayDeque.addLast(5);

		assertThrows(RuntimeException.class, () -> circularArrayDeque.addLast(6));
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

		circularArrayDeque.removeLast();
		circularArrayDeque.addFirst(6);
		System.out.println(circularArrayDeque);
		assertEquals(6, circularArrayDeque.getFirst());
	}
}

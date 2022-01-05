package term2.eksamensforberedelse.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DropOutStackTest {
	private StackI stack;

	private Card card1;
	private Card card2;
	private Card card3;
	private Card card4;
	private Card card5;
	private Card card6;

	@BeforeEach
	void setUp() throws Exception {
		// --------------------------------------------------
		// ARRANGE
		// --------------------------------------------------

		this.stack = new ArrayDropOutStack(5);

		this.card1 = new Card("Spade", "Jack");
		this.card2 = new Card("Club", "2");
		this.card3 = new Card("Heart", "3");
		this.card4 = new Card("Heart", "4");
		this.card5 = new Card("Diamond", "5");
		this.card6 = new Card("Diamond", "6");
	}

	@Test
	@Order(1)
	void test_stack_drop_out() {
		stack.push(card1);
		stack.push(card2);
		stack.push(card3);
		stack.push(card4);
		stack.push(card5);
		stack.push(card6);
		System.out.println("stack = " + stack);
		assertEquals(5, stack.size());
	}

	@Test
	@Order(2)
	void test_stack_drop_out_multiple_times() {
		stack.push(card1);
		stack.push(card2);
		stack.push(card3);
		stack.push(card4);
		stack.push(card5);
		System.out.println("stack = " + stack);
		stack.push(card6);

		System.out.println("stack = " + stack);
		stack.push(card1);
		System.out.println("stack = " + stack);
		stack.push(card2);
		System.out.println("stack = " + stack);
		stack.push(card3);
		System.out.println("stack = " + stack);
		stack.push(card4);
		System.out.println("stack = " + stack);
		stack.push(card5);
		System.out.println("stack = " + stack);

	}

	class Card {
		public String symbol;
		public String ranking;

		public Card(String symbol, String ranking) {
			super();
			this.symbol = symbol;
			this.ranking = ranking;
		}

		@Override
		public String toString() {
			return this.symbol + ": " + this.ranking;
		}
	}
}



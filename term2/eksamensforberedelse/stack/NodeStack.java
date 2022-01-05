package term2.eksamensforberedelse.stack;

import java.util.NoSuchElementException;

public class NodeStack implements StackI {

	private Node top;
	private int size = 0;

	public NodeStack() {
	}

	@Override
	public void push(Object element) {
		Node prevTop = top;
		top = new Node(element);
		top.next = prevTop;
		size++;
	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		Node prevTop = top;
		top = top.next;
		size--;
		return prevTop.data;
	}

	@Override
	public Object peek() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return top.data;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	private class Node {
		public Object data;
		public Node next;

		public Node(Object data) {
			this.data = data;
		}
	}
}

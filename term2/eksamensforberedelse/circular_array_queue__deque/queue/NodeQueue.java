package term2.eksamensforberedelse.circular_array_queue__deque.queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI {

	private Node head;
	private Node tail;
	private int size;

	/**
	 * Constructs an empty queue.
	 */
	public NodeQueue() {
	}

	@Override
	public void enqueue(Object element) {
		Node oldTail = tail;
		Node node = new Node(element);
		tail = node;

		if (isEmpty()) {
			head = node;
		} else {
			oldTail.next = node;
		}
		size++;
	}

	@Override
	public Object dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		} else {
			Object data = head.data;
			head = head.next;
			size--;
			return data;
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}


	private class Node {
		private Object data;
		private Node next;

		public Node(Object data) {
			this.data = data;
		}
	}
}

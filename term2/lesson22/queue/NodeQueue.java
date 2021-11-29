package term2.lesson22.queue;

import java.util.NoSuchElementException;



//DENNE BURDE VÆRE VENDT OM FORDI DEQUE KOSTER O(N)

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI {

	private final Node[] nodes;
	private int currentSize = 0;
	private Node tail;
	private Node head;

	/**
	 * Constructs an empty queue.
	 */
	public NodeQueue(int size) {
		this.nodes = new Node[size];
	}

	@Override
	public void enqueue(Object element) {
		Node node = new Node(element);
		if (isEmpty()) {
			this.head = node;
		} else if (this.tail == null) {
			this.tail = node;
			node.next = this.head;
		} else {
			Node temp = this.tail;
			this.tail = node;
			this.tail.next = temp;
		}
		currentSize++;
	}

	@Override
	public Object dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException("Listen er tom");
		}

		Node temp = this.head;
		Node currentNode = this.tail;
		while (currentNode != null) {
			if (currentNode.next == this.head) {
				this.head = currentNode;
			}
			currentNode = currentNode.next;
		}

		currentSize--;
		return temp.data;
	}

	@Override
	public int size() {
		return currentSize;
	}

	@Override
	public boolean isEmpty() {
		return currentSize == 0;
	}

	static class Node {
		public Object data;
		public Node next;

		public Node(Object element) {
			this.data = element;
		}
	}
}

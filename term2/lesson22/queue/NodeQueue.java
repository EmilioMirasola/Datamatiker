package term2.lesson22.queue;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI {
	private Node[] nodes;
	private Node first;
	private Node last;
	private int currentSize;

	/**
	 * Constructs an empty queue.
	 */
	public NodeQueue(int size) {
		this.nodes = new Node[size];
	}

	@Override
	public void enqueue(Object element) {
		Node newNode = new Node(element);
		if (last != null) {
			last.next = newNode;
		}
		if (isEmpty()) {
			first = newNode;
		}
		nodes[currentSize] = newNode;
		last = newNode;
		currentSize++;
	}

	@Override
	public Object dequeue() {
		Node removed = first;
		if (removed != null) {
			first = removed.next;
		}
		first = removed.next;
		currentSize--;
		return removed.data;
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

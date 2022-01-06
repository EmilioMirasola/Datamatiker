package term2.eksamensforberedelse.circular_array_queue__deque.deque;

public class CircularArrayDeque implements DequeI {

	private Object[] deque;
	private int head = 1;
	private int tail = 0;
	private int size;

	public CircularArrayDeque(int size) {
		this.deque = new Object[size];
	}

	@Override
	public void addFirst(Object element) {
		resizeIfNecessary();

		if (head == 0) {
			head = deque.length - 1;
		} else {
			head--;
		}

		if (isEmpty()) {
			tail = head;
		}

		deque[head] = element;
		size++;
	}

	private void resizeIfNecessary() {
		if (isFull()) {
			Object[] newElements = new Object[2 * deque.length];
			for (int i = 0; i < deque.length; i++) {
				newElements[i] = deque[(head + i) % deque.length];
			}
			deque = newElements;
			head = 0;
			tail = size;
		}
	}


	@Override
	public void addLast(Object element) {
		resizeIfNecessary();

		if (tail == deque.length - 1) {
			tail = 0;
		} else {
			tail++;
		}

		if (isEmpty()) {
			head = tail;
		}

		deque[tail] = element;
		size++;
	}

	@Override
	public Object removeFirst() {
		Object toBeRemoved = deque[head];
		deque[head] = null;
		if (head == deque.length - 1) {
			head = 0;
		} else {
			head++;
		}
		size--;


		return toBeRemoved;
	}

	@Override
	public Object removeLast() {

		Object toBeRemoved = deque[tail];
		deque[tail] = null;
		if (tail == 0) {
			tail = deque.length - 1;
		} else {
			tail--;
		}
		size--;

		return toBeRemoved;
	}

	@Override
	public Object getFirst() {
		return deque[head];
	}

	@Override
	public Object getLast() {
		return deque[tail];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	private boolean isFull() {
		return size == deque.length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj : deque) {
			if (obj != null) {
				sb.append(obj);
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	public int length() {
		return deque.length;
	}
}

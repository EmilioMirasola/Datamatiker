package term2.lesson22.deque;

public class CircularArrayDeque implements DequeI {
	private Object[] array;
	private int size;
	private int head;
	private int tail;

	public CircularArrayDeque(Object[] array, int size, int head, int tail) {
		this.array = array;
		this.size = size;
		this.head = head;
		this.tail = tail;
	}

	@Override
	public void addFirst(Object element) {
		if (size == array.length) {
			growIfNecessary();
		}
		if (head == 0) {
			head = array.length - 1;
		} else {
			head--;
		}
		array[head] = element;
		size++;
	}

	private void growIfNecessary() {
	}

	@Override
	public void addLast(Object element) {
		if (size == array.length - 1) {
			growIfNecessary();
		}

	}

	@Override
	public Object removeFirst() {
		return null;
	}

	@Override
	public Object removeLast() {
		return null;
	}

	@Override
	public Object getFirst() {
		return null;
	}

	@Override
	public Object getLast() {
		return null;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}
}

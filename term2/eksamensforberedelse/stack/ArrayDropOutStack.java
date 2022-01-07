package term2.eksamensforberedelse.stack;

import java.util.NoSuchElementException;

public class ArrayDropOutStack implements DropOutStackI {
	private final Object[] stack;
	private int head;
	private int tail;
	private int size;

	public ArrayDropOutStack(int size) {
		this.stack = new Object[size];
	}

	@Override
	public void push(Object element) {
		if (isFull() || isEmpty()) {
			stack[tail] = element;
			tail = size % stack.length;
		} else {
			stack[head] = element;
		}

		//only count size up if stack is not full
		if (!isFull()) {
			size++;
		}

		head = size % stack.length;
	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		size--;
		head = size % stack.length;

		Object prevTop = stack[head];
		stack[head] = null;
		return prevTop;
	}

	@Override
	public Object peek() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return stack[head];
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
		return head == stack.length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		for (Object obj : stack) {
			if (obj != null) {
				sb.append(obj.toString());
				sb.append(", ");
			}
		}
		sb.append(" ]");
		return sb.toString();
	}
}

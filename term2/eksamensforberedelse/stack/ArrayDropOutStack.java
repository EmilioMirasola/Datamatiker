package term2.eksamensforberedelse.stack;

import java.util.NoSuchElementException;

public class ArrayDropOutStack implements DropOutStackI {
	private final Object[] stack;
	private int top;
	private int oldest;
	private int size;

	public ArrayDropOutStack(int size) {
		this.stack = new Object[size];
	}

	@Override
	public void push(Object element) {
		if (isFull()) {
			stack[oldest] = element;
			oldest++;
			if (oldest > stack.length - 1) {
				oldest = 0;
			}
		} else {
			stack[top] = element;
			top++;
			size++;
		}
	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		Object prevTop = stack[top];
		top--;
		size--;
		return prevTop;
	}

	@Override
	public Object peek() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return stack[top];
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
		return top == stack.length;
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

package term2.eksamensforberedelse.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayListStack implements StackI {
	private final List<Object> stack;
	private int top = -1;

	public ArrayListStack() {
		this.stack = new ArrayList<>();
	}

	@Override
	public void push(Object element) {
		this.stack.add(element);
		top++;
	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		Object prevTop = stack.remove(top);
		top--;
		return prevTop;
	}

	@Override
	public Object peek() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return stack.get(top);
	}

	@Override
	public int size() {
		return stack.size();
	}

	@Override
	public boolean isEmpty() {
		return stack.size() == 0;
	}
}

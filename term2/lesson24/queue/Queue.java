package term2.lesson24.queue;

import java.util.NoSuchElementException;

public class Queue<T> {
	private Object[] elements;
	private int currentSize;
	private int head;
	private int tail;

	/**
	 * Constructs an empty queue.
	 */
	public Queue(int size) {
		elements = new Object[5];
		currentSize = 0;
		head = 0;
		tail = 0;
	}

	/**
	 * Adds an element to the tail of this queue.
	 *
	 * @param element the element to add
	 */
	public void enqueue(T element) {
		growIfNecessary();
		currentSize++;
		elements[tail] = element;
		tail = (tail + 1) % elements.length;
	}

	/**
	 * Removes an element from the head of this queue.
	 *
	 * @return the removed element
	 */
	public T dequeue() {
		if (currentSize == 0) {
			throw new NoSuchElementException();
		}
		T removed = (T) elements[head];
		head = (head + 1) % elements.length;
		currentSize--;
		return removed;
	}

	/**
	 * The number of elements in this queue.
	 *
	 * @return the number of elements in this queue
	 */
	public int size() {
		return currentSize;
	}

	/**
	 * Checks whether this queue is empty.
	 *
	 * @return true if this queue is empty
	 */
	public boolean isEmpty() {
		return currentSize == 0;
	}

	/**
	 * Grows the element array if the current size equals the capacity.
	 */
	private void growIfNecessary() {
		if (currentSize == elements.length) {
			Object[] newElements = new Object[2 * elements.length];
			for (int i = 0; i < elements.length; i++) {
				newElements[i] = elements[(head + i) % elements.length];
			}
			elements = newElements;
			head = 0;
			tail = currentSize;
		}
	}
}

package term2.eksamensforberedelse.kædetstruktur.train;

import java.util.NoSuchElementException;

public class LinkedListTrain {
	private WagonNode firstWagon;
	private int size;

	/**
	 * Constructs an empty linked list train.
	 */
	public LinkedListTrain() {
		this.firstWagon = null;
	}

	/**
	 * Returns the first wagon node in the linked list train.
	 *
	 * @return the first wagon node
	 * @throws NoSuchElementException if the train has no wagon nodes
	 */
	public WagonNode getFirst() {
		if (this.firstWagon == null) {
			throw new NoSuchElementException();
		}
		return this.firstWagon;
	}

	/**
	 * Adds a wagon node to the front of the linked list train.
	 *
	 * @param wagon the wagon node to add
	 */
	public void addFirst(WagonNode wagon) {
		WagonNode oldFirst = firstWagon;
		firstWagon = wagon;
		firstWagon.setNextWagon(oldFirst);

		if (oldFirst != null) {
			oldFirst.setPreviousWagon(firstWagon);
		}
		size++;
	}

	/**
	 * Removes the first wagon node in the linked list train.
	 *
	 * @return the removed wagon node
	 * @throws NoSuchElementException if the train has no wagon nodes
	 */
	public WagonNode removeFirst() {
		if (firstWagon == null) {
			throw new NoSuchElementException();
		}

		WagonNode oldFirst = firstWagon;
		firstWagon = firstWagon.getNextWagon();
		size--;

		return oldFirst;
	}

	/**
	 * Counts the total number of wagon nodes in the linked list train.
	 *
	 * @return the number of wagon nodes
	 */
	public int count() {
		return size;
	}

	/**
	 * Removes the first wagon node in the linked list train.
	 *
	 * @param wagon the wagon node to remove
	 * @return <code>true</code> if the wagon node was found and removed;
	 * <code>false</code> otherwise
	 */
	public boolean remove(WagonNode wagon) {
		boolean found = false;
		WagonNode current = firstWagon;

		while (!found && current != null) {
			if (current == wagon) {
				found = true;
				current.getPreviousWagon().setNextWagon(current.getNextWagon());
			} else {
				current = current.getNextWagon();
			}

		}

		return found;
	}


	/**
	 * Inserts a wagon node at a given position in the linked list train.
	 *
	 * @param wagon    the wagon node to add
	 * @param position the position where to add the wagon node
	 */
	public void insertAt(WagonNode wagon, int position) {
		if (position >= size) {
			throw new NoSuchElementException();
		}

		int i = 0;
		WagonNode current = firstWagon;

		while (i != position) {
			current = current.getNextWagon();
			i++;
		}

		if (current == firstWagon) {
			WagonNode oldFirst = firstWagon;
			firstWagon = wagon;
			firstWagon.setNextWagon(oldFirst);
		} else {
			wagon.setNextWagon(current);
			current.getPreviousWagon().setNextWagon(wagon);
		}
	}
}

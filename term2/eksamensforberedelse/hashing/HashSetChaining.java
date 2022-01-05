package term2.eksamensforberedelse.hashing;

/**
 * This class implements a hash set using separate chaining.
 */
public class HashSetChaining {
	private Node[] buckets;
	private int currentSize;

	/**
	 * Constructs a hash table.
	 *
	 * @param bucketsLength the length of the buckets array
	 */
	public HashSetChaining(int bucketsLength) {
		buckets = new Node[bucketsLength];
		currentSize = 0;
	}

	/**
	 * Tests for set membership.
	 *
	 * @param x an object
	 * @return true if x is an element of this set
	 */
	public boolean contains(Object x) {
		int h = hashValue(x);
		Node current = buckets[h];
		boolean found = false;
		while (!found && current != null) {
			if (current.data.equals(x)) {
				found = true;
			} else {
				current = current.next;
			}
		}
		return found;
	}

	/**
	 * Adds an element to this set.
	 *
	 * @param x an object
	 * @return true if x is a new object, false if x was already in the set
	 */
	public boolean add(Object x) {
		int h = hashValue(x);

		if ((double) currentSize / buckets.length > 0.75) {
			rehash();
		}

		Node current = buckets[h];
		boolean found = false;
		while (!found && current != null) {
			if (current.data.equals(x)) {
				found = true;
				// Already in the set
			} else {
				current = current.next;
			}

		}
		if (!found) {
			Node newNode = new Node();
			newNode.data = x;
			newNode.next = buckets[h];
			buckets[h] = newNode;
			currentSize++;
		}
		return !found;
	}

	/**
	 * Removes an object from this set.
	 *
	 * @param x an object
	 * @return true if x was removed from this set, false if x was not an
	 * element of this set
	 */
	public boolean remove(Object x) {
		int h = hashValue(x);

		boolean found = false;

		//check if root of bucket is equal to as other behaviour is needed (need to change root)
		if (buckets[h].data.equals(x)) {
			buckets[h] = buckets[h].next;
			currentSize--;
		} else {
			Node current = buckets[h];
			Node previous = buckets[h];

			while (!found && current != null) {
				//if current is equal, set previous node to point on current next node, so reference to current is removed in links
				if (current.data.equals(x)) {
					previous.next = current.next;
					found = true;
					currentSize--;
				} else {
					previous = current;
					current = current.next;
				}
			}
		}

		return found;
	}

	private int hashValue(Object x) {
		int h = x.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % buckets.length;
		return h;
	}

	/**
	 * Gets the number of elements in this set.
	 *
	 * @return the number of elements
	 */
	public int size() {
		return currentSize;
	}

	private void rehash() {
		//Make new array twice as long, assign it to instance variable
		Node[] old = buckets;
		buckets = new Node[buckets.length * 2];

		//Reset size (will be counter again later by the add method)
		currentSize = 0;

		//Add all nodes of old array to new array again using the add method. It will count size again + use the new correct hashvalue
		for (Node node : old) {
			Node current = node;
			if (node != null) {
				while (current != null) {
					this.add(current.data);
					current = current.next;
				}
			}
		}
	}

	// method only for test purpose
	void writeOut() {
		for (int i = 0; i < buckets.length; i++) {
			Node temp = buckets[i];
			if (temp != null) {
				System.out.print(i + "\t");
				while (temp != null) {
					System.out.print(temp.data + "\t");
					temp = temp.next;
				}
				System.out.println();
			}
		}
	}

	class Node {
		public Object data;
		public Node next;
	}

}

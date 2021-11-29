package term2.lesson23.hashsetstudent;

/**
 * This class implements a hash set using separate chaining.
 */
public class HashSetLinearProbing {
	private Object[] buckets;
	private int currentSize;
	private static final String DELETED = "DELETED";

	/**
	 * Constructs a hash table.
	 *
	 * @param bucketsLength the length of the buckets array
	 */
	public HashSetLinearProbing(int bucketsLength) {
		buckets = new Object[bucketsLength];
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

		boolean found = false;
		int searchIndex = h;

		while (!found) {
			if (buckets[searchIndex] == x) {
				found = true;
			} else if (buckets[searchIndex] == null) {
				return false;
			} else {
				if (searchIndex == buckets.length - 1) {
					searchIndex = 0;
				} else {
					searchIndex++;
				}
			}
		}

		return true;
	}

	/**
	 * Adds an element to this set.
	 *
	 * @param x an object
	 * @return true if x is a new object, false if x was already in the set
	 */
	public boolean add(Object x) {
		int h = hashValue(x);

		if (buckets[h] != null) {
			if (buckets[h].equals(x)) {
				return false;
			} else {
				int openSpot = findOpenSpot(h);
				buckets[openSpot] = x;
				currentSize++;
				return true;
			}
		} else {
			buckets[h] = x;
			currentSize++;
			return true;
		}
	}

	private int findOpenSpot(int h) {
		boolean found = false;
		int target = h + 1;
		while (!found) {

			if (target >= buckets.length) {
				target -= buckets.length;
			}

			if (buckets[target] == null) {
				found = true;
			} else {
				target++;
			}
		}

		return target;
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

		boolean removed = false;
		int searchIndex = h;

		while (!removed) {
			if (buckets[searchIndex] == x) {
				buckets[searchIndex] = null;
				removed = true;
			} else {
				if (searchIndex == buckets.length - 1) {
					searchIndex = 0;
				} else {
					searchIndex++;
				}
			}
		}

		return true;
	}

	/**
	 * Gets the number of elements in this set.
	 *
	 * @return the number of elements
	 */
	public int size() {
		return currentSize;
	}

	private int hashValue(Object x) {
		int h = x.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % buckets.length;
		return h;
	}

	// method only for test purpose
	public void writeOut() {
		for (int i = 0; i < buckets.length; i++) {
			System.out.println(i + "\t" + buckets[i]);
		}
	}

}

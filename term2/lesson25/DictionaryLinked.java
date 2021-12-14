package term2.lesson25;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

	private Node start;
	private int size;

	/**
	 * HashingMap constructor comment.
	 */

	public DictionaryLinked() {
//		 Sentinel (tomt listehoved - der ikke indeholder data)
		start = new Node();
		size = 0;
	}

	@Override
	public V get(K key) {
		boolean found = false;
		Node current = start;

		while (current.next != null && !found) {
			current = current.next;
			if (current.key.equals(key)) {
				found = true;
			}
		}

		if (found) {
			return current.value;
		} else {
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public V put(K key, V value) {
		boolean found = false;
		Node current = start;

		while (current.next != null && !found) {
			current = current.next;
			if (current.key.equals(key)) {
				found = true;
			}
		}

		if (found) {
			current.value = value;
			return current.value;
		} else {
			Node node = new Node();
			node.value = value;
			node.key = key;

			current.next = node;
			return current.next.value;
		}
	}

	@Override
	public V remove(K key) {
		boolean found = false;
		Node current = start;
		Node previous = null;

		while (current.next != null && !found) {
			previous = current;
			current = current.next;
			if (current.key.equals(key)) {
				found = true;
			}
		}

		if (found) {
			V val = current.value;
			previous.next = current.next;
			return current.value;
		} else {
			return null;
		}
	}

	@Override
	public int size() {
		return size;
	}

	private class Node {
		Node next;
		K key;
		V value;
	}


	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("{");
		Node current = start;

		while (current.next != null) {
			s.append(current.key);
			s.append(" , ");
			s.append(current.value);
			current = current.next;
		}

		s.append("}");
		return s.toString();
	}
}

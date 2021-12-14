package term2.dictAflevering;

import term2.lesson25.Dictionary;

import java.util.HashMap;
import java.util.Map;

public class DictionaryHashMap<K, V> implements Dictionary<K, V> {

	private Map<K, V>[] tabel;
	private static int N = 10;

	/**
	 * HashingMap constructor comment.
	 */

	public DictionaryHashMap() {
		tabel = new HashMap[N];
		for (int i = 0; i < N; i++) {
			tabel[i] = new HashMap<K, V>();
		}
	}

	@Override
	public V get(K key) {
		int i = key.hashCode() % N;
		Map<K, V> m = tabel[i];
		return m.get(key);
	}

	@Override
	public boolean isEmpty() {
		boolean empty = true;
		int i = 0;
		while (empty && i < N) {
			empty = (tabel[i]).isEmpty();
			i++;
		}
		return empty;
	}

	@Override
	public V put(K key, V value) {
		if (key == null || value == null) {
			throw new IllegalArgumentException("Null values not allowed");
		}

		int hashCode = key.hashCode() % N;

		V prevValue = tabel[hashCode].get(key);
		tabel[hashCode].put(key, value);

		return prevValue;
	}

	@Override
	public V remove(K key) {
		int hashCode = key.hashCode();

		V removedValue = tabel[hashCode].get(key);
		tabel[hashCode].remove(key);
		return removedValue;
	}

	@Override
	public int size() {
		int i = 0;
		int size = 0;

		while (i < N) {
			size += tabel[i].size();
			i++;
		}
		return size;
	}

}

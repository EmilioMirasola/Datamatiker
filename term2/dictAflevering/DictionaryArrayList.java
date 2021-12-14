package term2.dictAflevering;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DictionaryArrayList<K, V> implements Dictionary<K, V> {

	private ArrayList<Map<K, V>> tabel;
	private static int N = 10;

	DictionaryArrayList() {
		tabel = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			tabel.set(i, new HashMap<K, V>());
		}
	}

	@Override
	public V get(K key) {
		int i = key.hashCode() % N;
		Map<K, V> m = tabel.get(i);
		return m.get(key);
	}

	@Override
	public boolean isEmpty() {
		boolean empty = true;
		int i = 0;
		while (empty && i < N) {
			empty = (tabel.get(i)).isEmpty();
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

		V prevValue = tabel.get(hashCode).get(key);
		tabel.get(hashCode).put(key, value);

		return prevValue;
	}

	@Override
	public V remove(K key) {
		int hashCode = key.hashCode();

		V removedValue = tabel.get(hashCode).get(key);
		tabel.get(hashCode).remove(key);
		return removedValue;
	}

	@Override
	public int size() {
		int i = 0;
		int size = 0;

		while (i < N) {
			size += tabel.get(i).size();
			i++;
		}
		return size;
	}
}

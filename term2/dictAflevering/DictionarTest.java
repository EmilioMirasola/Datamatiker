package term2.dictAflevering;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import term2.lesson25.Dictionary;

import static org.junit.jupiter.api.Assertions.*;

public class DictionarTest {
	Dictionary<Integer, String> dictionary;


	@BeforeEach
	public void setUp() throws Exception {
		this.dictionary = new DictionaryHashMap<>();
	}

	@Test
	public void test() {
		assertTrue(dictionary.isEmpty());
		assertEquals(0, dictionary.size());

		dictionary.put(8, "hans");
		dictionary.put(3, "viggo");

		assertFalse(dictionary.isEmpty());
		assertEquals(2, dictionary.size());

		assertEquals("hans", dictionary.get(8));

		dictionary.put(7, "bent");
		dictionary.put(2, "lene");

		assertFalse(dictionary.isEmpty());
		assertEquals(4, dictionary.size());

		assertEquals("viggo", dictionary.remove(3));

		assertEquals(3, dictionary.size());

		assertEquals("hans", dictionary.put(8, "Ida"));
		assertEquals("Ida", dictionary.get(8));
	}

	@Test
	public void test_not_null_key() {
		assertThrows(IllegalArgumentException.class, () -> dictionary.put(null, "test"));
	}

	@Test
	public void test_not_null_value() {
		assertThrows(IllegalArgumentException.class, () -> dictionary.put(1, null));
	}

	@Test
	public void test_not_null_key_and_value() {
		assertThrows(IllegalArgumentException.class, () -> dictionary.put(null, null));
	}

	@Test
	public void test_not_incrementing_on_duplicate() {
		dictionary.put(1, "test");
		dictionary.put(1, "test");

		assertEquals(dictionary.size(), 1);

	}

}

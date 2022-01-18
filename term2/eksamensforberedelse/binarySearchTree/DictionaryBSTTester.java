package term2.eksamensforberedelse.binarySearchTree;

public class DictionaryBSTTester {
	public static void main(String[] args) {
		DictionaryBST<String, String> dictionary = new DictionaryBST<>();

		System.out.println("dictionary.size() = " + dictionary.size());
		String removed = dictionary.put("Emilio", "Mirasola");
		System.out.println("removed = " + removed);
		System.out.println();

		System.out.println("dictionary.size() = " + dictionary.size());
		removed = dictionary.put("Emilio", "Christian");
		System.out.println("removed = " + removed);
		System.out.println();

		System.out.println("dictionary.size() = " + dictionary.size());
		removed = dictionary.put("Erminia", "Mirasola");
		System.out.println("removed = " + removed);

		System.out.println("dictionary.size() = " + dictionary.size());
		System.out.println();

		dictionary.print();
	}
}

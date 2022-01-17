package term2.eksamensforberedelse.simpelSortering;

import java.util.Arrays;

public class InsertionSortStrings {
	static String[] strings = {"Erna", "Elly", "Laurits", "Bertha", "Christian",
			"August", "Marius", "John", "Tove", "Poul", "Torkild"};

	public static void main(String[] args) {

		for (int i = 1; i < strings.length; i++) {
			String element = strings[i];

			int position = i;
			while (position > 0 && strings[position - 1].compareTo(element) > 0) {
				strings[position] = strings[position - 1];
				position--;
			}

			strings[position] = element;
		}
		System.out.println("strings = " + Arrays.toString(strings));
	}

}

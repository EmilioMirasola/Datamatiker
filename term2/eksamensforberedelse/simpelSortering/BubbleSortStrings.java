package term2.eksamensforberedelse.simpelSortering;

import java.util.Arrays;

public class BubbleSortStrings {
	static String[] strings = {"Erna", "Elly", "Laurits", "Bertha", "Christian",
			"August", "Marius", "John", "Tove", "Poul", "Torkild"};

	public static void main(String[] args) {

		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < i; j++) {
				if (strings[j].compareTo(strings[j + 1]) > 0) {
					swap(j, j + 1);
				}
			}
		}

		System.out.println("strings = " + Arrays.toString(strings));
	}

	public static void swap(int i1, int i2) {
		String temp = strings[i2];
		strings[i2] = strings[i1];
		strings[i1] = temp;
	}
}

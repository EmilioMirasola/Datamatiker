package term2.eksamensforberedelse.simpelSortering;

import java.util.Arrays;

public class StringSelectionSort {
	static String[] strings = {"Erna", "Elly", "Laurits", "Bertha", "Christian",
			"August", "Marius", "John", "Tove", "Poul", "Torkild"};

	public static void main(String[] args) {
		System.out.println("strings = " + Arrays.toString(strings));

		for (int i = 0; i < strings.length; i++) {
			int currentMinimumIndex = i;

			for (int j = i + 1; j < strings.length; j++) {
				if (strings[j].compareTo(strings[currentMinimumIndex]) < 0) {
					currentMinimumIndex = j;
				}
			}
			swap(i, currentMinimumIndex);
		}
		System.out.println("strings sorted = " + Arrays.toString(strings));
	}

	private static void swap(int i, int minimumIndex) {
		String temp = strings[i];
		strings[i] = strings[minimumIndex];
		strings[minimumIndex] = temp;
	}
}

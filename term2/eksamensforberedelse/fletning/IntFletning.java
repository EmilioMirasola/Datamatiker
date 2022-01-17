package term2.eksamensforberedelse.fletning;

import java.util.Arrays;

public class IntFletning {
	public static void main(String[] args) {
		int[] l1 = {2, 4, 6, 8, 10, 12, 14};
		int[] l2 = {1, 2, 4, 5, 6, 9, 12, 17};

		int[] flettet = fællesTal(l1, l2);

		System.out.println("flettet = " + Arrays.toString(flettet));
	}

	@SuppressWarnings("NonAsciiCharacters")
	private static int[] fællesTal(int[] l1, int[] l2) {
		int[] fælles = new int[l1.length + l2.length];
		int fællesArrayKommetTilIndeks = 0;

		int i1 = 0;
		int i2 = 0;

		while (i1 < l1.length - 1 && i2 < l2.length - 1) {
			if (l1[i1] < l2[i2]) {
				i1++;
			} else if (l1[i1] > l2[i2]) {
				i2++;
			} else {
				fælles[fællesArrayKommetTilIndeks] = l1[i1];
				fællesArrayKommetTilIndeks++;
				i1++;
				i2++;
			}
		}

		//Slicer den del af fælles arrayet af, der ikke er udfyldt
		return Arrays.copyOfRange(fælles, 0, fællesArrayKommetTilIndeks);
	}
}

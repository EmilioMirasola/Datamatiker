package term2.nisseopgaver;

import java.util.ArrayList;

public class Opg2 {
	public static void main(String[] args) {
//		System.out.println("650 KR, antal øl: " + calcNumberOfBeersByPriceAndCash(650, 6));
//		System.out.println("8000 KR, antal øl: " + calcNumberOfBeersByPriceAndCash(8000, 6));
//		System.out.println("1202 KR, antal øl: " + calcNumberOfBeersByPriceAndCash(1202, 6));

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		System.out.println(erDerLysITræet(list));
	}

	public static int calcNumberOfBeersByPriceAndCash(int cash, int price) {
		if (cash < price) {
			return 0;
		} else {
			return 1 + calcNumberOfBeersByPriceAndCash(cash - price, price);
		}
	}

	public static boolean erDerLysITræet(ArrayList<Integer> list) {
		if (list.contains(4)) {
			return true;
		} else {
			ArrayList<Integer> newList = new ArrayList<>();

			int startIndex = 0;
			for (int i = 0; i <= list.size() - 1; i++) {
				int val = list.get(i);
				int count = countSequence(list, startIndex);

				newList.add(count);
				newList.add(val);

				startIndex += count -1;
			}

			System.out.println(newList);
			return erDerLysITræet(newList);
		}
	}

	public static int countSequence(ArrayList<Integer> list, int startIndex) {
		int value = list.get(startIndex);
		int valueCount = 0;
		int index = startIndex;

		while (index < list.size() && list.get(index).equals(value)) {
			valueCount++;
			index++;
		}

		return valueCount;
	}
}

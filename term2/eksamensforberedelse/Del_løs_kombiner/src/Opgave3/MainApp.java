package term2.eksamensforberedelse.Del_løs_kombiner.src.Opgave3;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(45);
		list.add(12);
		list.add(56);
		list.add(37);
		list.add(48);
		list.add(12);
		list.add(34);
		list.add(4);
		list.add(56);
		System.out.println(list);

		MainApp.fletteSort(list);
		System.out.println(list);


	}

	// den metode der saetter fletningen i gang
	public static void fletteSort(ArrayList<Integer> list) {
		mergesort(list, 0, list.size() - 1);
	}

	// den rekursive metode der implementere del-loes og kombiner skabelonen
	private static void mergesort(ArrayList<Integer> list, int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			mergesort(list, l, m);
			mergesort(list, m + 1, h);
			merge(list, l, m, h);
		}
	}

	// kombiner er realiseret ved fletteskabelonen
	private static void merge(ArrayList<Integer> list, int low, int middle, int high) {
		ArrayList<Integer> temp = new ArrayList<>();

		int lowX = low;
		int middleX = middle + 1;

		while (lowX <= middle && middleX <= high) {

			//add number from lowX
			if (list.get(lowX) < list.get(middleX)) {
				temp.add(list.get(lowX));
				lowX++;
			}

			//add number from middleX
			else if (list.get(middleX) < list.get(lowX)) {
				temp.add(list.get(middleX));
				middleX++;
			}

			//add both numbers cause they're the same
			else {
				temp.add(list.get(lowX));
				temp.add(list.get(middleX));
				lowX++;
				middleX++;
			}
		}

		//empty list from both sides (only one will actually run cause one of them will have been emptied from the above code
		while (lowX <= middle) {
			temp.add(list.get(lowX));
			lowX++;
		}

		while (middleX <= high) {
			temp.add(list.get(middleX));
			middleX++;

		}

		//override the actual list with whatever is in temp list
		for (int i = 0; i < temp.size(); i++) {
			list.set(i + low,  temp.get(i));
		}
	}

}

package term1.lesson13;

import java.util.ArrayList;

public class MethodsArrayListApp {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(19);
		list.add(35);
		list.add(14);
		list.add(7);
		list.add(10);
		MethodsArrayList methods = new MethodsArrayList();
		// System.out.println(list);
		// System.out.println("Summen af tallene i listen med for "
		// 		+ methods.sumListe(list));
		// System.out.println("Summen af tallene i listen med forEach "
		// 		+ methods.sumListe2(list));

		// System.out.println("Indeks for det første lige tal: "
		// 		+ methods.hasEvenAtIndex(list));

		// System.out.println("Min: " + methods.min(list));
		// System.out.println("Ave: " + methods.average(list));
		// System.out.println("Zeros: " + methods.countZeros(list));
		methods.swapEvenWithZero(list);
		System.out.println("Swapped: " + list);
		// System.out.println("No uneven: " + methods.anEvenList(list));
	}

}

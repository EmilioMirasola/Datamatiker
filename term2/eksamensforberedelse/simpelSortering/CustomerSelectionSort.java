package term2.eksamensforberedelse.simpelSortering;

import java.util.Arrays;

public class CustomerSelectionSort {
	public static void main(String[] args) {
		Customer[] customers = new Customer[5];
		customers[0] = new Customer(23, "Emilio", "Mirasola");
		customers[1] = new Customer(18, "Filippa", "Mirasola");
		customers[2] = new Customer(20, "Erminia", "Mirasola");
		customers[3] = new Customer(52, "Riccardo", "Mirasola");
		customers[4] = new Customer(51, "Lisa", "Mirasola");

		System.out.println("customers = " + Arrays.toString(customers));
		sortCostumers(customers);
		System.out.println("customers sorted = " + Arrays.toString(customers));
	}

	private static void sortCostumers(Customer[] customers) {
		for (int i = 0; i < customers.length; i++) {
			int currentMinimumIndex = i;
			for (int j = i + 1; j < customers.length; j++) {
				if (customers[j].compareTo(customers[currentMinimumIndex]) < 0) {
					currentMinimumIndex = j;
				}
			}
			swap(i, customers, currentMinimumIndex);
		}
	}

	private static void swap(int i, Customer[] customers, int minimumIndex) {
		Customer customer = customers[i];
		customers[i] = customers[minimumIndex];
		customers[minimumIndex] = customer;
	}
}

package term2.eksamensforberedelse.simpelSortering;

import java.util.Arrays;

public class CustomerInsertionSort {
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

	public static void sortCostumers(Customer[] customers) {
		for (int i = 1; i < customers.length; i++) {
			Customer customer = customers[i];
			int position = i;

			while (position > 0 && customers[position-1].compareTo(customer) > 0) {
				customers[position] = customers[position - 1];
				position--;
			}

			customers[position] = customer;
		}
	}
}

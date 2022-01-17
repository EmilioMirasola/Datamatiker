package term2.eksamensforberedelse.fletning;

import term2.eksamensforberedelse.simpelSortering.Customer;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerFletning {
	public static void main(String[] args) {
		ArrayList<Customer> customers1 = new ArrayList<>();
		customers1.add(new Customer(23, "Emilio", "Mirasola"));
		customers1.add(new Customer(18, "Filippa", "Mirasola"));
		customers1.add(new Customer(20, "Erminia", "Mirasola"));
		customers1.add(new Customer(52, "Riccardo", "Mirasola"));
		customers1.add(new Customer(51, "Lisa", "Mirasola"));

		ArrayList<Customer> customers2 = new ArrayList<>();
		customers2.add(new Customer(15, "Nikoline", "Mirasola"));
		customers2.add(new Customer(15, "Sophie", "Mirasola"));
		customers2.add(new Customer(11, "Oskar", "Mirasola"));
		customers2.add(new Customer(46, "Christoffer", "Mirasola"));
		customers2.add(new Customer(44, "Bettina", "Mirasola"));

		Collections.sort(customers1);
		Collections.sort(customers2);

		ArrayList<Customer> customers = fletAlleKunder(customers1, customers2);
		System.out.println("customers = " + customers);
	}

	public static ArrayList<Customer> fletAlleKunder(ArrayList<Customer> l1, ArrayList<Customer> l2) {
		ArrayList<Customer> flettetListe = new ArrayList<>();

		int i1 = 0;
		int i2 = 0;

		while (i1 < l1.size() && i2 < l2.size()) {
			if (l1.get(i1).compareTo(l2.get(i2)) < 0) {
				flettetListe.add(l1.get(i1));
				i1++;
			} else {
				flettetListe.add(l2.get(i2));
				i2++;
			}
		}

		while (i1 < l1.size()) {
			flettetListe.add(l1.get(i1));
			i1++;
		}
		while (i2 < l2.size()) {
			flettetListe.add(l2.get(i2));
			i2++;
		}

		return flettetListe;
	}
}

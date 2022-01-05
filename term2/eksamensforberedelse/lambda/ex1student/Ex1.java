package term2.eksamensforberedelse.lambda.ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

	public static void main(String[] args) {
		List<Person> list = List.of(
				new Person("Bent", 25), new Person("Susan", 34),
				new Person("Mikael", 60), new Person("Klaus", 44),
				new Person("Birgitte", 17), new Person("Liselotte", 9));
		List<Person> persons = new ArrayList<Person>(list);
//		System.out.println(persons);
//		System.out.println();

		System.out.println("Første person med alder 44: " + findFirst(list, (person) -> person.getAge() == 44));
		System.out.println("Første person med navn, der starter med S: " + findFirst(list, (person) -> person.getName().charAt(0) == 'S'));

		System.out.println("Første person med mere end et I i navn: " + findFirst(list, (person) -> {
			int count = 0;
			for (char c : person.getName().toCharArray()) {
				if (c == 'i' || c == 'I') {
					count++;
				}
			}
			return count > 1;
		}));

		//Anden løsning på opg med mere end et I:
		System.out.println("Første person med mere end et I i navn: " + findFirst(list, (person) -> person.getName().chars().filter(c -> c == 'i').count() > 1));

		System.out.println("Første person med alder = længde af navn: " + findFirst(list, (person) -> person.getName().length() == person.getAge()));

		System.out.println("Alle personer, der starter med I: " + findAll(list, (person) -> person.getName().contains("i")));

		System.out.println("Alle personer der starter med S: " + findAll(list, (person) -> person.getName().charAt(0) == 'S'));

		System.out.println("Alle personer, hvis navn har fem bogstaver: " + findAll(list, (person) -> person.getName().length() == 5));

		System.out.println("Alle personer med navn længere end seks bogstaver og under 40 år gammel: " + findAll(list, (person) -> person.getName().length() > 5 && person.getAge() < 40));
	}

	public static List<Person> findAll(List<Person> persons, Predicate<Person> filter) {
		List<Person> matches = new ArrayList<>();
		for (Person person : persons) {
			if (filter.test(person)) {
				matches.add(person);
			}
		}
		return matches;
	}

	/**
	 * Returns from the list the first person
	 * that satisfies the predicate.
	 * Returns null, if no person satisfies the predicate.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}
}

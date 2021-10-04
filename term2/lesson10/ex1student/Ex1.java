package term2.lesson10.ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex1 {

	public static void main(String[] args) {
		List<Person> list = List.of(
				new Person("Bent", 25), new Person("Susan", 34),
				new Person("Mikael", 60), new Person("Klaus", 44),
				new Person("Birgitte", 17), new Person("Liselotte", 9));
		List<Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		System.out.println();

		System.out.println("Første med alder 44: " + findFirst(persons, (p) -> p.getAge() == 44));
		System.out.println("Første med S som start bogstav : " + findFirst(persons, (p) -> p.getName().charAt(0) == 'S'));
		System.out.println("Første med mere end et i : " + findFirst(persons, (p) -> {
			int sum = 0;
			for (char c : p.getName().toCharArray()) {
				if (c == 'i') {
					sum++;
				}
			}
			return sum > 1;
		}));

		Person mereEndEtI = findFirst(persons, p -> p.getName().chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.toList())
				.stream().filter(c -> c == 'i')
				.count() > 1);

		System.out.println("PERSON: " + mereEndEtI);

		System.out.println("Første person hvor alderen == længde på navn: " + findFirst(persons, (p) -> p.getName().length() == p.getAge()));
		System.out.println("Personer under 30 år: " + findAll(persons, (person -> person.getAge() < 30)));
		System.out.println("Personer der har bogstavet i: " + findAll(persons, (person -> person.getName().contains("i"))));
		System.out.println("Personer der starter med S: " + findAll(persons, (person -> person.getName().charAt(0) == 'S')));
		System.out.println("Personer med navn på længe 5: " + findAll(persons, (person -> person.getName().length() == 5)));
		System.out.println("Personer hvor navns længde >=6 og er under 40 år gammel: " + findAll(persons, (person -> person.getName().length() >= 6 && person.getAge() < 40)));

		System.out.println(findFirst(list, Person::isYoungerThan30));
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

	public static List<Person> findAll(List<Person> list, Predicate<Person> filter) {
		List<Person> matchingPersons = new ArrayList<>();
		for (Person p : list) {
			if (filter.test(p)) {
				matchingPersons.add(p);
			}
		}
		return matchingPersons;
	}
}

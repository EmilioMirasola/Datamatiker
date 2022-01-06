package term2.eksamensforberedelse.singletons.ops2PersonAdmin;

import java.util.Set;

public class AnvendPersonAdmin {
	public static void main(String[] args) {
		PersonAdmin personAdmin = PersonAdmin.getPersonAdmin();
		Person p1 = new Person("Emilio");
		Person p2 = new Person("Erminia");
		Person p3 = new Person("Filippa");

		personAdmin.addPerson(p1);
		personAdmin.addPerson(p2);
		personAdmin.addPerson(p3);

		Set<Person> personer = personAdmin.getPersoner();
		System.out.println("personer = " + personer);

		personAdmin.remove(p2);
		System.out.println("personer = " + personer);
	}
}

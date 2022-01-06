package term2.eksamensforberedelse.singletons.ops2PersonAdmin;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

public class PersonAdmin {
	@Getter
	private final Set<Person> personer;
	private static PersonAdmin personAdmin;

	private PersonAdmin() {
		this.personer = new HashSet<>();
	}

	public static PersonAdmin getPersonAdmin() {
		if (personAdmin == null) {
			personAdmin = new PersonAdmin();
		}
		return personAdmin;
	}

	public void addPerson(Person person) {
		this.personer.add(person);
	}

	public boolean remove(Person person) {
		return personer.remove(person);
	}

}

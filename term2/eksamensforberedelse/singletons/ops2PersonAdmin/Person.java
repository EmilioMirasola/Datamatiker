package term2.eksamensforberedelse.singletons.ops2PersonAdmin;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Person {
	private final String name;

	public Person(String name) {
		this.name = name;
	}

}

package term2.lesson10.ex1student;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isYoungerThan30() {
		return age < 30;
	}

	@Override
	public String toString() {
		return String.format("Person[%s,%d]", name, age);
	}
}

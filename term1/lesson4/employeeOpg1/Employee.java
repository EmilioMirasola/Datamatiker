package term1.lesson4.employeeOpg1;

/**
 * Klasse der beskriver en ansat
 *
 * @author mad
 *
 */
public class Employee {
	private String firstName;
	private String lastName;
	private boolean trainee;
	private int age;

	public Employee(String firstName, String lastName, boolean trainee, int age) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.trainee = trainee;
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String inputName) {
		this.firstName = inputName;
	}

	public String getName() {
		return this.firstName;
	}

	public void setTrainee(boolean isTrainee) {
		trainee = isTrainee;
	}

	public boolean isTrainee() {
		return trainee;
	}

	public void birthday() {
		this.age++;
	}

	public void printEmployee() {
		System.out.println("*******************");
		System.out.println("First name: " + this.firstName);
		System.out.println("Last name: " + this.lastName);
		System.out.println("Trainee: " + this.trainee);
		System.out.println("Age: " + this.age);
		System.out.println("*******************");
	}

}

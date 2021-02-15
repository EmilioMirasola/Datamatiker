package term1.lesson6.child;

/**
 * Write a description of class Barn here.
 */
public class Child {
	private int age;
	private boolean boy; // true if the child is a boy

	public Child(int age, boolean boy) {
		this.age = age;
		this.boy = boy;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBoy() {
		return boy;
	}

	public void setBoy(boolean boy) {
		this.boy = boy;
	}

	public String institution() {
		if (this.age >= 17) {
			return "Out of school";
		} else if (this.age <= 16 && this.age >= 6) {
			return "School";
		} else if (this.age <= 5 && this.age >= 3) {
			return "Kindergarden";
		} else if (this.age <= 2 && this.age >= 1) {
			return "Nursery";
		} else {
			return "Home";
		}
	}

}

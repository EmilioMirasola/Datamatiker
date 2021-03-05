package term1.lesson12.modelchild;

/**
 * Write a description of class Barn here.
 */

public class Child {
	private int age;
	private boolean boy; // true if the child is a boy
	private double[] weight = { 4.2, 9.3, 12.4, 17.5, 23.2, 25.3, 28.6, 30.4, 33.9, 35.1, 37.3 };

	public Child(int age, boolean boy) {
		this.age = age;
		this.boy = boy;
	}

	public double getWeight(int age) {
		return this.weight[age];
	}

	public double[] getIncrease() {
		double[] weightInfoArray = new double[2];
		for (int i = 1; i < weight.length; i++) {
			if (weight[i] - weight[i - 1] > weightInfoArray[0]) {
				weightInfoArray[0] = weight[i] - weight[i - 1];
				weightInfoArray[1] = i+1;
			}
		}
		return weightInfoArray;
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

}

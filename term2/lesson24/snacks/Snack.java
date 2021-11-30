package term2.lesson24.snacks;

public class Snack implements Comparable<Snack> {
	private double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Snack o) {
		return (int) (this.weight - o.getWeight());
	}
}

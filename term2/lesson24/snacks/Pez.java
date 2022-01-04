package term2.lesson24.snacks;

import java.util.Random;

public class Pez extends Snack {
	public enum Flavors {
		Banana(1), CandyCorn(2), Cherry(3), Grape(4), Lemon(5), Orange(6), Raspberry(7), Strawberry(8);

		private final int rank;

		Flavors(int rank) {
			this.rank = rank;
		}
	}

	private Flavors flavor;

	public Pez() {
		Random random = new Random();
		Flavors[] flavors = Flavors.values();
		this.flavor = flavors[random.nextInt(flavors.length)];
	}

	public Pez(Flavors flavor) {
		this.flavor = flavor;
	}

	public Flavors getFlavor() {
		return flavor;
	}

	@Override
	public int compareTo(Snack other) {
		Pez pez = (Pez) other;
		return this.flavor.rank - ((Pez) other).getFlavor().rank;
	}

	@Override
	public String toString() {
		return this.flavor.toString();
	}
}

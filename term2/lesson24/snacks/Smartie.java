package term2.lesson24.snacks;

import java.util.Random;

public class Smartie extends Snack {

	public enum Colors {
		Red(1), Orange(2), Blue(3), Green(4), Yellow(5), Pink(6), Violet(7), Brown(8);

		private final int rank;

		Colors(int rank) {
			this.rank = rank;
		}
	}


	private Colors color;

	public Smartie() {
		Random random = new Random();
		Colors[] colors = Colors.values();
		this.color = colors[random.nextInt(colors.length)];
	}

	public Smartie(Colors color) {
		this.color = color;
	}

	public Colors getColor() {
		return color;
	}

	@Override
	public int compareTo(Snack other) {
		Smartie smartie = (Smartie) other;
		return this.getColor().rank - ((Smartie) other).getColor().rank;
	}

	@Override
	public String toString() {
		return this.getColor().toString();
	}
}

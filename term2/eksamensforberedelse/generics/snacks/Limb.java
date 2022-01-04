package term2.eksamensforberedelse.generics.snacks;

import java.util.Random;

public class Limb extends Snack {

	public enum Types {
		Finger(5), Foot(1), Hand(4), Heel(3), Knee(2), Toe(6);

		private final int rank;

		Types(int rank) {
			this.rank = rank;
		}
	}

	private Types type;

	public Limb() {
		Random random = new Random();
		Types[] types = Types.values();
		this.type = types[random.nextInt(types.length)];
	}

	public Limb(Types type) {
		this.type = type;
	}

	public Types getType() {
		return type;
	}

	@Override
	public int compareTo(Snack o) {
		Limb other = (Limb) o;

		return this.type.rank - other.getType().rank;
	}

	@Override
	public String toString() {
		return this.type.toString();
	}
}

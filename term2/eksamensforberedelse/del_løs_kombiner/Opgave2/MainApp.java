package term2.eksamensforberedelse.del_løs_kombiner.Opgave2;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(0);
		list.add(5);
		list.add(0);
		list.add(0);

		System.out.println(antalNul(list, 0, 4));

	}

	public static int antalNul(ArrayList<Integer> list, int l, int h) {

		if (l == h) {
			if (list.get(l) == 0) {
				return 1;
			}
			else {
				return 0;
			}
		}

		else {
			int m = (l + h) / 2;

			//postorder
			int part1 = antalNul(list, l, m);
			int part2 = antalNul(list, m + 1, h);
			return part1 + part2;

		}

	}

}

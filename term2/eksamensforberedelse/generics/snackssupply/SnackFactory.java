package term2.eksamensforberedelse.generics.snackssupply;

import term2.eksamensforberedelse.generics.snacks.Limb;
import term2.eksamensforberedelse.generics.snacks.Pez;
import term2.eksamensforberedelse.generics.snacks.Smartie;
import term2.eksamensforberedelse.generics.snacks.Snack;

import java.util.ArrayList;

public class SnackFactory {
	public SnackFactory() {
	}

	public ArrayList<Snack> createSnackBucket(int size) {
		ArrayList<Snack> list = new ArrayList<>();

		for (int i = 0; i <= size; i++) {
			list.add(getRandomSnack());
		}

		return list;
	}

	private <E extends Snack> E getRandomSnack() {
		int i = (int) (Math.random() * (3) + 1);

		E snack = null;

		switch (i) {
			case 1:
				snack = (E) new Limb();
				break;
			case 2:
				snack = (E) new Pez();
				break;
			case 3:
				snack = (E) new Smartie();
				break;
		}

		return snack;
	}


	//Virker lige så fint uden generics fordi vi har et klassehierarki fra snack til underkategorier af snacks
//	private Snack getRandomSnack() {
//		int i = (int) (Math.random() * (3) + 1);
//
//		Snack snack = null;
//
//		switch (i) {
//			case 1:
//				snack = new Limb();
//				break;
//			case 2:
//				snack = new Pez();
//				break;
//			case 3:
//				snack = new Smartie();
//				break;
//		}
//
//		return snack;
//	}
}

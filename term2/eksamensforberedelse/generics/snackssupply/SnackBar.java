package term2.eksamensforberedelse.generics.snackssupply;

import term2.eksamensforberedelse.generics.snacks.Snack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SnackBar {

	public SnackBar() {
	}

	public <E extends Snack> ArrayList<E> sortSnacks(E[] snackContainer) {
		ArrayList<E> arrayList = new ArrayList<>(Arrays.asList(snackContainer));
		Collections.sort(arrayList);
		return arrayList;
	}
}

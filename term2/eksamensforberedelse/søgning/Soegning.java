package term2.eksamensforberedelse.søgning;

import java.util.ArrayList;

public class Soegning {

	public boolean findUlige(int[] tabel) {
		int i = 0;
		while (i < tabel.length) {
			if (tabel[i] % 2 == 1) {
				return true;
			}
			i++;
		}
		return false;
	}

	public int førsteTalMellem10Og15(int[] tal) {
		int i = 0;
		while (i < tal.length) {
			if (tal[i] > 9 && tal[i] < 16) {
				return tal[i];
			}
			i++;
		}

		return -1;
	}

	//OPG 3
	public boolean harToEnsTalVedSidenAfHinandan(int[] tal) {
		int i = 0;
		while (i < tal.length - 1) {
			if (tal[i] == tal[i + 1]) {
				return true;
			}
			i++;
		}

		return false;
	}

	//OPG 4.1
	public Spiller findScoreLineær(ArrayList<Spiller> spillere, int score) {
		for (Spiller spiller : spillere) {
			if (spiller.getMaal() == score) {
				return spiller;
			}
		}
		return null;
	}

	//OPG 4.2
	public Spiller findScoreBinær(ArrayList<Spiller> spillere, int score) {
		int left = 0;
		int right = spillere.size() - 1;

		while (left <= right) {
			int middle = (left + right) / 2;
			Spiller spiller = spillere.get(middle);
			if (spiller.getMaal() == score) {
				return spiller;
			} else if (spiller.getMaal() > score) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}
		return null;
	}

	//OPG 4.3
	public String godSpiller(ArrayList<Spiller> spillere) {
		int i = 0;

		while (i < spillere.size()) {
			if (spillere.get(i).getMaal() > 50 && spillere.get(i).getHoejde() < 170) {
				return spillere.get(i).getNavn();
			}
			i++;
		}
		return "";
	}


	//OPG 6
	public int find(ArrayList<Integer> list, int n) {
		for (int i = 0; i < list.size(); i++) {
			Integer current = list.get(i);
			if (current == n) {
				if (i > 0) {
					list.set(i, list.get(i - 1));
					list.set(i - 1, current);
					return i-1;
				}
				return i;
			}
		}
		return -1;
	}
}

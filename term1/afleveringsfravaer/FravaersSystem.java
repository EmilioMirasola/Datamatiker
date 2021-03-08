package term1.afleveringsfravaer;

public class FravaersSystem {
	/**
	 * Fraværstallene udskrives på skærmen
	 *
	 * @param fravaer
	 */
	public void udskrivFravaer(int[][] fravaer) {
		printMonths(fravaer);
		System.out.println();
		System.out.println(
				"\t--------------------------------------------------------------------------------------------------");
		printStudentAbsence(fravaer);
	}

	private void printStudentAbsence(int[][] fravaer) {
		for (int i = 0; i <= fravaer.length - 1; i++) {
			System.out.print("Elev " + (i + 1) + "\t:\t");
			for (int j = 0; j < fravaer[i].length; j++) {
				// Lidt farve på udskriften
				if (fravaer[i][j] > 3) {
					System.out.print(fravaer[i][j] + "\t");
				} else {
					System.out.print(fravaer[i][j] + "\t");
				}

			}
			System.out.println();
		}
	}

	private void printMonths(int[][] fravaer) {
		System.out.print("Måned \t:");
		for (int i = 0; i < fravaer[0].length; i++) {
			System.out.print("\t" + (i + 1));
		}
	}

	/**
	 * Returnerer det samlede antal fravaerdage over 12 måneder for eleven med
	 * elevnr.
	 *
	 * @param fravaer
	 * @param elevNr
	 * @return
	 */
	public int samletFravaer(int[][] fravaer, int elevNr) {
		int fraværSum = 0;
		for (int i = 0; i < fravaer[elevNr].length; i++) {
			fraværSum += fravaer[elevNr][i];
		}
		return fraværSum;
	}

	/**
	 * Returnerer det gennemsnitlige antal fraværsdage pr måned for eleven med
	 * elevNr.
	 *
	 * @param fravaer
	 * @param elevNr
	 * @return
	 */
	public double gennemsnit(int[][] fravaer, int elevNr) {
		return (double) samletFravaer(fravaer, elevNr) / 12;
	}

	/**
	 * Returnerer antallet af elever der ikke har haft fravær i de 12 måneder.
	 *
	 * @param fravaer
	 * @return
	 */
	public int antalUdenFravaer(int[][] fravaer) {
		int antalUdenFravær = 0;
		for (int i = 0; i < fravaer.length; i++) {
			if (samletFravaer(fravaer, i) == 0) {
				antalUdenFravær++;
			}
		}
		return antalUdenFravær;
	}

	/**
	 * Returnerer elevNr for den elev der har haft mest fravær igennem de 12
	 * måneder. Hvis flere elever har haft højst fravær, returneres elevnummer for
	 * en af disse.
	 *
	 * @param fravaer
	 * @return
	 */
	public int mestFravaer(int[][] fravaer) {
		int elevNr = samletFravaer(fravaer, 0);
		int maxFravær = 0;
		for (int i = 1; i < fravaer.length; i++) {
			if (samletFravaer(fravaer, i) > maxFravær) {
				maxFravær = samletFravaer(fravaer, i);
				elevNr = i;
			}
		}
		return elevNr;
	}

	/**
	 * Registrerer at elenven med elevNr ikke har haft fravær i nogen af de 12
	 * måneder.
	 *
	 * @param fravaer
	 * @param elevNr
	 */
	public void nulstil(int[][] fravaer, int elevNr) {
		for (int i = 0; i < fravaer[elevNr].length; i++) {
			fravaer[elevNr][i] = 0;
		}
	}
}

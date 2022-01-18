package term2.eksamensforberedelse.søgning;

import java.util.ArrayList;
import java.util.List;

public class SoegningApp {


	public static void main(String[] args) {
		Soegning s = new Soegning();

		// Kode til afprøvning af opgave 1
		int[] talArray = {2, 4, 8, 2};
		System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));
		talArray[2] = 15;
		System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));

		// Her tilføjes kode til at afprøve opgaverne 2,3,5,6 og 7

		//OPG 2
		int førsteTalMellem10Og15 = s.førsteTalMellem10Og15(talArray);
		System.out.println("førsteTalMellem10Og15 = " + førsteTalMellem10Og15);

		//OPG 3
		boolean harToEnsTalEfterHinanden = s.harToEnsTalVedSidenAfHinandan(talArray);
		System.out.println("harToEnsTalEfterHinanden = " + harToEnsTalEfterHinanden);


		ArrayList<Spiller> spillere = new ArrayList<>();
		spillere.add(new Spiller("Jeppe", 170, 80, 40));
		spillere.add(new Spiller("Oskar", 170, 80, 30));
		spillere.add(new Spiller("Emilio", 169, 80, 51));
		spillere.add(new Spiller("Anders", 170, 80, 10));

		//OPG 4.1
		Spiller spillerMedScoreFundetLineær = s.findScoreLineær(spillere, 10);
		System.out.println("spillerMedScoreFundetLineær = " + spillerMedScoreFundetLineær);

		//OPG 4.2
		Spiller spillerMedScoreFundetBinær = s.findScoreBinær(spillere, 30);
		System.out.println("spillerMedScoreFundetBinær = " + spillerMedScoreFundetBinær);

		//OPG 4.3
		String godSpiller = s.godSpiller(spillere);
		System.out.println("godSpiller = " + godSpiller);

		//OPG 6
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("list = " + list);
		int index = s.find(list, 2);

		System.out.println("index = " + index);
		System.out.println("list = " + list);
	}

}

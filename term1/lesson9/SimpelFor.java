package term1.lesson9;

public class SimpelFor {
	public static void main(String[] args) {

		// while løkke der udskriver tallene fra 1-10
		// int i = 1;
		// while (i <= 10) {
		// System.out.println(i);
		// i++;
		// }

		// for løkke der udskriver tallene fra 1-10
		// for (int i = 1; i <= 10; i++) {
		// System.out.println(i);
		// }

		// while løkke der summerer tallene fra 1-10
		// int i = 1;
		// int sum = 0;
		// while (i <= 10) {
		// sum = sum + i;
		// i++;
		// }
		// System.out.println("Summen beregnet med while " + sum);

		// for løkke der summerer tallene fra 1-10
		// int sum = 0;
		// for (int i = 1; i <= 10; i++) {
		// sum = sum + i;
		// }
		// System.out.println("Summen beregnet med for " + sum);

		// for løkke der udskriver de lige tal mellem 1-20 i aftagende rækkefølge
		// for (int i=20; i>0; i--){
		// if (i%2==0)
		// System.out.println(i + " er lige");
		// }

		// Nested løkke for-løkke med for-løkke

		// int antal = 0;
		// for (int i = 1; i <= 10; i++) {
		// for (int j = 1; j <= 4; j++) {
		// antal = antal + 1;
		// }
		// }
		// System.out.println("Antal er " + antal);

		// int antal = 0;
		// for (int i = 1; i <= 10; i++) {
		// System.out.println("i = " + i + ": ");
		// for (int j = 1; j <= 4; j++) {
		// antal = antal + 1;
		// System.out.println("\tj = " + j + " antal = " + antal);
		//
		// }
		// System.out.println("\nAntal efter " + i + "'te gennemløb af yderste løkke " +
		// antal);
		// System.out.println();
		// }

		// e_1_1();
		// e_1_2();
		
	}

	private static void e_1_2() {
		for (int i = 300; i >= 3; i -= 3) {
			System.out.println(i);
		}
	}

	private static void e_1_1() {
		for (int i = 1; i <= 99; i += 2) {
			System.out.println(i);
		}
	}

}
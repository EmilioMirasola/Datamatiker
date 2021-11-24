package term2.daos.lesson15.eksempel2;

import java.util.Random;

public class TestFindMax {

	private static final int rowindex = 10;
	private static final int colindex = 20000000;

	private static final int[][] board = new int[rowindex][colindex];

	public static void main(String[] args) {
		fillBoard();
		// printBoard();
		long l1 = System.nanoTime();
		System.out.println("Max: " + findMax());
		long l2 = System.nanoTime();
		System.out.println("Alm. kode køretid: " + (l2 - l1) / 1000000 + " millisekunder");

		try {
			l1 = System.nanoTime();
			System.out.println("Max: " + findMaxThread());
			l2 = System.nanoTime();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread køretid: " + (l2 - l1) / 1000000 + " millisekunder");
	}

	public static int findMax() {
		int max = 0;
		for (int[] row : board) {
			for (int col : row) {
				if (col > max) {
					max = col;
				}
			}
		}
		return max;
	}

	public static int findMaxThread() throws InterruptedException {
		int max = 0;
		TraadKlassen[] threads = new TraadKlassen[board.length];

		for (int i = 0; i < board.length; i++) {
			int[] ints = board[i];
			TraadKlassen thread = new TraadKlassen(ints);
			threads[i] = thread;
			thread.start();
		}

		for (TraadKlassen thread : threads) {
			thread.join();
			if (thread.getMax() > max) {
				max = thread.getMax();
			}
		}

		return max;
	}

	public static void fillBoard() {
		Random rand = new Random();
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				board[row][col] = rand.nextInt(1000);
			}
		}
	}

	public static void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}

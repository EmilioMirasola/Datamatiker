package term2.lesson11;

import java.util.Arrays;

public class Main {

	//github test
	public static void main(String[] args) {
		int[] ints = {5, 10, 5, 6, 4, 9, 8};
		double[] prefixAve = prefixAverageBad(ints);
		System.out.println(Arrays.toString(prefixAve));
	}


	public static double[] prefixAverageBad(int[] inputTal) {
		double[] average = new double[inputTal.length];
		for (int i = 0; i < inputTal.length; i++) {
			double sum = 0;
			for (int j = 0; j < i; j++) {
				sum += average[j];
			}
			sum += inputTal[i];
			average[i] = sum / (i + 1);
		}
		return average;
	}

//	public static double[] prefixAveragegood(int[] inputTal) {
//
//	}
}

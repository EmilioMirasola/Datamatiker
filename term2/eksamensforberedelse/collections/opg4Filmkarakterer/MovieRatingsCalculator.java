package term2.eksamensforberedelse.collections.opg4Filmkarakterer;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieRatingsCalculator {
	static Map<String, Integer> movieRatingsCount = new HashMap<>();
	static Map<String, Double> movieRatingsAccumulated = new HashMap<>();

	public static void main(String[] args) {
		File file = new File("C:\\Users\\emili\\datamatiker\\Programmering\\code\\term2\\eksamensforberedelse\\collections\\opg4Filmkarakterer\\movieratings.txt");
		try {
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String movie = scanner.nextLine();
				updateMovieRatingsCountByMovie(movie);

				int rating = scanner.nextInt();
				updateMovieRatingsAccumulationByMovie(movie, rating);

				removeExtraLine(scanner);
			}

			printMovieRatings();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void removeExtraLine(Scanner scanner) {
		if (scanner.hasNextLine()) {
			scanner.nextLine();
		}
	}

	private static void printMovieRatings() {
		movieRatingsAccumulated.forEach((key, value) -> {
			System.out.print(key + " : ");
			int count = movieRatingsCount.get(key);
			System.out.print(count + " karakterer, ");
			System.out.print("gennemsnit " + value / count);
			movieRatingsAccumulated.put(key, value / count);

			System.out.println();
		});
	}

	public static void updateMovieRatingsCountByMovie(String movie) {
		if (!movieRatingsCount.containsKey(movie)) {
			movieRatingsCount.put(movie, 1);
		} else {
			movieRatingsCount.put(movie, movieRatingsCount.get(movie) + 1);
		}
	}

	public static void updateMovieRatingsAccumulationByMovie(String movie, double rating) {
		if (!movieRatingsAccumulated.containsKey(movie)) {
			movieRatingsAccumulated.put(movie, rating);
		} else {
			movieRatingsAccumulated.put(movie, movieRatingsAccumulated.get(movie) + rating);
		}
	}
}

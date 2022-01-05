package term2.eksamensforberedelse.lambda.ex2student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		List<Runner> runners = new ArrayList<>();
		runners.addAll(List.of(
				new Runner("Ib", 30),
				new Runner("Per", 50),
				new Runner("Ole", 27),
				new Runner("Ulla", 40),
				new Runner("Jens", 35),
				new Runner("Hans", 28)));
		System.out.println(runners);
		System.out.println();

		runners.forEach((runner) -> System.out.println("runner = " + runner));
		runners.forEach((runner) -> {
			if (runner.getLapTime() < 30) {
				System.out.println("runner med laptime < 30 = " + runner);
			}
		});

		//hvis man minusser omvendt vil det være sorteres i stigende orden
		runners.sort((a, b) -> a.getLapTime() - b.getLapTime());
		System.out.println();
		System.out.println(runners);
		//samme
		runners.sort(Comparator.comparingInt(Runner::getLapTime));

	}
}

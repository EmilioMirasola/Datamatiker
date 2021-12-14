package term2.lesson25;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
//		HashSet<Car> bilSet = new HashSet<>();
//		bilSet.add(new Car("12345", "VW", "Polo", "Blå"));
//		bilSet.add(new Car("12345", "VW", "Polo", "Blå"));
//
//		System.out.println(bilSet);

		DictionaryLinked<Car, Integer> bilerPåVærkstedTæller = new DictionaryLinked<>();
		bilerPåVærkstedTæller.put(new Car("12345", "VW", "Polo", "Blå"), 1);
		bilerPåVærkstedTæller.put(new Car("12345", "VW", "Polo", "Blå"), 2);
		System.out.println(bilerPåVærkstedTæller);
	}
}

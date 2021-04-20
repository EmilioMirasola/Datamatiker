package term1.lesson26.afleveringsopgave;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("VW");
        cars.add("Audi");
        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Seat");

        System.out.println(cars);

        cars.set(3, "BMW");

        System.out.println(cars);

        cars.remove(2);
        System.out.println(cars);

        cars.add(0, "Renault");
        System.out.println(cars);

        System.out.println("Antal elementer i listen: " + cars.size());

        List<String> lengthEqualsFour = cars.stream().filter(car -> car.length() == 4).collect(Collectors.toList());
        System.out.println("Antal biler med fire bogstaver: " + lengthEqualsFour.size());


        int i = 0;
        for (String car : cars) {
            if (i % 2 == 0) {
                System.out.println(car);
            }
            i++;
        }

    }
}

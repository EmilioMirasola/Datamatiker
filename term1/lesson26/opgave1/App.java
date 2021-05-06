package term1.lesson26.opgave1;

import java.util.Arrays;
import java.util.OptionalDouble;

public class App {
    public static void main(String[] args) {
        Measurable[] measurables = new Measurable[4];

        Chilli c1 = new Chilli("Habanero", 10);
        Chilli c2 = new Chilli("Jalapenos", 20);
        Chilli c3 = new Chilli("Carolina Reaper", 10000);
        Chilli c4 = new Chilli("Carolina Reaper", 20000);

        measurables[0] = c1;
        measurables[1] = c2;
        measurables[2] = c3;
        measurables[3] = c4;

        System.out.println("Max: " + ((Chilli) max(measurables)).getName());
        System.out.println("Avg: " + avg(measurables));

        Filter f = new TestChilliMeasure(5000);
        System.out.println(avg(measurables, f));

    }

    public static Measurable max(Measurable[] objects) {
        Measurable max = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > max.getMeasure()) {
                max = obj;
            }
        }
        return max;
    }

    public static double avg(Measurable[] objects) {
        return Arrays.stream(objects)
                .mapToDouble(Measurable::getMeasure)
                .average()
                .orElseThrow();
    }

    public static double avg(Measurable[] objects, Filter filter) {
        return Arrays.stream(objects)
                .filter(filter::accept)
                .mapToDouble(Measurable::getMeasure)
                .average()
                .orElseThrow();
    }
}

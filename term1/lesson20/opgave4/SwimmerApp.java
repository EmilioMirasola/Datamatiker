package term1.lesson20.opgave4;

import java.util.ArrayList;

public class SwimmerApp {

    public static void main(String[] args) {

        TrainingPlan t1 = new TrainingPlan('A', 16, 10);
        TrainingPlan t2 = new TrainingPlan('B', 10, 6);

        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(1.01);
        lapTimes.add(0.99);
        lapTimes.add(0.98);
        lapTimes.add(1.02);
        lapTimes.add(1.04);
        lapTimes.add(0.99);
        t1.createSwimmer("Jan", 1994, lapTimes, "AGF");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.01);
        lapTimes.add(1.04);
        lapTimes.add(1.06);
        lapTimes.add(1.08);
        lapTimes.add(1.04);
        lapTimes.add(1.02);
        t1.createSwimmer("Bo", 1995, lapTimes, "Lyseng");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.03);
        lapTimes.add(1.01);
        lapTimes.add(1.02);
        lapTimes.add(1.05);
        lapTimes.add(1.03);
        lapTimes.add(1.06);
        lapTimes.add(1.03);
        t2.createSwimmer("Mikkel", 1993, lapTimes, "AIA-Tranbjerg");
        System.out.println(t1.getSwimmers());
        t1.removeSwimmer(t1.getSwimmers().get(0));
        System.out.println(t1.getSwimmers());
    }

}

package term1.lesson17.svoemmer;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class SvoemmerTest {
    public static void main(String[] args) {
        ArrayList<Double> tider = new ArrayList<Double>();
        int min = 50;
        int max = 150;
        for (double i = 1; i <= 50; i++) {
            double random = Math.random() * (max - min) + min;
            tider.add(random);
        }
        Svømmer s1 = new Svømmer("Emilio", "Aarhus Svømmeklub", LocalDate.of(1998, Month.OCTOBER, 4), tider);
        System.out.println("Bedste tid: " + s1.bedsteTid());
        System.out.println("Gennemsnit tid: " + s1.gennemSnitAfTid());
        System.out.println("Gennemsnit tid uden dårligste tid: " + s1.snitUdenDårligste());
    }
}

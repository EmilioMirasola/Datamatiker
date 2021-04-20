package term1.lesson24.medarbejderApp;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Ansat> ansatte = new ArrayList<>();
        fillArrayList(ansatte);
        System.out.println(samletUgeLoen(ansatte));
    }

    private static void fillArrayList(ArrayList<Ansat> mekanikere) {
        Mekaniker m = new Mekaniker("Carsten", "Mekanikermuren 10", 2010, 400);
        Værkfører v = new Værkfører("Carsten", "Værkførervænget 10", 600, 2020, 2010, 1000);
        Synsmand s = new Synsmand("Carsten", "Synssvænget 10", 2010, 500);
        Ansat a = new Arbejdsmand("Carsten", "Arbejdsafdelingen 19", 125);
        s.addSyn();
        mekanikere.add(m);
        mekanikere.add(v);
        mekanikere.add(s);
        mekanikere.add(a);
    }

    public static double samletUgeLoen(ArrayList<Ansat> list) {
        return list.stream().mapToDouble(Ansat::beregnUgeløn).sum();
    }
}
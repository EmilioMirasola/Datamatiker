package term1.lesson36.storage;

import term1.lesson36.model.Bil;
import term1.lesson36.model.Parkeringshus;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static final List<Parkeringshus> parkeringshuse = new ArrayList<>();
    private static final List<Bil> biler = new ArrayList<>();

    public static void tilføjParkeringshus(Parkeringshus pHus) {
        parkeringshuse.add(pHus);
    }

    public static void tilføjBil(Bil bil) {
        biler.add(bil);
    }

    public static List<Bil> getBiler() {
        return new ArrayList<>(biler);
    }

    public static List<Parkeringshus> getParkeringshuse() {
        return new ArrayList<>(parkeringshuse);
    }
}

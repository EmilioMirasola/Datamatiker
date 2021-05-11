package term1.systemudvikling.afærdbankkonto.Storage;

import java.util.ArrayList;

import term1.systemudvikling.afærdbankkonto.Model.KontoType;

public class Storage {

    private static ArrayList<KontoType> kontoTyper = new ArrayList<>();

    public static void addKontoType(KontoType kontoType) {
        if (!kontoTyper.contains(kontoType)) {
            kontoTyper.add(kontoType);
        }
    }

}

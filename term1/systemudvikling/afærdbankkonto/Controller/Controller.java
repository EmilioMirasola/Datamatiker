package term1.systemudvikling.afærdbankkonto.Controller;

import term1.systemudvikling.afærdbankkonto.Model.Konto;
import term1.systemudvikling.afærdbankkonto.Model.KontoType;
import term1.systemudvikling.afærdbankkonto.Storage.Storage;

public class Controller {

    public static KontoType createKontoType(String navn, String beskrivelse) {

        KontoType kontoType = new KontoType(navn, beskrivelse);
        Storage.addKontoType(kontoType);
        return kontoType;
    }

    public static Konto createKonto(KontoType kontoType) {
        Konto konto;

        konto = new Konto(kontoType);

        return konto;
    }

    public static void haevEllerIndsaetBeloeb(Konto konto, int beloeb) {
        try {
            konto.haevEllerIndsaetBeloeb(beloeb);
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void lukKonto(Konto konto) {
        konto.lukKonto();
    }

    public static void åbenKonto(Konto k1) {
        k1.åbenKonto();
    }
}

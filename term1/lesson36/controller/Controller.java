package term1.lesson36.controller;

import term1.lesson36.model.Bil;
import term1.lesson36.model.Bilmærke;
import term1.lesson36.model.Parkeringshus;
import term1.lesson36.model.Parkeringsplads;
import term1.lesson36.storage.Storage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.List;

public class Controller {

    public static Bil opretBil(String regNr, Bilmærke mærke) {
        Bil bil = new Bil(regNr, mærke);
        Storage.tilføjBil(bil);
        return bil;
    }

    public static Parkeringshus opretParkeringshus(String adresse) {
        Parkeringshus parkeringshus = new Parkeringshus(adresse);
        Storage.tilføjParkeringshus(parkeringshus);
        return parkeringshus;
    }

    public static List<Parkeringsplads> getFrieParkeringsPladser(Parkeringshus pHus) {
        return pHus.getFrieParkeringspladser();
    }

    public static List<Parkeringshus> getParkeringshuse() {
        return Storage.getParkeringshuse();
    }

    public static void parkerBil(Bil bil, Parkeringsplads pPlads) {
        pPlads.parkerBil(bil);
    }

    public static void writeOptagnePladser(Parkeringshus pHus, String filnavn) {
        try {
            PrintWriter pw = new PrintWriter(filnavn);

            List<String> optagnePladser = pHus.optagnePladser();
            optagnePladser.forEach(pw::println);

            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createSomeObjects() {


        Parkeringshus pHus = opretParkeringshus("Havnegade 12, 8000 Aarhus");
        Parkeringshus pHus2 = opretParkeringshus("Parkeringshusvej 1, 8000 Aarhus");
        pHus2.opretParkeringsplads(1);
        pHus2.opretParkeringsplads(2);
        pHus2.opretParkeringsplads(3);

        //Oprettelse af pladser
        int i = 1;
        while (i <= 110) {
            if (i <= 100) {
                pHus.opretParkeringsplads(i);
            } else {
                pHus.opretInvalideParkeringsPlads(i, 18);
            }
            i++;
        }

        //Oprettelse og parkering af biler

        Bil bil1 = opretBil("AB11222", Bilmærke.BMW);
        Bil bil2 = opretBil("EF33444", Bilmærke.AUDI);
        Bil bil3 = opretBil("BD55666", Bilmærke.MERCEDES);

        List<Parkeringsplads> parkeringspladser = pHus.getParkeringspladser();
        parkeringspladser.get(109).parkerBil(bil1);
        parkeringspladser.get(1).parkerBil(bil2);
        parkeringspladser.get(2).parkerBil(bil3);


        System.out.println("INITIELLE TESTS");
        System.out.println();
        System.out.println("pHus1 ledige pladser: " + pHus.antalLedigePladser());
        System.out.println("pHus2 ledige pladser: " + pHus2.antalLedigePladser());
        System.out.println("Bil med regNr 'AB11222' er parkeret på plads: " + pHus.findPladsMedBil("AB11222"));

        System.out.println("* Henter bil nr 1 efter 55 minutter - forventet pHus saldo på 30kr *");
        parkeringspladser.get(1).hentBil(LocalTime.now().plusMinutes(55));
        System.out.println("pHus1 saldo: " + pHus.getSaldo());
        System.out.println("pHus 1 optagne pladser: " + pHus.optagnePladser());
        writeOptagnePladser(pHus, "*DIN FILSTI HER*");

    }

    public static double getPHusSaldo(Parkeringshus pHus) {
        return pHus.getSaldo();
    }
}

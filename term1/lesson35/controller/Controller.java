package term1.lesson35.controller;

import term1.lesson35.model.*;
import term1.lesson35.storage.Storage;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Controller {
    public static Festival opretFestival(String navn, LocalDate tilDato, LocalDate fraDato) {
        Festival festival = new Festival(navn, fraDato, tilDato);
        Storage.tilføjFestival(festival);
        return festival;
    }

    public static List<Festival> getFestivaller() {
        return Storage.getFestivaller();
    }

    public static List<Frivillig> getFrivillige() {
        return Storage.getFrivillige();
    }

    public static Frivillig opretFrivillig(String navn, String mobil, int maksAntalTimer) {
        Frivillig frivillig = new Frivillig(navn, mobil, maksAntalTimer);
        Storage.tilføjFrivillig(frivillig);
        return frivillig;
    }

    public static FrivilligForening opretFrivilligForening(String navn, String mobil, int maksAntalTimer, String foreningNavn, int antalFrivillige) {
        FrivilligForening frivilligForening = new FrivilligForening(navn, mobil, maksAntalTimer, foreningNavn, antalFrivillige);
        Storage.tilføjFrivillig(frivilligForening);
        return frivilligForening;
    }

    public static Vagt tagVagt(Job job, Frivillig frivillig, int timer) {
        int ledigeTimer = frivillig.ledigeTimer();
        int ikkeBesatteTimer = job.ikkeBesatteTimer();
        if (ledigeTimer - timer >= 0 && ikkeBesatteTimer > 0) {
            return job.opretVagt(frivillig, timer);
        } else if (ledigeTimer - timer < 0) {
            throw new RuntimeException("Frivillig " + frivillig.getNavn() + ", har " + ledigeTimer + " timer tilbage, men vagten er på " + timer + " timer");
        } else {
            throw new RuntimeException("Job " + job.getKode() + ", har ikke brug for flere vagter");
        }
    }

    public static boolean findFrivillig(Festival festival, String navn) {
        List<String> gaveListe = festival.gaverTilFrivillige();

        int left = 0;
        int right = gaveListe.size() - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            String nuværendeNavn = gaveListe.get(middle).split(" ")[0];
            if (nuværendeNavn.equals(navn)) {
                return true;
            } else if (nuværendeNavn.compareTo(navn) > 0) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }


    public static void initStorage() {
        Festival festival = opretFestival("Northside", LocalDate.of(2020, Month.JUNE, 4), LocalDate.of(2020, Month.JUNE, 6));
        festival.opretJob(5, 100, LocalDate.of(2020, Month.JUNE, 4), "Rengøring af toiler", "T1");
        festival.opretJob(5, 100, LocalDate.of(2020, Month.JUNE, 4), "Rengøring af toiler", "T2");
        festival.opretJob(5, 100, LocalDate.of(2020, Month.JUNE, 4), "Rengøring af toiler", "T3");
        festival.opretJob(5, 100, LocalDate.of(2020, Month.JUNE, 5), "Rengøring af toiler", "T4");
        festival.opretJob(5, 100, LocalDate.of(2020, Month.JUNE, 5), "Rengøring af toiler", "T5");
        festival.opretJob(5, 100, LocalDate.of(2020, Month.JUNE, 5), "Rengøring af toiler", "T6");
        festival.opretJob(5, 100, LocalDate.of(2020, Month.JUNE, 6), "Rengøring af toiler", "T7");
        festival.opretJob(5, 100, LocalDate.of(2020, Month.JUNE, 6), "Rengøring af toiler", "T8");
        festival.opretJob(5, 100, LocalDate.of(2020, Month.JUNE, 6), "Rengøring af toiler", "T9");

        opretFrivillig("Jane Jensen", "12345677", 20);
        opretFrivillig("Lone Hansen", "78787878", 25);
        opretFrivillig("Anders Mikkelsen", "55555555", 10);
        opretFrivilligForening("Christian Madsen", "23232323", 100, "Erhvervsakademi Aarhus", 40);
    }


}

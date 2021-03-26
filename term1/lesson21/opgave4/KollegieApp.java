package term1.lesson21.opgave4;

import java.time.LocalDate;

public class KollegieApp {
    public static void main(String[] args) {
        Kollegie kollegie = new Kollegie("Kollegie 1", "Testvej 1");
        Bolig bolig = new Bolig(3000, "Testvej 2", 30000, kollegie);
        Lejeaftale lejeaftale = bolig.opretLejeaftale(LocalDate.of(2021, 4, 1));
        lejeaftale.addLejer(new Lejer("Emilio", "Datamatiker"));
        lejeaftale.setTilDato(LocalDate.of(2021, 4, 30));
        kollegie.tilføjBolig(bolig);

        System.out.println("Antal lejeaftaler på kollegiet: " + kollegie.getAntalLejeKontrakter(false));
        System.out.println("Gennemsnitlig antal dage for lejekonktrakter: " + kollegie.gennemsnitligAntalDage());
    }
}

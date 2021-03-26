package term1.lesson21.opgave4;

import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Kollegie {
    private String navn;
    private String adresse;
    private ArrayList<Bolig> boliger = new ArrayList<Bolig>();

    public Kollegie(String navn, String adresse) {
        this.navn = navn;
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void tilføjBolig(Bolig bolig) {
        this.boliger.add(bolig);
    }

    public int getAntalLejeKontrakter(boolean kunMedSlutDato) {
        int lejeaftaler = 0;

        for (Bolig bolig : this.boliger) {
            for (Lejeaftale lejeaftale : bolig.getLejeaftaler()) {
                if (!kunMedSlutDato) {
                    lejeaftaler++;
                } else {
                    if (lejeaftale.getTilDato() != null) {
                        lejeaftaler++;
                    }
                }
            }

        }
        return lejeaftaler;
    }

    public Long gennemsnitligAntalDage() {
        Long sum = new Long(0);
        int antalLejeKontrakter = getAntalLejeKontrakter(true);

        if (antalLejeKontrakter == 0) {
            System.out.println("Ingen lejekontrakter med sludato");
            return sum;
        } else {
            for (Bolig bolig : this.boliger) {
                for (Lejeaftale lejeaftale : bolig.getLejeaftaler()) {
                    if (lejeaftale.getTilDato() != null) {
                        Long days = ChronoUnit.DAYS.between(lejeaftale.getFraDato(), lejeaftale.getTilDato());
                        sum += days;
                    }
                }
            }
        }

        return sum / this.getAntalLejeKontrakter(true);
    }

}

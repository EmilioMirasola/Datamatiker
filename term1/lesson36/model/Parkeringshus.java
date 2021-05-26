package term1.lesson36.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Parkeringshus {
    private final String adresse;
    private final List<Parkeringsplads> parkeringspladser;
    private int saldo;

    public Parkeringshus(String adresse) {
        this.adresse = adresse;
        this.saldo = 0;
        this.parkeringspladser = new ArrayList<>();
    }

    public String getAdresse() {
        return adresse;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Parkeringsplads> getParkeringspladser() {
        return new ArrayList<>(parkeringspladser);
    }

    public Parkeringsplads opretParkeringsplads(int nummer) {
        Parkeringsplads pPlads = new Parkeringsplads(nummer, this);
        this.parkeringspladser.add(pPlads);
        return pPlads;

    }

    public Invalideplads opretInvalideParkeringsPlads(int nummer, double areal) {
        Invalideplads pPlads = new Invalideplads(nummer, areal, this);
        this.parkeringspladser.add(pPlads);
        return pPlads;
    }

    public void opdaterSaldo(double saldo) {
        this.saldo += saldo;
    }

    public int antalLedigePladser() {
        return (int) parkeringspladser
                .stream()
                .filter(parkeringsplads -> parkeringsplads.getBil() == null)
                .count();

        //Kan også laves med en alm. løkke, som løber igennem parkeringspladser og finder ud af hvor mange, der ikke har en bil tilknyttet.
    }

    public int findPladsMedBil(String bilRegNr) {
        int i = 0;

        while (i < parkeringspladser.size()) {
            Parkeringsplads pPlads = parkeringspladser.get(i);
            if (pPlads.getBil() != null && pPlads.getParkeretBilRegNr().equals(bilRegNr)) {
                return pPlads.getNummer();
            } else {
                i++;
            }
        }
        return -1;
    }

    public int findAntalBiler(Bilmærke mærke) {
        return (int) parkeringspladser
                .stream()
                .filter(parkeringsplads -> parkeringsplads.getBil() != null && parkeringsplads.getBil().getMærke() == mærke)
                .count();

        //Kan også laves med alm. løkke, som løber gennem parkeringspladser og laver de samme logiske sammenligninger med en tællervariabel, der returneres.
    }

    public List<String> optagnePladser() {
        return parkeringspladser
                .stream()
                .filter(parkeringsplads -> parkeringsplads.getBil() != null)
                .map(parkeringsplads -> "Nummer: " + parkeringsplads.getNummer() + ", Bil regNr: " + parkeringsplads.getParkeretBilRegNr() + ", Mærke: " + parkeringsplads.getParkeretBilMærke())
                .collect(Collectors.toList());

        //Kunne også være lavet med alm. løkke, hvor man tjekker for om parkeringspladsen har en bil. Hvis ja -> tilføj streng med data til array, som returneres til sidst.
    }

    @Override
    public String toString() {
        return getAdresse();
    }

    public List<Parkeringsplads> getFrieParkeringspladser() {
        return getParkeringspladser()
                .stream()
                .filter(parkeringsplads -> parkeringsplads.getBil() == null)
                .collect(Collectors.toList());
    }
}

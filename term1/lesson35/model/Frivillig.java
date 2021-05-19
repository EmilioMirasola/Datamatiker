package term1.lesson35.model;

import java.util.ArrayList;
import java.util.List;

public class Frivillig implements Comparable<Frivillig> {
    private String navn;
    private String mobil;
    private int maksAntalTimer;
    private List<Vagt> vagter;

    public Frivillig(String navn, String mobil, int maskAntalTimer) {
        this.navn = navn;
        this.mobil = mobil;
        this.maksAntalTimer = maskAntalTimer;
        this.vagter = new ArrayList<>();
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public int getMaksAntalTimer() {
        return maksAntalTimer;
    }

    public void tilføjVagt(Vagt vagt) {
        if (!this.vagter.contains(vagt)) {
            this.vagter.add(vagt);
        }
    }

    public void fjernVagt(Vagt vagt) {
        this.vagter.remove(vagt);
    }

    public List<Vagt> getVagter() {
        return new ArrayList<>(vagter);
    }

    public int ledigeTimer() {
        return getMaksAntalTimer() - this.vagter.stream()
                .mapToInt(Vagt::getTimer)
                .sum();
    }

    @Override
    public String toString() {
        return this.getNavn() + " " + 1;
    }

    @Override
    public int compareTo(Frivillig frivillig) {
        return this.getNavn().compareTo(frivillig.getNavn());
    }
}

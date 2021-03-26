package term1.lesson21.opgave4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Lejeaftale {
    private LocalDate fraDato;
    private LocalDate tilDato;
    private Bolig bolig;
    private ArrayList<Lejer> lejere = new ArrayList<Lejer>();

    Lejeaftale(LocalDate fraDato, Bolig bolig) {
        this.fraDato = fraDato;
        this.bolig = bolig;
    }

    public LocalDate getFraDato() {
        return fraDato;
    }

    public Bolig getBolig() {
        return this.bolig;
    }

    public LocalDate getTilDato() {
        return tilDato;
    }

    public void setTilDato(LocalDate tilDato) {
        this.tilDato = tilDato;
    }

    public void addLejer(Lejer lejer) {
        this.lejere.add(lejer);
    }

}

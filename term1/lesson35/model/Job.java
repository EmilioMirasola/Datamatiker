package term1.lesson35.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Job {
    private String kode;
    private String beskrivelse;
    private LocalDate dato;
    private int timeHonorar;
    private int antalTimer;
    private List<Vagt> vagter;

    public Job(String kode, String beskrivelse, LocalDate dato, int timeHonorar, int antalTimer) {
        this.kode = kode;
        this.beskrivelse = beskrivelse;
        this.dato = dato;
        this.timeHonorar = timeHonorar;
        this.antalTimer = antalTimer;
        this.vagter = new ArrayList<>();
    }

    public int getAntalTimer() {
        return antalTimer;
    }

    public int getTimeHonorar() {
        return timeHonorar;
    }

    public LocalDate getDato() {
        return dato;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public String getKode() {
        return kode;
    }

    public Vagt opretVagt(Frivillig frivillig, int timer) {
        Vagt vagt = new Vagt(timer, this, frivillig);
        this.vagter.add(vagt);
        frivillig.tilføjVagt(vagt);
        return vagt;
    }

    public void sletVagt(Vagt vagt) {
        this.vagter.remove(vagt);
    }

    public int ikkeBesatteTimer() {
        return getAntalTimer() - vagter.stream().mapToInt(Vagt::getTimer).sum();
    }

    public List<Vagt> getVagter() {
        return new ArrayList<>(vagter);
    }

    @Override
    public String toString() {
        return this.getKode() + " " + this.getBeskrivelse() + " " + this.getDato() + ", timer: " + getAntalTimer();
    }
}

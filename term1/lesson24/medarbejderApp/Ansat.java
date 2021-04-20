package term1.lesson24.medarbejderApp;

@SuppressWarnings("NonAsciiCharacters")
public abstract class Ansat extends Person {
    private double timelønsSats;

    public Ansat(String navn, String adresse, double timelønsSats) {
        super(navn, adresse);
        this.timelønsSats = timelønsSats;
    }

    public abstract double beregnUgeløn();

    public double getTimelønsSats() {
        return timelønsSats;
    }

    public void setTimelønsSats(double timelønsSats) {
        this.timelønsSats = timelønsSats;
    }
}

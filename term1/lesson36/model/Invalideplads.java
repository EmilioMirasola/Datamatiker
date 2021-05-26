package term1.lesson36.model;

import java.time.LocalTime;

public class Invalideplads extends Parkeringsplads {
    private final double areal;

    public Invalideplads(int nummber, double areal, Parkeringshus pHus) {
        super(nummber, pHus);
        this.areal = areal;
    }

    public double getAreal() {
        return areal;
    }

    @Override
    public int udregnParkeringsPris(LocalTime slut) {
        return 0;
    }

    @Override
    public String toString() {
        return "invalideplads, " + super.toString();
    }
}

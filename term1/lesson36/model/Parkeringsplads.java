package term1.lesson36.model;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Parkeringsplads {
    private final int nummer;
    private LocalTime ankomst;
    private final Parkeringshus pHus;
    private Bil bil;

    public Parkeringsplads(int nummer, Parkeringshus pHus) {
        this.nummer = nummer;
        this.pHus = pHus;
        this.ankomst = null;
    }

    public int getNummer() {
        return nummer;
    }

    public void parkerBil(Bil bil) {
        this.bil = bil;
        this.ankomst = LocalTime.now();
    }

    public void hentBil(LocalTime afgangsTidspunkt) {
        pHus.opdaterSaldo(udregnParkeringsPris(afgangsTidspunkt));
        this.bil = null;
        this.ankomst = null;
    }

    public Bil getBil() {
        return bil;
    }

    public String getParkeretBilRegNr() {
        return getBil().getRegNr();
    }

    public Bilmærke getParkeretBilMærke() {
        return getBil().getMærke();
    }

    public int udregnParkeringsPris(LocalTime slut) {
        long minutterParkeret = ChronoUnit.MINUTES.between(ankomst, slut);
        return (int) minutterParkeret / 10 * 6;
    }

    @Override
    public String toString() {
        return String.valueOf(getNummer());
    }
}

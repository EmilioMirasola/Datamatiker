package term1.lesson36.model;

public class Bil {
    private final String regNr;
    private final Bilmærke mærke;

    public Bil(String regNr, Bilmærke mærke) {
        this.regNr = regNr;
        this.mærke = mærke;
    }

    public String getRegNr() {
        return regNr;
    }

    public Bilmærke getMærke() {
        return mærke;
    }
}

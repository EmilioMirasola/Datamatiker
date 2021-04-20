package term1.lesson24.medarbejderApp;

@SuppressWarnings("ALL")
public class Værkfører extends Ansat {
    private int årUdnævnelse;
    private double tillægPrUge;
    private int årSvendeprøveBestået;

    public Værkfører(String navn, String adresse, double timelønsSats, int årUdnævnelse, int årSvendeprøveBestået, double tillægPrUge) {
        super(navn, adresse, timelønsSats);
        this.årUdnævnelse = årUdnævnelse;
        this.tillægPrUge = tillægPrUge;
        this.årUdnævnelse = årSvendeprøveBestået;
    }

    public double getTillægPrUge() {
        return tillægPrUge;
    }

    public void setTillægPrUge(int tillægPrUge) {
        this.tillægPrUge = tillægPrUge;
    }

    public int getÅrUdnævnelse() {
        return årUdnævnelse;
    }

    public void setÅrUdnævnelse(int årUdnævnelse) {
        this.årUdnævnelse = årUdnævnelse;
    }

    @Override
    public double beregnUgeløn() {
        return super.getTimelønsSats() * 37;
    }
}

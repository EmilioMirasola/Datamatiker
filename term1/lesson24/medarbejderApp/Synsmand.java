package term1.lesson24.medarbejderApp;

@SuppressWarnings("ALL")
public class Synsmand extends Mekaniker {
    private int antalSyn;

    public Synsmand(String navn, String adresse, int årSvendeprøveBestået, double timelønsSats) {
        super(navn, adresse, årSvendeprøveBestået, timelønsSats);
    }

    public int getAntalSyn() {
        return antalSyn;
    }

    public void addSyn() {
        this.antalSyn++;
    }

    @Override
    public double beregnUgeløn() {
        return super.beregnUgeløn() + getAntalSyn() * 29;
    }
}

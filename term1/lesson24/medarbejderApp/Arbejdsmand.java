package term1.lesson24.medarbejderApp;

@SuppressWarnings("ALL")
public class Arbejdsmand extends Ansat {

    public Arbejdsmand(String navn, String adresse, double timelønsSats) {
        super(navn, adresse, timelønsSats);
    }

    @Override
    public double beregnUgeløn() {
        return super.getTimelønsSats() * 25;
    }
}

package term1.lesson25.opgave5;

public class Spiritus extends Vare {
    private static final double SPIRITUSMOMS = 0.8;
    private final double alkoholProcent;

    public Spiritus(double alkoholProcent, double pris, String navn, String beskrivelse) {
        super(pris, navn, beskrivelse);
        this.alkoholProcent = alkoholProcent;
    }

    @Override
    public double beregnPris() {
        if (getPrisEksMoms() > 90) {
            return getPrisEksMoms() * (SPIRITUSMOMS + 0.4);
        } else {
            return getPrisEksMoms() * (SPIRITUSMOMS + 1);
        }
    }

    public double getAlkoholProcent() {
        return alkoholProcent;
    }
}

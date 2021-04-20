package term1.lesson25.opgave5;

@SuppressWarnings("ALL")
public class Fødevare extends Vare {
    private static double FØDEVAREMOMS = 0.05;
    private int holdbarhed;

    public Fødevare(double prisEksMoms, int holdbarhed, String navn, String beskrivelse) {
        super(prisEksMoms, navn, beskrivelse);
        this.holdbarhed = holdbarhed;
    }

    public int getHoldbarhed() {
        return holdbarhed;
    }

    @Override
    public double beregnPris() {
        return getPrisEksMoms() * (FØDEVAREMOMS + 1);
    }
}

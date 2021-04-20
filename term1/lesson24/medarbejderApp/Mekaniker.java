package term1.lesson24.medarbejderApp;

@SuppressWarnings("ALL")
public class Mekaniker extends Ansat {
    private int årSvendeprøveBestået;

    public Mekaniker(String navn, String adresse, int årSvendeprøveBestået, double timelønsSats) {
        super(navn, adresse, timelønsSats);
        this.årSvendeprøveBestået = årSvendeprøveBestået;
    }

    public void setTimelønsSats(int timelønsSats) {
        // this.timelønsSats = timelønsSats;
    }

    public int getÅrSvendeprøveBestået() {
        return årSvendeprøveBestået;
    }

    public void setÅrSvendeprøveBestået(int årSvendeprøveBestået) {
        this.årSvendeprøveBestået = årSvendeprøveBestået;
    }

    @Override
    public double beregnUgeløn() {
        return super.getTimelønsSats() * 37;
    }
}

package term1.lesson25.opgave5;

public abstract class Vare {
    private final double prisEksMoms;
    private final String navn;
    private final String beskrivelse;
    private static final double MOMS = 0.25;

    public Vare(double prisEksMoms, String navn, String beskrivelse) {
        this.prisEksMoms = prisEksMoms;
        this.navn = navn;
        this.beskrivelse = beskrivelse;
    }

    public String getNavn() {
        return navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public double getPrisEksMoms() {
        return prisEksMoms;
    }

    public static double getMoms() {
        return MOMS;
    }

    public abstract double beregnPris();
}

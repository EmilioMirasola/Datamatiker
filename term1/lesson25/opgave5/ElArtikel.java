package term1.lesson25.opgave5;

public class ElArtikel extends Vare {
    private static final double ELMOMS = 0.3;
    private final double energiForbrugPrTime;

    public ElArtikel(double pris, double energiForbrugPrTime, String navn, String beskrivelse) {
        super(pris, navn, beskrivelse);
        this.energiForbrugPrTime = energiForbrugPrTime;
    }

    @Override
    public double beregnPris() {
        double medMoms = getPrisEksMoms() * (ELMOMS + 1);
        if (medMoms < 3) {
            medMoms = 3;
        }
        return medMoms;
    }

    public double getEnergiForbrugPrTime() {
        return energiForbrugPrTime;
    }
}

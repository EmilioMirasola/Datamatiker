package term1.systemudvikling.afærdbankkonto.Model;

import java.util.ArrayList;

public class Konto {

    private int nr;

    private ArrayList<Transaktion> transaktioner;

    private KontoType kontoType;

    private Tilstand tilstand;

    public Konto(KontoType kontoType) {

        this.kontoType = kontoType;
        this.nr = this.kontoType.getKonti().size() + 1;
        kontoType.addKonto(this);
        this.tilstand = Tilstand.AABEN;
        transaktioner = new ArrayList<>();
    }

    public int getNr() {
        return this.nr;
    }

    public Transaktion haevEllerIndsaetBeloeb(double beloeb) {
        Transaktion transaktion;
        if (!(tilstand == Tilstand.OVERTRUKKET && beloeb < 0 || tilstand == Tilstand.LUKKET)) {
            transaktion = new Transaktion(beloeb);
            transaktioner.add(transaktion);
            if (beregnSaldo() < 0) {
                tilstand = Tilstand.OVERTRUKKET;
            } else {
                tilstand = Tilstand.AABEN;
            }
        } else {
            if (tilstand == Tilstand.OVERTRUKKET) {
                throw new RuntimeException("Du forsoeger at haeve paa en overtrukket konto!");
            } else {
                throw new RuntimeException("Kontoen er lukket!");
            }
        }

        return transaktion;
    }

    public double beregnSaldo() {
        double saldo = 0;
        for (Transaktion transaktion : transaktioner) {
            saldo += transaktion.getBeloeb();
        }
        return saldo;

    }

    @Override
    public String toString() {
        return "Saldo konto nr. " + getNr() + " er " + beregnSaldo();
    }

    public void lukKonto() {
        this.tilstand = Tilstand.LUKKET;
    }

    public void åbenKonto() {
        this.tilstand = Tilstand.AABEN;
    }
}

package term1.systemudvikling.banksystem;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class Konto {
    private int nr;
    private KontoType kontoType;
    private ArrayList<Transaktion> transaktioner;

    public Konto(KontoType kontoType) {
        this.kontoType = kontoType;
        this.transaktioner = new ArrayList<>();
    }

    public int indsætBeløb(int beløb) {
        Transaktion transaktion = new Transaktion(beløb);
        transaktioner.add(transaktion);
        return beregnSaldo();
    }

    public int beregnSaldo() {
        int total = 0;
        for (Transaktion t : transaktioner) {
            total += t.getBeløb();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Saldo: " + beregnSaldo());
        sb.append(" - Kontotype: " + kontoType.getNavn());
        sb.append(" - Antal transaktioner: " + transaktioner.size());
        return sb.toString();
    }
}

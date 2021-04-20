package term1.systemudvikling.banksystem;

import java.time.LocalDate;

@SuppressWarnings("ALL")
public class Transaktion {
    private int beløb;
    private LocalDate dato;
    private Konto konto;


    public Transaktion(int beløb) {
        this.beløb = beløb;
        this.dato = LocalDate.now();
    }

    public int getBeløb() {
        return beløb;
    }

    public void setKonto(Konto konto) {
        this.konto = konto;
        }
}

package term1.systemudvikling;

public class Konto {
    private int nr;
    private int saldo;
    private String kontoType;
    private String status;

    public Konto(int nr, String kontoType) {
        this.nr = nr;
        this.saldo = 0;
        this.kontoType = kontoType;
        this.status = "Åben";
    }

    public void indsætBeløb(int beløb) {
        if (kontoErÅben()) {
            this.saldo += beløb;
        } else {
            System.out.println("Konto er ikke åben");
        }
    }

    public void hævBeløb(int beløb) {
        if (kontoErÅben()) {
            this.saldo -= beløb;
        } else {
            System.out.println("Konto er ikke åben");
        }
    }

    public boolean kontoErÅben() {
        return this.status.equalsIgnoreCase("Åben");
    }

    public void lukKonto() {
        this.status = "Lukket";
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getKontoType() {
        return kontoType;
    }

    public void setKontoType(String kontoType) {
        this.kontoType = kontoType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

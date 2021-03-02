package term1.systemudvikling;

public class KontoApp {
    public static void main(String[] args) {
        Konto konto = new Konto(123, "Normal");
        konto.indsætBeløb(100);
        konto.hævBeløb(50);
        System.out.println("Saldo: " + konto.getSaldo());
        konto.lukKonto();
        konto.indsætBeløb(50);
        System.out.println("Saldo: " + konto.getSaldo());
    }
}
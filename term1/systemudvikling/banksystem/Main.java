package term1.systemudvikling.banksystem;

public class Main {
    public static void main(String[] args) {
        KontoType kt = new KontoType("Milliardærkonto", "For dem med milliarder af skejs", "Over 18");
        Konto k = new Konto(kt);
        k.indsætBeløb(100);
        System.out.println(k);
    }
}

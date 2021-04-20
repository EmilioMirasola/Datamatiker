package term1.lesson25.opgave5;

public class VareApp {

    public static void main(String[] args) {
        Fødevare f = new Fødevare(8, 10, "Mælk", "Noget en ko laver");
        Spiritus s = new Spiritus(40, 90, "Vodka", "Locodrik");
        Indkøbsvogn vogn = new Indkøbsvogn();
        vogn.addVare(f);
        vogn.addVare(s);
        System.out.println(vogn.beregnTotalPris());
    }

}

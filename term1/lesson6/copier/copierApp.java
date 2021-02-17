package term1.lesson6.copier;

public class copierApp {
    public static void main(String[] args) {
        Copier c1 = new Copier();
        c1.insertPaper(1000);
        c1.insertPaper(10);
        c1.makeCopy(20);
        c1.makePaperJam();
        c1.makeCopy(5);
        c1.makeCopy(5);
        System.out.println("Antal papirer i printeten: " + c1.getPaper());

    }
}

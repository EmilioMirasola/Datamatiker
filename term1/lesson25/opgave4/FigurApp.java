package term1.lesson25.opgave4;

public class FigurApp {
    public static void main(String[] args) {
        Ellipse e = new Ellipse(10, 30);
        System.out.println(e.getAreal());

        Cirkel c = new Cirkel(10);
        System.out.println(c.getAreal());
    }
}

package term1.lesson5;

public class RadiatorApp {
    public static void main(String[] args) {
        Radiator radiator1 = new Radiator();
        radiator1.skruOp(25);

        Radiator radiator2 = new Radiator(22);
        radiator2.skruNed(15);

        System.out.println(radiator1.getTemp());
        System.out.println(radiator2.getTemp());
    }
}

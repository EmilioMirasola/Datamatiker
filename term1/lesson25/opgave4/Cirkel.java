package term1.lesson25.opgave4;

public class Cirkel extends Figur {
    private double radius;

    public Cirkel(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getAreal() {
        return Math.PI*Math.pow(getRadius(), 2);
    }
}

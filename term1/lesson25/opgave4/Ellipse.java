package term1.lesson25.opgave4;

public class Ellipse extends Cirkel{
    private double radiusLength;
    public Ellipse(double radiusHeight, double radiusLength) {
        super(radiusHeight);
        this.radiusLength = radiusLength;
    }

    @Override
    public double getAreal(){
        return Math.PI*getRadius()*getRadiusLength();
    }

    public double getRadiusLength() {
        return radiusLength;
    }
}

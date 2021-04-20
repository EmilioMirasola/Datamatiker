package term1.lesson25.opgave4;

public class Rektankel extends Figur{
    private double length;
    private double height;

    public Rektankel(double length, double height) {
        super();
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getAreal() {
        return length*height;
    }
}

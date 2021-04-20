package term1.lesson25.opgave4;

public abstract class Figur {
    private double x;
    private double y;

    public abstract double getAreal();

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void parallelForskyd(int newX, int newY) {
        setX(newX);
        setY(newY);
    }
}

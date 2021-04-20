package term1.lesson26.opgave1;

public class Chilli implements Measurable{
    private final String name;
    private final double scoville;

    public Chilli(String name, double scoville) {
        this.name = name;
        this.scoville = scoville;
    }

    @Override
    public double getMeasure() {
        return this.getScoville();
    }

    public double getScoville() {
        return scoville;
    }

    public String getName() {
        return name;
    }

}

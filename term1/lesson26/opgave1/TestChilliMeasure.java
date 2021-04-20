package term1.lesson26.opgave1;

public class TestChilliMeasure implements Filter {
    private double testValue;

    public TestChilliMeasure(double testValue) {
        this.testValue = testValue;
    }

    @Override
    public boolean accept(Object x) {
        return ((Chilli) x).getMeasure() > testValue;
    }
}

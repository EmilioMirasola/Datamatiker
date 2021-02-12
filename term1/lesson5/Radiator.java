package term1.lesson5;

public class Radiator {
    private int temperature;

    public Radiator(int temperature) {
        this.temperature = temperature;
    }

    public Radiator() {
        this.temperature = 20;
    }

    public void skruOp(int grader) {
        this.temperature=grader;
    }

    public void skruNed(int grader) {
        this.temperature = grader;
    }

    public int getTemp() {
        return this.temperature;
    }
}

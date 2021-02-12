package term1.lesson5;

public class Bug {
    private int initialPosition;
    private boolean directionIsRight;

    public Bug(int initialPosition) {
        this.initialPosition = initialPosition;
    }

    public void turn() {
        this.directionIsRight = !this.directionIsRight;
    }

    public void move() {
        if (directionIsRight) {
            this.initialPosition++;
        } else {
            this.initialPosition--;
        }
    }

    public int getPosition() {
        return this.initialPosition;
    }

    public boolean getDirection() {
        return this.directionIsRight;
    }
}

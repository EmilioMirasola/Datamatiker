package term1.lesson23.semesterprøve.application.model;

public class Seat {
    private final int number;
    private final Area area;
    private static int standardPrice = 50;

    public Seat(int number, Area area) {
        this.number = number;
        this.area = area;
    }

    public static int getStandardPrice() {
        return standardPrice;
    }

    public static void setStandardPrice(int standardPrice) {
        Seat.standardPrice = standardPrice;
    }

    public Area getArea() {
        return area;
    }

    public int getNumber() {
        return number;
    }

    public double price(int hours) {
        double price = standardPrice;
        switch (area) {
            case VIP:
                price *= 1.25 * hours;
                break;
            case KIDS:
                price *= 0.8 * hours;
                break;
            case TOURNAMENT:
                price *= 1.1 * hours;
                break;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Plads " +
                number +
                ", " +
                getArea();
    }
}

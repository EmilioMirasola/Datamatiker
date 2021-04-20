package term1.lesson24.minihandel;

import java.time.Year;

public class AgeDiscount implements Discount {
    private final int birthYear;

    public AgeDiscount(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public double applyDiscount(double price) {
        double percent = Year.now().getValue() - getBirthYear();
        return price - (percent / 100) * price;
    }

}

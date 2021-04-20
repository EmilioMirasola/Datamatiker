package term1.lesson24.minihandel;

public class PercentDiscount implements Discount {
    private int discountPercentage;

    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double price) {
        double percent = (100 - discountPercentage);
        return (percent / 100) * price;
    }
}

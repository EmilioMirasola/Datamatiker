package term1.lesson24.minihandel;

public class FixedDiscount implements Discount {
    private int fixedDiscount;
    private int discountLimit;

    public FixedDiscount(int fixedDiscount, int discountLimit) {
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    public int getDiscountLimit() {
        return discountLimit;
    }

    public void setDiscountLimit(int discountLimit) {
        this.discountLimit = discountLimit;
    }

    @Override
    public double applyDiscount(double price) {
        if (price > discountLimit) {
            return price-fixedDiscount;
        } else {
            return price;
        }
    }

    public void setFixedDiscount(int fixedDiscount) {
        this.fixedDiscount = fixedDiscount;
    }
}

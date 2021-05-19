package term1.systemudvikling.aarhusøko;

public class Subscription {
    private final FoodBoxCategory category;
    private int frequency;

    public Subscription(FoodBoxCategory foodBox, int frequency) {
        this.category = foodBox;
        this.frequency = frequency;
    }

    public FoodBoxCategory getFootBoxCategory() {
        return category;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public double calculatePrice() {
        return category.getPricePerDelivery();
    }
}

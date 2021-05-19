package term1.systemudvikling.aarhusøko;

public abstract class FoodBoxCategory {
    private String name;
    private double pricePerDelivery;

    public FoodBoxCategory(String name, double pricePerDelivery) {
        this.name = name;
        this.pricePerDelivery = pricePerDelivery;
    }

    public double getPricePerDelivery() {
        return pricePerDelivery;
    }

    public void setPricePerDelivery(double pricePerDelivery) {
        this.pricePerDelivery = pricePerDelivery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

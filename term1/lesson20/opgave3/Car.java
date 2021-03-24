package term1.lesson20.opgave3;

public class Car {
    private String license;
    private double pricePerDay;
    private int purchaseYear;

    public Car(String license, int purchaseYear) {
        this.license = license;
        this.purchaseYear = purchaseYear;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public String getLicense() {
        return license;
    }

}

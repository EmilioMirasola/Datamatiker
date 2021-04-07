package term1.lesson21.opgave1;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String license;
    private double pricePerDay;
    private final int purchaseYear;
    private final List<Rental> rentals = new ArrayList<>();

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

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public int getLongestRental() {
        int longest = 0;
        for (Rental rental : this.rentals) {
            int days = rental.getDays();
            if (days > longest) {
                longest = days;
            }
        }
        return longest;

    }
}

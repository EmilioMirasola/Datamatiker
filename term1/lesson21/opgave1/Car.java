package term1.lesson21.opgave1;

import java.util.ArrayList;

public class Car {
    private String license;
    private double pricePerDay;
    private int purchaseYear;
    private ArrayList<Rental> rentals = new ArrayList<Rental>();

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

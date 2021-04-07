package term1.lesson21.opgave1;

import java.util.ArrayList;

public class Rental {
    private int number;
    private int days;
    private String date;
    private ArrayList<Car> cars;

    public Rental(int number, int days, String date) {
        this.number = number;
        this.days = days;
        this.date = date;
        this.cars = new ArrayList<Car>();
    }

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        return cars.stream().mapToDouble(Car::getPricePerDay).sum() * days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public ArrayList<Car> getCars() {
        return new ArrayList<Car>(this.cars);
    }

    public void addCar(Car car) {
        this.cars.add(car);
        car.addRental(this);
    }
}
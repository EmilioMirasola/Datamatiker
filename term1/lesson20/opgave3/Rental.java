package term1.lesson20.opgave3;

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

    public double getPrice() {
        int sum = 0;
        for (Car car : this.cars) {
            sum += car.getPricePerDay();
        }
        return sum * this.days;
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
    }
}

package term1.lesson21.opgave1;

import java.util.ArrayList;

public class RentalApp {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Rental r1 = new Rental(1, 10, "24-03-2021");
        for (int i = 0; i < 5; i++) {
            Car car = new Car("12345", 2020);
            car.setPricePerDay(1000);
            cars.add(car);
            r1.addCar(car);
        }
        System.out.println("Rental price: " + r1.getPrice());
        System.out.println("Car 1 longest rental: " + cars.get(0).getLongestRental());
    }
}

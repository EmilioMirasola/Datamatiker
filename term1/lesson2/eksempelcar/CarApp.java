package term1.lesson2.eksempelcar;

import java.util.Random;

public class CarApp {

	public static void main(String[] args) {

		// OPGAVE B + C + D + E
		Car myCar3 = new Car("Fiat Punto", "Yellow");
		myCar3.setRegistrationNumber("AB 43 929");
		myCar3.setKm(new Random().nextInt(999999));

		prettyPrint(myCar3);

	}

	static void prettyPrint(Car car) {
		System.out.println("* * * * * * * * * * * * *");
		System.out.println(car.getBrand().toUpperCase() + " " + car.getColor());
		System.out.println(car.getRegistrationNumber());
		System.out.println("Antal kilometer: " + car.getKm());
		System.out.println("* * * * * * * * * * * * *");
	}
}

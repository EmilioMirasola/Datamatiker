package term1.chapter2.eksempelcar;

public class CarApp {

	public static void main(String[] args) {
		Car myCar = new Car("VW Up", "White");
		System.out.println(myCar.getBrand());
		myCar.setRegistrationNumber("AB 11 123");
		System.out.println(myCar.getRegistrationNumber());
		System.out.println(myCar.getKm());
		
		System.out.println();
		
		Car myCar2 = new Car("Ford S-Max", "Black");
		System.out.println(myCar2.getBrand());
		myCar2.setRegistrationNumber("EF 56 789");
		System.out.println(myCar2.getRegistrationNumber());
		myCar2.setKm(123000);
		System.out.println(myCar2.getKm());
	}
}

package term1.systemudvikling.nedarvning;


public class NedarvningTest {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Emilio", "Niels Juels gade 74, ST", "Bossen", 1000);
		// t1.udskrivPerson();
		// System.out.println("Årlig løn: " + t1.yearSalary());
		t1.addCourse("Programmering");
		t1.printCourses();

	}

}

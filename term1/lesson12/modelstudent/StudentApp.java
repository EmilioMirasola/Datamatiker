package term1.lesson12.modelstudent;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentApp {

	/**
	 * Et program der opretter et par studerende og kalder metoder p� disse.
	 */
	public static void main(String[] args) {
		Student s1 = new Student("Hanne", 20);
		Student s2 = new Student("Margrethe", 12);
		s2.setActive(true);

		// System.out.println(s1.getName() + " " + s1.getAge());
		// System.out.println(s2.getName() + " " + s2.getAge());

		s2.addGrade(7);
		s2.addGrade(12);
		s2.addGrade(10);
		s2.addGrade(02);

		// System.out.println(s2.getName() + " har et gennemsnit paa: " +
		// s2.averageGrade());
		// System.out.println(s1.getName() + " har et gennemsnit paa: " +
		// s1.averageGrade());

		System.out.println("Karaktererne for " + s2.getName());
		// for (int i = 0; i < s2.getNumberOfGrades(); i++) {
		// System.out.println(s2.getGrades()[i]);
		// }
		System.out.println(Arrays.toString(s2.getGrades()));
		System.out.println("Højeste karakter: " + s2.maxGrade());
		System.out.println("Laveste karakter: " + s2.minGrade());

	}

}

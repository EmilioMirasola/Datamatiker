package term1.lesson12.modelchild;

import java.util.Arrays;

public class ChildApp {

	public static void main(String[] args) {
		Child c1 = new Child(10, true);// boy 4 years old
		Child c2 = new Child(2, false);// girl 2 years old
		Child c3 = new Child(2, false);// girl 2 years old
		Child c4 = new Child(2, false);// girl 2 years old

		// System.out.println("Et barn på " + c1.getAge());
		// System.out.println(c2.getWeight(10));

		// double[] weightInfo = c2.getIncrease();
		// System.out.println("Største vægtforøgelse: " + weightInfo[0] + " I år " +
		// (int) weightInfo[1]);

		Institution institution = new Institution("Hadbjerg skole", "Hadbjergvej 56");
		institution.addChild(c1);
		institution.addChild(c2);
		institution.addChild(c3);
		institution.addChild(c4);
		// System.out.println(institution.getChilds()[0].getAge());
		// System.out.println("Gennemsnitsalder: " +institution.averageAge());
		String gender = "Girl";
		System.out.println("Antal " + gender + ": " + institution.numberOfGender(gender));
	}

}

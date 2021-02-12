package term1.lesson4.personOpg4;

import java.util.ArrayList;
import java.util.List;

public class PersonApp {
    public static void main(String[] args) {
        List<String> companyList = new ArrayList<String>();
        companyList.add("Google");
        companyList.add("Facebook");

        Person emilio = new Person("Emilio Mirasola", "Niels Juels gade 74, ST", 50000, companyList);
        emilio.addCompany("Tesla");
        emilio.printPerson();

        int grade1 = 12;
        int grade2 = 12;
        int grade3 = 10;
        int grade4 = 12;

        double snit = (double) (grade1 + grade2 + grade3 + grade4) / 4;

        System.out.println(snit);
    }
}
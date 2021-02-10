package term1.lesson4.personOpg4;

import java.util.ArrayList;
import java.util.List;

public class PersonApp {
    public static void main(String[] args) {
        List<String> companyList = new ArrayList<String>();
        companyList.add("Google");
        companyList.add("Facebook");
        Person emilio = new Person("Emilio Mirasola", "Niels Juels gade 74, ST", 50000, companyList);
        emilio.printPerson();
    }
}
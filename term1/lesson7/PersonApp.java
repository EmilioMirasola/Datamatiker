package term1.lesson7;

public class PersonApp {

    public static void main(String[] args) {
        Person p = new Person("Margrethe", "Mosbæk", "Dybdahl", 27, 12, 1990);
        // p.printPerson();
        // System.out.println("Initialer: " + p.getInit());
        // System.out.println("Username: " + p.getUserName());

        // System.out.println("Age: " + p.age(17, 2, 2021)); // p's age today
        // int year = 2000;
        // System.out.println("Er " + year + " skudår: " + p.leapYear(year));

        Person emilio = new Person("Emilio", "Mirasola", 4, 10, 1998);
        // System.out.println("Initialer: " + emilio.getInit());
        System.out.println(emilio.getUserName());
    }
}

package term1.systemudvikling.nedarvning;

import java.util.ArrayList;

public class Teacher extends Person {
    private double salary;
    private ArrayList<String> courses;
    
    public Teacher(String name, String address, String qualification, double salary) {
        super(name, address, qualification);
        this.salary = salary;
        this.courses = new ArrayList<String>();
    }

    @Override
    public void udskrivPerson() {
        super.udskrivPerson();
        System.out.println("Løn: " + this.salary);
    }

    public void addCourse(String courseName) {
        this.courses.add(courseName);
    }

    public double yearSalary() {
        return this.salary*12 *1.125;
    }

    public void printCourses() {
        System.out.println(this.courses);
    }


}

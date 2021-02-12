package term1.lesson4.personOpg4;

import java.util.List;

public class Person {
    private String name;
    private String address;
    private double monthlySalary;
    private List<String> companies;

    public Person(String name, String address, double monthlySalary, List<String> companies) {
        this.name = name;
        this.address = address;
        this.monthlySalary = monthlySalary;
        this.companies = companies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getYearlySalary() {
        return this.monthlySalary * 12 * 1.025;
    }

    public int getNumberOfCompanies() {
        return this.companies.size();
    }

    private List<String> getCompanies() {
        return this.companies;
    }

    public void addCompany(String company) {
        this.companies.add(company);
    }

    public void printPerson() {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Monthly salary: " + this.monthlySalary + " KR");
        System.out.println("Yearly salary: " + this.getYearlySalary() + " KR");
        System.out.println("Number of companies: " + this.getNumberOfCompanies());
        System.out.println("Companies worked at: " + this.getCompanies());
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
    }
}

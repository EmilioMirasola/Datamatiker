package term1.lesson4.personOpg4;

import java.util.List;

public class Person {
    private String name;
    private String address;
    private double monthlySalary;
    private List<String> companies;

    public Person(String name, String address, double monthlySalary, List<String> companies) {
        this.setName(name);
        this.setAddress(address);
        this.setMonthlySalary(monthlySalary);
        this.companies = companies;
    }

    public int getNumberOfCompanies() {
        return this.companies.size();
    }

    public void addCompany(String company) {
        this.companies.add(company);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double yearlySalary() {
        return this.monthlySalary * 12;
    }

    public void printPerson() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Monthly salary: " + this.monthlySalary + " KR");
        System.out.println("Yearly salary: " + this.yearlySalary() + " KR");
        System.out.println("Number of companies: " + this.getNumberOfCompanies());
        System.out.println("Companies worked at: " + this.getCompanies());
    }

    private List<String> getCompanies() {
        return this.companies;
    }
}

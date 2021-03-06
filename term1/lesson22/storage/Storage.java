package term1.lesson22.storage;

import java.util.ArrayList;
import java.util.List;

import term1.lesson22.application.model.Company;
import term1.lesson22.application.model.Customer;
import term1.lesson22.application.model.Employee;

public class Storage {
	private static ArrayList<Company> companies = new ArrayList<>();
	private static ArrayList<Employee> employees = new ArrayList<>();
	private static List<Customer> customers = new ArrayList<>();
	// -------------------------------------------------------------------------

	public static ArrayList<Company> getCompanies() {
		return new ArrayList<Company>(companies);
	}

	public static void addCompany(Company company) {
		companies.add(company);
	}

	public static void removeCompany(Company company) {
		companies.remove(company);
	}

	// -------------------------------------------------------------------------

	public static ArrayList<Employee> getEmployees() {
		return new ArrayList<Employee>(employees);
	}

	public static void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public static void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public static void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public static ArrayList<Customer> getCustomers() {
		return new ArrayList<Customer>(customers);
	}

    // -------------------------------------------------------------------------

}

package term1.lesson32;

import term1.lesson31.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer(30, "a", "a");
        Customer customer2 = new Customer(25, "b", "b");
        Customer customer3 = new Customer(20, "c", "c");
        Customer customer4 = new Customer(15, "d", "d");
        Customer customer5 = new Customer(10, "e", "e");

        List<Customer> customerList = new ArrayList<>(Arrays.asList(customer1, customer2, customer3, customer4, customer5));

        opgave1(customerList, new Customer(5, "f", "b"));
        opgave1(customerList, new Customer(5, "a", "f"));
        System.out.println(customerList);

        System.out.println(opgave3("Heeeej", 5));
    }

    private static boolean opgave3(String s, int k) {
        for (int i = 0; i < s.length()-1 - k; i++) {

            char target = s.charAt(i);
            int j = 0;
            boolean missedTarget = false;
            while (j < k && !missedTarget) {
                if (s.charAt(i + j) != target) {
                    missedTarget = true;
                }
                if (j == k-1 && !missedTarget) {
                    System.out.println(k);
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    private static void opgave1(List<Customer> customerList, Customer customer) {
        boolean found = false;
        for (int i = 0; i < customerList.size() && !found; i++) {
            if (customerList.get(i).compareTo(customer) >= 0) {
                customerList.add(i, customer);
                found = true;
            }
        }
        if (!found) {
            customerList.add(customer);
        }
    }
}

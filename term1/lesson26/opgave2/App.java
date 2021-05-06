package term1.lesson26.opgave2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Customer[] customerList = new Customer[6];
        customerList[0] = new Customer("Emilio", "Mirasola", 22);
        customerList[1] = new Customer("Erminia", "Laura", 19);
        customerList[2] = new Customer("Filippa", "Bjerring", 17);
        customerList[3] = new Customer("Filippa", "Bjerring", 18);
        customerList[4] = new Customer("Lisa", "Pedersen", 49);
        customerList[5] = new Customer("Riccardo", "Nissemand", 50);

        System.out.println("Sidste costumer: " + lastCostumer(customerList).getEfternavn());
        Customer chosen = customerList[2];
        System.out.println("Kunder efter " + chosen.getEfternavn() + " : " + afterCostumer(customerList, chosen));
    }

    public static List<Customer> afterCostumer(Customer[] customerList, Customer customer) {
        return Arrays.stream(customerList)
                .filter(c -> c.compareTo(customer) > 0)
                .collect(Collectors.toList());
    }

    public static Customer lastCostumer(Customer[] costumers) {
        Customer lastCostumer = costumers[0];
        for (Customer costumer : costumers) {
            if (costumer.compareTo(lastCostumer) > 0) {
                lastCostumer = costumer;
            }
        }
        return lastCostumer;
    }
}

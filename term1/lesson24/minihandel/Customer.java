package term1.lesson24.minihandel;

import java.time.LocalDate;
import java.util.*;

/**
 * Models a Customer with Orders.
 */
public class Customer {
    private String name;
    private LocalDate birthday;
    private List<Order> orders = new ArrayList<Order>();
    private Discount discount;

    /**
     * Create a new Customer.
     *
     * @param name     the name.
     * @param birthday birthday of the customer.
     */
    public Customer(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Customer(String name, LocalDate birthday, Discount discount) {
        this.name = name;
        this.birthday = birthday;
        this.discount = discount;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void addOrder(Order order) {
        if (!orders.contains(order)) {
            orders.add(order);
        }
    }

    public double totalBuy() {
        return orders.stream().mapToDouble(Order::getOrderPrice).sum();
    }

    public double totalBuyWithDiscount() {
        if (discount != null) {
            return discount.applyDiscount(totalBuy());
        } else {
            return totalBuy();
        }
    }

    public int getBirthYear() {
        return this.getBirthday().getYear();
    }

    public void setDiscountType(Discount discount) {
        this.discount = discount;
    }
}

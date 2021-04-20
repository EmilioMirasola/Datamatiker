package term1.lesson24.minihandel;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Computer1", 5000);
        Product p2 = new Product(2, "Computer2", 6000);
        Product p3 = new Product(3, "Computer3", 7000);
        Product p4 = new Product(4, "Computer4", 8000);
        Product p5 = new Product(5, "Computer5", 9000);

        Customer c1 = new Customer("Emilio", LocalDate.of(1998, Month.OCTOBER, 4));
        Customer c2 = new Customer("Riccardo", LocalDate.of(1969, Month.NOVEMBER, 25));

        Order o1 = new Order(1);
        Order o2 = new Order(2);
        o1.createOrderLine(1, p1);
        o2.createOrderLine(1, p2);
        c1.addOrder(o1);
        c1.addOrder(o2);
        c2.addOrder(o1);
        c2.addOrder(o2);

        FixedDiscount f = new FixedDiscount(250, 1000);
        c2.setDiscountType(f);

        PercentDiscount p = new PercentDiscount(15);
        AgeDiscount a = new AgeDiscount(c1.getBirthYear());
        c1.setDiscountType(a);


        System.out.println("C1 totalBuy: " + c1.totalBuy());
        System.out.println("C1 totalBuyWithDiscount: " + c1.totalBuyWithDiscount());
        System.out.println();

        System.out.println("C2 totalBuy: " + c2.totalBuy());
        System.out.println("C2 totalBuyWithDiscount: " + c2.totalBuyWithDiscount());
    }
}

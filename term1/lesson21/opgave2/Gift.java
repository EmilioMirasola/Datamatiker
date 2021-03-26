package term1.lesson21.opgave2;

import java.util.ArrayList;

public class Gift {
    private String description;
    private double price;
    private ArrayList<Person> gives = new ArrayList<Person>();

    public Gift(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

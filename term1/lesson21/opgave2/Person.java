package term1.lesson21.opgave2;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<Gift> receives = new ArrayList<Gift>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", age: " + this.age;
    }

    public void sendGift(Gift gift) {
        this.receives.add(gift);
    }

    public double totalGiftValues() {
        double total = 0;
        for (Gift gift : this.receives) {
            total += gift.getPrice();
        }
        return total;
    }

}

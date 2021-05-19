package term1.systemudvikling.aarhusøko;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private boolean adressAuthorized;
    private List<Subscription> subscriptoins;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.subscriptoins = new ArrayList<>();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public List<Subscription> getSubscriptoins() {
        return new ArrayList<>(subscriptoins);
    }

    public Subscription createSubscription(FoodBoxCategory category, int frequency) {
        Subscription subscription = new Subscription(category, frequency);
        subscriptoins.add(subscription);
        return subscription;
    }
}

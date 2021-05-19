package term1.systemudvikling.aarhusøko;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Emilio", "Niels Juels gade 72", "61776780");
        LocalDate firstOfApril = LocalDate.of(2021, 6, 1);
        FruitFoodBox fruitFoodBox = new FruitFoodBox(firstOfApril, firstOfApril.plusDays(6));
        fruitFoodBox.addArticle(new Article("Banan"));
        Subscription subscription = customer.createSubscription(fruitFoodBox, 4);
        System.out.println(subscription.getFrequency());
        System.out.println(subscription.calculatePrice());
    }
}

package term1.lesson21.opgave2;

public class GiftApp {
    public static void main(String[] args) {
        Person person = new Person("Emilio", 22);
        for (int i = 0; i < 5; i++) {
            Gift gift = new Gift("MANGE PENGE");
            gift.setPrice(10);
            person.sendGift(gift);
        }

        System.out.println("Personens gavers værdi totalt: " + person.totalGiftValues());
    }
}

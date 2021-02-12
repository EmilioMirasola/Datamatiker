package term1.lesson1.lesson1;
import java.util.Random;

public class DemoApp {
    public static void main(String[] args) {
        Random rand = new Random();
        int maxNum = 100;
        int randomNum = rand.nextInt(maxNum);
        if (numberIsBig(randomNum)) {
            System.out.println("Talet er ret stort: " + randomNum);
        } else {
            System.out.println("Talet er ret lille: " + randomNum);
        }
    }

    private static boolean numberIsBig(int number) {
        if (number > 50) {
            return true;
        } else {
            return false;
        }
    }

}

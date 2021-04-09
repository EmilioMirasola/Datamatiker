package term1.lesson23.RaceEnum;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hund> hunde = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hunde.add(new Hund("Bella", false, 5000, Race.BOKSER));
        }
        System.out.println(samletPris(hunde));
    }

    public static int samletPris(ArrayList<Hund> hunde){
        return hunde.stream().mapToInt(Hund::getPris).sum();
    }
}
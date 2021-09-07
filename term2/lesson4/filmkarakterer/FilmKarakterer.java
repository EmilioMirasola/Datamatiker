package term2.lesson4.filmkarakterer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FilmKarakterer {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\emili\\datamatiker\\Programmering\\code\\term2\\lesson4\\filmkarakterer\\film.txt");
        Scanner scan = new Scanner(file);

        HashMap<String, Double> filmMap = new HashMap<>();
        HashMap<String, Integer> antalKaraktererMap = new HashMap<>();


        while (scan.hasNextLine()) {
            String titel = scan.nextLine();
            String karakter = scan.nextLine();
            if (!filmMap.containsKey(titel)) {
                filmMap.put(titel, Double.parseDouble(karakter));
                antalKaraktererMap.put(titel, 1);
            } else {
                filmMap.put(titel, filmMap.get(titel) + Double.parseDouble(karakter));
                antalKaraktererMap.put(titel, antalKaraktererMap.get(titel) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : antalKaraktererMap.entrySet()) {
            filmMap.put(entry.getKey(), filmMap.get(entry.getKey()) / entry.getValue());
        }


        for (Map.Entry<String, Double> entry : filmMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + antalKaraktererMap.get(entry.getKey()) + " karakterer, gennemsnit " + entry.getValue());
        }

    }
}

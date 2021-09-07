package term2.lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            liste.add(i);
        }


//        System.out.println(sum(liste));

        System.out.println(antalNuller(liste));

//        FletteSorteringHul fletteSorteringHul = new FletteSorteringHul();

        ArrayList<Integer> liste2 = new ArrayList<>();
        liste2.add(8);
        liste2.add(56);
        liste2.add(45);
        liste2.add(34);
        liste2.add(15);
        liste2.add(12);
        liste2.add(34);
        liste2.add(44);

//        fletteSorteringHul.fletteSort(liste2);
//        System.out.println(liste2);
    }

    public static int sum(List<Integer> list) {
        System.out.println(list);
        if (list.size() == 1) {
            return list.get(0);
        } else {
            int part1 = sum(list.subList(0, list.size() / 2));
            int part2 = sum(list.subList(list.size() / 2, list.size()));
            return part1 + part2;
        }
    }

    private static int antalNuller(List<Integer> list) {
        if (list.size() == 1) {
            if (list.get(0) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int part1 = antalNuller(list.subList(0, list.size() / 2));
            int part2 = antalNuller(list.subList(list.size() / 2, list.size()));
            return part1 + part2;
        }
    }
}

package term1.lesson27.soegningelevopgaver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Spillermetoder {
    public Spiller findScoreLinear(ArrayList<Spiller> spillere, int score) {
        Spiller spiller;
        int i = 0;
        while (i < spillere.size()) {
            if (spillere.get(i).getMaal() == score) {
                return spillere.get(i);
            }
            i++;
        }
        return null;
    }

    public String findGodSpiller(ArrayList<Spiller> spillere) {
        String spiller = "";
        int i = 0;
        while (i < spillere.size()) {
            if (spillere.get(i).getMaal() > 50 && spillere.get(i).getHoejde() < 170) {
                return spillere.get(i).getNavn();
            }
            i++;
        }
        return spiller;
    }

    public Spiller findScoreBinear(ArrayList<Spiller> spillere, int score) {
        Collections.sort(spillere);
        int left = 0;
        int right = spillere.size() - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int k = spillere.get(middle).getMaal();
            if (k == score) {
                return spillere.get(middle);
            } else if (k < score) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return null;
    }

    // Her tilføjes metoder der løser opgve 4.2 og 4.3

    public static void main(String[] args) {
        Spillermetoder metoder = new Spillermetoder();

        // Her afprøves opgave 4.1
        ArrayList<Spiller> spillerListe = new ArrayList<>();
        spillerListe.add(new Spiller("Hans", 196, 99, 45));
        spillerListe.add(new Spiller("Bo", 203, 89, 60));
        spillerListe.add(new Spiller("Jens", 188, 109, 32));
        spillerListe.add(new Spiller("Finn", 194, 102, 12));
        spillerListe.add(new Spiller("Lars", 192, 86, 35));
        spillerListe.add(new Spiller("Mads", 200, 103, 37));
        spillerListe.add(new Spiller("Thomas", 160, 103, 70));

        System.out.println("Spiller der har scoret 35 mål: " + metoder.findScoreLinear(spillerListe, 35));
        System.out.println("Spiller der har scoret 30 mål: " + metoder.findScoreBinear(spillerListe, 30));

        // Tilføj kode der afprøver opgaver 4.2 og 4.3
        System.out.println("Spiller der har scoret 35 mål: " + metoder.findScoreBinear(spillerListe, 35));
        System.out.println("Spiller der har scoret 30 mål: " + metoder.findScoreBinear(spillerListe, 30));

        System.out.println("Spiller, der er lavere end 170cm og har scoret mere end 50 mål: " + metoder.findGodSpiller(spillerListe));
    }

}

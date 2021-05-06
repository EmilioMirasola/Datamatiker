package term1.lesson27.soegningelevopgaver;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SoegningApp {


    public static void main(String[] args) {
        Soegning s = new Soegning();

        // Kode til afprøvning af opgave 1
        int[] talArray = {2, 4, 8, 9};
        //System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));
        //talArray[2] = 15;
        //System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));

        // Her tilføjes kode til at afprøve opgaverne 2,3,5,6 og 7

        // Kode til afprøvning af opgave 2
        //System.out.println("Er der et tal imellem 10 og 15?: " + s.findNumberInRange(talArray));

        // Kode til afprøvning af opgave 3
        //talArray[1] = 15;
        //System.out.println("Er der to ens tal ved siden af hinanden i arrayet?: " + s.findSimilarAdjacent(talArray));

        System.out.println(opgave6(talArray, 2));
        System.out.println(Arrays.toString(talArray));
    }


    public static int opgave6(int[] talArray, int n) {
        for (int i = 0; i < talArray.length; i++) {
            if (talArray[i] == n && i != 0) {
                int foregåendeIndex = i-1;
                int foregåendeTal = talArray[foregåendeIndex];

                talArray[foregåendeIndex] = talArray[i];
                talArray[i] = foregåendeTal;
                return foregåendeIndex;
            }
        }
        return -1;
    }

}

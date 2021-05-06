package term1.lesson27.soegningelevopgaver;

public class Soegning {

    public boolean findUlige(int[] tabel) {
        int i = 0;
        while (i < tabel.length) {
            if (tabel[i] % 2 != 0) {
                return true;
            }
            i++;
        }
        return false;
    }
    public int findNumberInRange(int[] tabel) {
        int i = 0;
        while (i < tabel.length) {
            if (tabel[i] >= 10 && tabel[i] <= 15) {
                return tabel[i];
            }
            i++;
        }
        return -1;
    }
    public boolean findSimilarAdjacent(int[] tabel) {
        int i = 1;
        while (i < tabel.length) {
            if (tabel[i-1] == tabel[i]) {
                return true;
            }
            i++;
        }
        return false;
    }


    // her skriver du metoder til opgaverne 2,3,5,6 og 7
}

package term1.lesson27.opgave5;

@SuppressWarnings("ALL")
public class Metode {
    public static void main(String[] args) {
        //System.out.println(findStørsteHeltalsKvadratrodLineær(7));
        System.out.println(findStørsteHeltalsKvadratrorBinear(11));
    }

    public static int findStørsteHeltalsKvadratrodLineær(int n) {
        int i = 0;
        while (i <= n) {
            if ((i * i) <= n && n < (i + 1) * (i + 1)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int findStørsteHeltalsKvadratrorBinear(int n) {
        int left = 0;
        int right = n;

        while (left <= right) {
            int middle = (left + right) / 2;
            if ((middle * middle) <= n && n < (middle + 1) * (middle + 1)) {
                return middle;
            } else if (middle * middle > n) {
                left = middle - 1;
            } else {
                right = middle + 1;
            }
        }
        return -1;
    }


}

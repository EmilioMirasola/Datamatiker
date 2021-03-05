package term1.lesson12.modelarray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import term1.lesson7.booleans;

public class ArrayMethods {
    public void printArray(int[] tabel) {
        System.out.print("{");
        for (int i = 0; i < tabel.length; i++) {
            if (i == 0) {
                System.out.print(tabel[i]);
            } else {
                System.out.print(", " + tabel[i]);
            }
        }
        System.out.println("}  ");
    }

    /**
     *
     * @return et array med indhold [0,0,0,0,0,0,0,0,0,0]
     */
    public int[] fyldArrayA() {
        int[] result = new int[10];
        return result;
    }

    /**
     *
     * @return et array med indhold [2,44,-23,99,8,-5,7,10,20,30]
     */
    public int[] fyldArrayB() {
        int[] result = new int[10];
        result[0] = 2;
        result[1] = 44;
        result[2] = -23;
        result[3] = 99;
        result[4] = 8;
        result[5] = -5;
        result[6] = 7;
        result[7] = 10;
        result[8] = 20;
        result[9] = 30;
        return result;
    }

    /**
     *
     * @return et array med indhold [0,1,2,3,4,5,6,7,8,9]
     */
    public int[] fyldArrayC() {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    }

    /**
     *
     * @return et array med indhold [2,4,6,8,10,12,14,16,18,20]
     */
    public int[] fyldArrayD() {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = (i + 1) * 2;
        }
        return result;
    }

    /**
     *
     * @return et array med indhold [1,4,9,16,25,36,49,64,81,100]
     */
    public int[] fyldArrayE() {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = (i + 1) * (i + 1);
        }
        return result;
    }

    /**
     *
     * @return et array med indhold [0,1,0,1,0,1,0,1,0,1]
     */
    public int[] fyldArrayF() {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = i % 2;
        }
        return result;
    }

    /**
     *
     * @return et array med indhold [0,1,2,3,4,0,1,2,3,4]
     */
    public int[] fyldArrayG() {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = i % 5;
            // for (int j = 0; j < result.length / 2; j++) {
            // if (i == 0) {
            // result[j] = j;
            // } else {
            // result[j + result.length / 2] = j;
            // }
            // }
        }
        return result;
    }

    public int findMax(int[] tabel) {
        int max = -1;
        for (int i = 0; i < tabel.length; i++) {
            if (tabel[i] > max) {
                max = tabel[i];
            }
        }
        return max;
    }

    public int intSum(int[] t) {
        int sum = 0;
        for (int number : t) {
            sum += number;
        }
        return sum;
    }

    public double doubleSum(double[] t) {
        double sum = 0;
        for (double number : t) {
            sum += number;
        }
        return sum;
    }

    public int[] makesum(int[] a, int[] b) {
        int[] newArray = new int[determineLongestArrayLength(a, b)];
        int[] longestArray = determineSmallestLongestArray("longest", a, b);
        int[] smallestArray = determineSmallestLongestArray("smallest", a, b);

        for (int i = 0; i < newArray.length; i++) {
            if (i >= smallestArray.length) {
                newArray[i] = longestArray[i];
            } else {
                newArray[i] = longestArray[i] + smallestArray[i];
            }
        }
        return newArray;
    }

    private int[] determineSmallestLongestArray(String smallLong, int[] a, int[] b) {
        if (smallLong.equalsIgnoreCase("smallest")) {
            if (a.length < b.length) {
                return a;
            } else {
                return b;
            }
        } else {
            if (a.length > b.length) {
                return a;
            } else {
                return b;
            }
        }
    }

    private int determineLongestArrayLength(int[] a, int[] b) {
        if (a.length > b.length) {
            return a.length;
        } else {
            return b.length;
        }
    }

    public boolean hasUnevenNum(int[] array) {
        for (int number : array) {
            if (number % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public void swapFirstLast(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }

    public void pushElementsRight(int[] array) {
        int last = array[array.length - 1];
        for (int index = array.length - 2; index >= 0; index--) {
            array[index + 1] = array[index];
        }
        array[0] = last;
    }

    public void replaceEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
    }

    public int secondLargest(int[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }

    public boolean isAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean containsDuplicates(int[] array) {
        int[] checkArray = new int[array.length];
        System.out.println(array.length);
        int nextIndex = 0;
        for (int i : array) {
            System.out.println("index" + nextIndex);
            for (int j : checkArray) {
                if (i == j) {
                    return true;
                }
            }
            checkArray[nextIndex] = i;
            nextIndex++;
        }
        return false;
    }
}

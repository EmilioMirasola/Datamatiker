package term1.lesson31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMethodsMin {

    public static void bubbleSort(String[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(String[] array) {
        {
            for (int index = 1; index < array.length; index++) {
                String key = array[index];
                int position = index; //  Shift larger values to the right while
                while (position > 0 && array[position - 1].compareTo(key) > 0) {
                    array[position] = array[position - 1];
                    position--;
                }
                array[position] = key;
            }
        }
    }

    public static void insertionSortList(ArrayList<String> array) {
        for (int outerIndex = 0; outerIndex < array.size(); outerIndex++) {
            String key = array.get(outerIndex);
            while (outerIndex > 0 && array.get(outerIndex - 1).compareTo(key) > 0) {
                Collections.swap(array, outerIndex, outerIndex - 1);
            }
        }
    }

    public static void selectionSort(String[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[j].compareTo(array[min]) < 0) {
                    min = j;
                    String temp = array[min];
                    array[min] = array[i];
                    array[i] = temp;
                }
            }

        }
    }

    public static void selectionSort(List<Customer> array) {
        int min;
        for (int i = 0; i < array.size() - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(j).compareTo(array.get(min)) < 0) {
                    min = j;
                }
                Collections.swap(array, j, min);
            }
        }
    }

}

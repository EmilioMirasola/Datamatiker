package term1.lesson31;

import term1.lesson31.Customer;
import java.util.ArrayList;
import java.util.Collections;


public class SortMethods {

    private static void swap(Comparable[] data, int index1, int index2) {
        Comparable temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    public static void bubbleSort(String[] array) {
        {
            int position, scan;
            for (position = array.length - 1; position >= 0; position--) {
                for (scan = 0; scan <= position - 1; scan++)
                    if (array[scan].compareTo(array[scan + 1]) > 0) {
                        swap(array, scan, scan + 1);
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

    public static void insertionSortCustomers(ArrayList<Customer> customers) {
        {
            for (int index = 1; index < customers.size(); index++) {
                Customer key = customers.get(index);
                int position = index; //  Shift larger values to the right while
                while (position > 0 && (customers.get(position - 1).compareTo(key) > 0)) {

                    Collections.swap(customers, customers.indexOf(customers.get(position)), customers.indexOf(customers.get(position - 1)));
                    position--;
                }
                //key = customers.get(position);
            }
        }
    }

    public static void selectionSort(String[] array) {
        int min;
        for (int index = 0; index < array.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < array.length; scan++) {
                if (array[scan].compareTo(array[min]) < 0) {
                    min = scan;
                }

            }
            swap(array, min, index);

        }
    }

    public static void selectionSortCustomers(ArrayList<Customer> customers) {
        int min;
        for (int index = 0; index < customers.size() - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < customers.size(); scan++) {
                if (customers.get(scan).compareTo(customers.get(min)) < 0) {
                    min = scan;
                }
            }
            Collections.swap(customers, min, index);

        }
    }

}

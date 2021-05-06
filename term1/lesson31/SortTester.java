package term1.lesson31;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortTester {

    public static void main(String[] args) {

        int testSize = 25000;
        ArrayList<String> bigList = ListGenerator.generateString(testSize, 15);
        String[] bigArray1 = bigList.toArray(new String[0]);
        String[] bigArray2 = bigList.toArray(new String[0]);
        String[] bigArray3 = bigList.toArray(new String[0]);
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(22, "Emilio", "ååå"));
        customerList.add(new Customer(19, "Erminia", "kkk"));
        customerList.add(new Customer(18, "Filippa", "ddd"));
        customerList.add(new Customer(50, "Riccardo", "ccc"));
        customerList.add(new Customer(59, "Lisa", "aaa"));

        // Bubble Sort Test
        Measurer.start();
        //SortMethods.bubbleSort(bigArray1);
        Measurer.stop();
        System.out.println(String.format("BubbleSort (%d) -- Total time in milliseconds: %d",
                testSize, Measurer.durationMilliSeconds()));
        //System.out.println(Arrays.toString(bigArray1));

        // Insertion Sort Test
        Measurer.start();
        SortMethods.insertionSort(bigArray2);
        Measurer.stop();
        System.out.println(String.format("InsertionSort (%d) -- Total time in milliseconds: %d",
                testSize, Measurer.durationMilliSeconds()));

        // Selection Sort Test 1
        Measurer.start();
        //SortMethods.selectionSort(bigArray3);
        Measurer.stop();
        System.out.println(String.format("SelectionSort (%d) -- Total time in milliseconds: %d",
                testSize, Measurer.durationMilliSeconds()));

        // Selection Sort Test 2
        //System.out.println(customerList);
        Measurer.start();
        //SortMethods.selectionSort(customerList);
        Measurer.stop();
        //System.out.println(String.format("SelectionSort (%d) -- Total time in milliseconds: %d",
        //        testSize, Measurer.durationMilliSeconds()));
        //System.out.println(customerList);
    }

}

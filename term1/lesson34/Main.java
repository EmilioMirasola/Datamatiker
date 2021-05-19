package term1.lesson34;

import term1.lesson31.Customer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(22, "Emilio", "ååå");
        Customer c2 = new Customer(19, "Erminia", "kkk");
        Customer c3 = new Customer(18, "Filippa", "ddd");
        Customer c4 = new Customer(50, "Riccardo", "ccc");
        Customer c5 = new Customer(59, "Lisa", "aaa");

        List<Customer> l2 = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5));
        List<Customer> l1 = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5));

        Collections.sort(l1);
        Collections.sort(l2);

//        List<Customer> flettetListe = fletAlleKunder(l1, l2);
//        System.out.println(flettetListe);

        int[] ints1 = {2, 4, 6, 8, 10, 12, 14};
        int[] ints2 = {1, 2, 4, 5, 6, 9, 12, 17};
//        System.out.println(Arrays.toString(fællesTal(ints1, ints2)));

        Customer[] customers = {c1, c2, c3};
        System.out.println(goodCustomers(l1, customers));
//        System.out.println(linFileSearch("C:\\Users\\emili\\development\\datamatiker\\code\\term1\\lesson33\\nyeTal.txt", 2));
        fletAlleHeltal("C:\\Users\\emili\\development\\datamatiker\\code\\term1\\lesson34\\talFil1", "C:\\Users\\emili\\development\\datamatiker\\code\\term1\\lesson34\\talFil2", "C:\\Users\\emili\\development\\datamatiker\\code\\term1\\lesson34\\endeligTalFil");
//        System.out.println(findPerson("Hansen"));
    }

    public static String findPerson(String efternavn) {
        String result = "";
        boolean found = false;
        try {
            File file = new File("C:\\Users\\emili\\development\\datamatiker\\code\\term1\\lesson34\\personer");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine() && !found) {
                String currentLine = scan.nextLine();
                if (currentLine.contains(efternavn)) {
                    result = currentLine;
                    found = true;
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void fletAlleHeltal(String fileName1, String fileName2, String fileNameNew) {
        try {
            File file1 = new File(fileName1);
            File file2 = new File(fileName2);
            Scanner scan1 = new Scanner(file1);
            Scanner scan2 = new Scanner(file2);
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            while (scan1.hasNextInt()) {
                int current = scan1.nextInt();
                if (current != Integer.MAX_VALUE) {
                    list1.add(current);
                }
            }
            scan1.close();

            while (scan2.hasNextInt()) {
                int current = scan2.nextInt();
                if (current != Integer.MAX_VALUE) {
                    list2.add(current);
                }
            }
            scan2.close();

            List<Integer> result = fletIntegers(list1, list2);
            Collections.sort(result);
            PrintWriter pw = new PrintWriter(fileNameNew);
            result.forEach((pw::println));
            pw.flush();
            pw.close();
            System.out.println(result);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean linFileSearch(String fileName, int target) {
        try {
            File file = new File(fileName);
            Scanner scan = new Scanner(file);
            while (scan.hasNextInt()) {
                if (scan.nextInt() == target) {
                    scan.close();
                    return true;
                }
            }
            scan.close();
            return false;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static List<Customer> goodCustomers(List<Customer> list, Customer[] array) {
        List<Customer> result = new ArrayList<>();
        List<Customer> arrayAsList = Arrays.asList(array);

        for (Customer customer : list) {
            if (!arrayAsList.contains(customer)) {
                result.add(customer);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static int[] fællesTal(int[] l1, int[] l2) {
        int[] result = new int[l1.length + l2.length];
        int i1 = 0;
        int i2 = 0;
        int tæller = 0;
        while (i1 < l1.length && i2 < l2.length) {
            if (l1[i1] < l2[i2]) {
                i1++;
            } else if (l1[i1] > l2[i2]) {
                i2++;
            } else {
                result[tæller] = l1[i1];
                tæller++;
                i1++;
                i2++;
            }
        }
        return Arrays.copyOf(result, tæller);
    }

    public static List<Customer> fletAlleKunder(List<Customer> l1, List<Customer> l2) {
        List<Customer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < l1.size() && i2 < l2.size()) {
            if (l1.get(i1).compareTo(l2.get(i2)) <= 0) {
                result.add(l1.get(i1));
                i1++;
            } else {
                result.add(l2.get(i2));
                i2++;
            }
        }

        while (i1 < l1.size()) {
            result.add(l1.get(i1));
            i1++;
        }

        while (i2 < l2.size()) {
            result.add(l2.get(i2));
            i2++;
        }
        return result;
    }

    public static List<Integer> fletIntegers(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < l1.size() && i2 < l2.size()) {
            if (l1.get(i1).compareTo(l2.get(i2)) <= 0) {
                result.add(l1.get(i1));
                i1++;
            } else {
                result.add(l2.get(i2));
                i2++;
            }
        }

        while (i1 < l1.size()) {
            result.add(l1.get(i1));
            i1++;
        }

        while (i2 < l2.size()) {
            result.add(l2.get(i2));
            i2++;
        }
        return result;
    }
}

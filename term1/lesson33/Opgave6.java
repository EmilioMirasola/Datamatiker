package term1.lesson33;

import java.io.IOException;

public class Opgave6 {
    public static void main(String[] args) throws IOException {
        FilUtil filUtil = new FilUtil();
        System.out.println("Max i lille fil: " + filUtil.max("C:\\Users\\emili\\development\\datamatiker\\code\\term1\\lesson33\\opg6FåTal.txt"));
        System.out.println("Min i stor fil: " + filUtil.min("C:\\Users\\emili\\development\\datamatiker\\code\\term1\\lesson33\\opg6MangeTal.txt"));
        System.out.println("Gennemsnit i lille fil: " + filUtil.gennemsnit("C:\\Users\\emili\\development\\datamatiker\\code\\term1\\lesson33\\opg6FåTal.txt"));
    }
}

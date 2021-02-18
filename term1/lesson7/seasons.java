package term1.lesson7;

import java.util.Scanner;

public class seasons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type a month and a date");

        int month = in.nextInt();
        int date = in.nextInt();

        System.out.println(determineSeason(month, date));

        in.close();
    }

    private static String determineSeason(int month, int date) {
        String season;
        if (month > 12) {
            season = "Not a valid month";
        } else if (month >= 1 && month <= 3) {
            season = "Winter";
        } else if (month >= 4 && month <= 6) {
            season = "Spring";
        } else if (month >= 7 && month <= 9) {
            season = "Summer";
        } else {
            season = "Fall";
        }

        if (month % 3 == 0 && date >= 21) {
            if (season == "Winter") {
                season = "Spring";
            } else if (season == "Spring") {
                season = "Summer";
            } else if (season == "Summer") {
                season = "Fall";
            } else {
                season = "Winter";
            }
        }
        return season;
    }
}

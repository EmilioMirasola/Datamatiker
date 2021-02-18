package term1.lesson7;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        requestPIN();
        Scanner in = new Scanner(System.in);

        if (checkIfCorerctPIN(in.nextInt())) {
            printSuccess();
        } else {
            printError();
            requestPIN();
            if (checkIfCorerctPIN(in.nextInt())) {
                printSuccess();
            } else {
                printError();
                requestPIN();
                if (checkIfCorerctPIN(in.nextInt())) {
                    printSuccess();
                } else {
                    printError();
                    printBlocked();
                }
            }
        }
        in.close();
    }

    private static void printError() {
        System.out.println("Your PIN is incorrect");
    }

    private static void printBlocked() {
        System.out.println("Card blocked");
    }

    private static boolean checkIfCorerctPIN(int pin) {
        int correctPIN = 1234;
        if (pin == correctPIN) {
            return true;
        } else {
            return false;
        }
    }

    private static void printSuccess() {
        System.out.println("Your PIN is correct");
    }

    private static void requestPIN() {
        System.out.println("Type a PIN");
    }
}

package term1.afleveringsfravaer;

public class AfproevFravaersSystem {

    public static void main(String[] args) {
        int[][] fravaer21V = { { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 }, { 1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0 },
                { 5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0 } };

        FravaersSystem fraværsSystem = new FravaersSystem();
        int studerendeIndex = 5;

        printCommunication();
        opgave1(fravaer21V, fraværsSystem);
        // opgave2(fravaer21V, fraværsSystem, studerendeIndex);
        // opgave3(fravaer21V, fraværsSystem, studerendeIndex);
        // opgave4(fravaer21V, fraværsSystem);
        // opgave5(fravaer21V, fraværsSystem);
        // opgave6(fravaer21V, fraværsSystem, studerendeIndex);
    }

    private static void opgave1(int[][] fravaer21V, FravaersSystem fraværsSystem) {
        fraværsSystem.udskrivFravaer(fravaer21V);
        System.out.println();
    }

    private static void opgave2(int[][] fravaer21V, FravaersSystem fraværsSystem, int studerendeIndex) {
        int samletFravaer = fraværsSystem.samletFravaer(fravaer21V, studerendeIndex);
        if (wasOutOfBounds(samletFravaer)) {
            printStudentMissing(studerendeIndex);
        } else {
            System.out.println("Samlet fravær for studerende " + (studerendeIndex + 1) + ": "
                    + fraværsSystem.samletFravaer(fravaer21V, studerendeIndex));
        }
    }

    private static void opgave3(int[][] fravaer21V, FravaersSystem fraværsSystem, int studerendeIndex) {
        double gennemsnit = fraværsSystem.gennemsnit(fravaer21V, studerendeIndex);
        if (wasOutOfBounds(gennemsnit)) {
            printStudentMissing(studerendeIndex);
        } else {
            System.out.println("Gennemsnitlige dage med fravær pr. måned for studerende " + (studerendeIndex + 1)
                    + " : " + gennemsnit);
        }

    }

    private static void opgave4(int[][] fravaer21V, FravaersSystem fraværsSystem) {
        System.out.println("Antal elever uden fravær: " + fraværsSystem.antalUdenFravaer(fravaer21V));
    }

    private static void opgave5(int[][] fravaer21V, FravaersSystem fraværsSystem) {
        System.out.println("Studerende med mest fravær: " + (fraværsSystem.mestFravaer(fravaer21V) + 1));
    }

    private static void opgave6(int[][] fravaer21V, FravaersSystem fraværsSystem, int studerendeIndex) {
        fraværsSystem.nulstil(fravaer21V, studerendeIndex);
        fraværsSystem.udskrivFravaer(fravaer21V);
    }

    private static void printStudentMissing(int studerendeIndex) {
        System.out.println("Studerende nr. " + studerendeIndex + " findes ikke i arrayet");
    }

    private static boolean wasOutOfBounds(double returnValue) {
        if (returnValue == -1) {
            return true;
        } else {
            return false;
        }
    }

    private static void printCommunication() {
        System.out.println("******************************************************************************");
        System.out.println("Skift variablen studereneIndex for at ændre hvilken studerende der skal bruges");
        System.out.println("studerendeIndex 0 = studerende 1, studerendeIndex 1 = studerende 2 osv.");
        System.out.println("Fjern kommentar fra den metode, du vil køre. Hver metode passer til en opgave");
        System.out.println("******************************************************************************");
    }
}

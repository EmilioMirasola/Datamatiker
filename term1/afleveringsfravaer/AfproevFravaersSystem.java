package term1.afleveringsfravaer;

public class AfproevFravaersSystem {

    public static void main(String[] args) {
        int[][] fravaer21V = { { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 }, { 1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0 },
                { 5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0 } };

        FravaersSystem fraværsSystem = new FravaersSystem();
        int studerendeIndex = 3;


        //Opgave 1
        fraværsSystem.udskrivFravaer(fravaer21V);
        System.out.println();
        
        //Opgave 2
        System.out.println("Samlet fravær for studerende " + (studerendeIndex + 1) + ": "
        + fraværsSystem.samletFravaer(fravaer21V, studerendeIndex));
        System.out.println();
        
        //Opgave 3
        System.out.println("Gennemsnitlige dage med fravær pr. måned for studerende " + (studerendeIndex + 1) + ": "
        + fraværsSystem.gennemsnit(fravaer21V, studerendeIndex));
        System.out.println();
        
        //Opgave 4
        System.out.println("Antal elever uden fravær: " + fraværsSystem.antalUdenFravaer(fravaer21V));
        System.out.println();
        
        //Opgave 5
        System.out.println("Studerende med mest fravær: " + (fraværsSystem.mestFravaer(fravaer21V) + 1));
        System.out.println();
        
        //Opgave 6
        fraværsSystem.nulstil(fravaer21V, studerendeIndex);
        fraværsSystem.udskrivFravaer(fravaer21V);

    }
}

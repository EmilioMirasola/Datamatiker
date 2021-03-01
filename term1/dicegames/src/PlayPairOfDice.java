package term1.dicegames.src;

import java.util.Scanner;

public class PlayPairOfDice {

    private PairOfDices pairOfDices;
    private Scanner scan;

    PlayPairOfDice() {
        this.pairOfDices = new PairOfDices();
        this.scan = new Scanner(System.in);
    }

    private void welcomeToGame() {
        System.out.println("Velkommen til spillet KAST terning");
    }

    private void takeTurn() {
        pairOfDices.rollBothDices();
        System.out.println("Du kastede: " + pairOfDices.sumOfDices());
    }

    public void startGame() {
        welcomeToGame();

        boolean finished = false;

        while (!finished) {
            System.out.println("Vil du kaste en terning? Angiv Ja eller Nej: ");
            String goOn = scan.nextLine();
            if (goOn.equalsIgnoreCase("Nej")) {
                finished = true;
            } else {
                takeTurn();
            }
        }
        gameOver();
    }

    private void gameOver() {
        System.out.println("Tak for spillet du kastede " + pairOfDices.getNumOfRolls() + " gange.");
        System.out.println("1'ere: " + pairOfDices.getOnes());
        System.out.println("2'ere: " + pairOfDices.getTwos());
        System.out.println("3'ere: " + pairOfDices.getThrees());
        System.out.println("4'ere: " + pairOfDices.getFours());
        System.out.println("5'ere: " + pairOfDices.getFives());
        System.out.println("6'ere: " + pairOfDices.getSixes());
        System.out.println("Antal slag med ens terninger: " + pairOfDices.getDiceMatches());
        System.out.println("Højeste slag: " + pairOfDices.getHighestRoll());
        scan.close();
    }
}

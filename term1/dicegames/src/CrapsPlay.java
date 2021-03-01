package term1.dicegames.src;

import java.util.Scanner;
import term1.dicegames.inspiration.Die;

public class CrapsPlay {
    private Die die1;
    private Die die2;
    private Scanner scan;
    private int turn;
    private boolean finished;
    private int targetRoll;
    private int currentRoll;

    public CrapsPlay() {
        this.die1 = new Die();
        this.die2 = new Die();
        this.scan = new Scanner(System.in);
        this.turn = 0;
        this.finished = false;
    }

    private void welcomeToGame() {
        System.out.println("Velkommen til spillet Craps. Vil du kaste terningerne? Ja/Nej");
        String response = scan.nextLine();
        if (response.equalsIgnoreCase("Nej")) {
            this.finished = true;
            System.out.println("Du afsluttede spillet");
        } else {
            System.out.println("Spil startet");
        }
    }

    public void startGame() {
        welcomeToGame();

        while (!finished) {
            System.out.println(turn == 0 ? "Kast terninger? --Ja" : "Kast terninger igen? --Ja");
            String goOn = scan.nextLine();
            if (goOn.equalsIgnoreCase("Ja")) {
                takeTurn();
                checkIfGameOver();
                this.turn++;
            } else {
                if (goOn.equalsIgnoreCase("Nej")) {
                    this.finished = true;
                    System.out.println("Du afsluttede spillet");
                }
            }
        }
    }

    private void gameOver(boolean won) {
        this.finished = true;
        if (won) {
            System.out.println("Du vandt!");
        } else {
            System.out.println("Du tabte :(");
        }
    }

    private void takeTurn() {
        this.die1.roll();
        this.die2.roll();
        int roll = this.die1.getFaceValue() + this.die2.getFaceValue();

        if (turn == 0) {
            this.targetRoll = roll;
        } else {
            this.currentRoll = roll;
        }

        System.out.println("Du slog: " + roll);
    }

    private void checkIfGameOver() {
        if (this.turn == 0) {
            if (this.targetRoll == 11 || this.targetRoll == 7) {
                gameOver(true);
            } else if (this.targetRoll == 2 || this.targetRoll == 3 || this.targetRoll == 12) {
                gameOver(false);
            }
        } else {
            if (this.targetRoll == this.currentRoll) {
                gameOver(true);
            } else if (this.currentRoll == 7) {
                gameOver(false);
            }
        }
    }
}

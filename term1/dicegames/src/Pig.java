package term1.dicegames.src;

import java.util.Scanner;
import term1.dicegames.inspiration.Die;

public class Pig {
    private Die die;
    private boolean isPlayer1;
    private int player1score;
    private int player2score;
    private int winningScore;
    private Scanner scan;
    private Scanner intScan;
    private boolean finished;

    public Pig() {
        this.die = new Die();
        this.isPlayer1 = true;
        this.player1score = 0;
        this.player2score = 0;
        this.winningScore = 100;
        this.scan = new Scanner(System.in);
        this.intScan = new Scanner(System.in);
        this.finished = false;
    }

    public void startGame() {
        welcomeToGame();

        while (!finished) {
            System.out.println(isPlayer1 ? "Kast terning spiller 1?" : "Kast terning spiller 2");
            String goOn = scan.nextLine();
            if (goOn.equalsIgnoreCase("Ja")) {
                takeTurn();
            } else {
                this.isPlayer1 = !isPlayer1;
                System.out.println("Tur givet videre");
            }
        }
    }

    private void takeTurn() {
        boolean continueTurn = true;
        int roundScore = 0;

        while (continueTurn) {
            die.roll();
            int roll = die.getFaceValue();
            System.out.println("Slag: " + roll);
            if (roll == 1) {
                roundScore = 0;
                continueTurn = false;
            } else {
                roundScore += roll;
                if (checkIfWon(roundScore)) {
                    continueTurn = false;
                } else {
                    System.out.println("Fortsæt tur (ja) eller stop (nej)?");
                    String goOn = scan.nextLine();
                    if (goOn.equalsIgnoreCase("Nej")) {
                        continueTurn = false;
                    }
                }
            }
        }
        endTurn(roundScore);
    }

    private boolean checkIfWon(int roundScore) {
        if (isPlayer1) {
            if (roundScore + player1score >= this.winningScore) {
                this.finished = true;
                System.out.println("Spiller 1 vandt!");
                return true;
            }
        } else {
            if (roundScore + player2score >= this.winningScore) {
                this.finished = true;
                System.out.println("Spiller 2 vandt!");
                return true;
            }
        }
        return false;
    }

    private void endTurn(int roundScore) {
        System.out.println("Score for denne runde : " + roundScore);
        if (isPlayer1) {
            player1score += roundScore;
            System.out.println("Spiller 1 score: " + player1score);
        } else {
            player2score += roundScore;
            System.out.println("Spiller 2 score: " + player2score);
        }
        this.isPlayer1 = !isPlayer1;
    }

    private void welcomeToGame() {
        System.out.println("Velkommen til spillet. Vil du starte spillet?");
        String response = scan.nextLine();
        if (response.equalsIgnoreCase("Nej")) {
            this.finished = true;
            System.out.println("Du afsluttede spillet");
        } else {
            System.out.println("Hvor mange point vil I spille til?");
            this.winningScore = intScan.nextInt();
            System.out.println("Spil startet");
        }
    }
}

package term1.lesson13;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void printPlayers() {
        this.players.forEach((player) -> {
            System.out.println(
                    "Navn: " + player.getName() + ", Alder: " + player.getAge() + ", Score: " + player.getScore());
        });
    }

    public double calcAverageAge() {
        double sum = 0;
        for (Player player : this.players) {
            sum += player.getAge();
        }
        return sum / this.players.size();
    }

    public double calcTotalScore() {
        double sum = 0;
        for (Player player : this.players) {
            sum += player.getScore();
        }
        return sum;
    }

    public double calcOldPlayersScore(int age) {
        double sum = 0;
        for (Player player : this.players) {
            if (player.getAge() > age) {
                sum += player.getScore();
            }
        }
        return sum;
    }

    public int maxScore() {
        int max = this.players.get(0).getScore();
        for (Player player : this.players) {
            if (player.getScore() > max) {
                max = player.getScore();
            }
        }
        return max;
    }

    public String bestPlayer() {
        String name = this.players.get(0).getName();
        int score = this.players.get(0).getScore();
        for (Player player : this.players) {
            if (player.getScore() > score) {
                name = player.getName();
                score = player.getScore();
            }
        }
        return name;
    }
}

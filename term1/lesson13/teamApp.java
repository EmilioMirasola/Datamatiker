package term1.lesson13;

public class teamApp {
    public static void main(String[] args) {
        Team t1 = new Team("GF guderne");
        Player p1 = new Player("Emilio", 22);
        Player p2 = new Player("Erminia", 19);
        Player p3 = new Player("Filippa", 17);
        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);

        p1.setScore(100);
        p2.setScore(110);
        p3.setScore(80);
        
        t1.printPlayers();
        System.out.println("Average age: " + t1.calcAverageAge());
        System.out.println("Total score: " + t1.calcTotalScore());
        System.out.println("Total score for old: " + t1.calcOldPlayersScore(20));
        System.out.println("Best player: " + t1.bestPlayer());
        System.out.println("Best player score: " + t1.maxScore());

    }
}

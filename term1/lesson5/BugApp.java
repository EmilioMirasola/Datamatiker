package term1.lesson5;

public class BugApp {
    public static void main(String[] args) {
        Bug bug = new Bug(10);

        //1 To the left
        bug.move();
        //Turn right
        bug.turn();

        //3 to the right
        bug.move();
        bug.move();
        bug.move();

        //12
        System.out.println(bug.getPosition());
    }
}

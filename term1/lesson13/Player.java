package term1.lesson13;

public class Player {
    private String name;
    private int age;
    private int score;

    public Player(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.setScore(0);
    }

    public void addScore(int score) {
        this.score += score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

package term1.lesson16;

public class Person {
    private String name;
    private String title;
    private Boolean senior;

    public Person(String name, String title, boolean senior) {
        this.name = name;
        this.title = title;
        this.senior = senior;
    }

    @Override

    public String toString() {
        String s = title + " " + name;
        if (senior) {
            s += " (senior)";
        }
        return s;
    }
}

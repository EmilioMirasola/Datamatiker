package term2.lesson4;

import java.util.ArrayList;

public class SkoleTest {
    public static void main(String[] args) {
        Skole skole = new Skole("EAAA");
        skole.addStuderende(new Studerende(1, "Emilio", new ArrayList<>() {{
            add(7);
            add(10);
            add(12);
            add(4);
        }}));

        skole.addStuderende(new Studerende(2, "Keba", new ArrayList<>() {{
            add(12);
            add(12);
            add(12);
            add(12);
        }}));

        System.out.println(skole.gennemsnitStuderende());

        System.out.println(skole.findStuderende(1).getNavn());
    }
}

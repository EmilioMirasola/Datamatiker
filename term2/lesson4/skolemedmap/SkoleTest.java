package term2.lesson4.skolemedmap;

import java.util.ArrayList;
import java.util.TreeSet;

public class SkoleTest {
    public static void main(String[] args) {
        Skole skole = new Skole("EAAA");
        Studerende s1 = new Studerende(1, "Emilio", new ArrayList<>() {{
            add(7);
            add(10);
            add(12);
            add(4);
        }});
        skole.addStuderende(s1);

        Studerende s2 = new Studerende(2, "Keba", new ArrayList<>() {{
            add(12);
            add(12);
            add(12);
            add(12);
        }});

        Studerende s3 = new Studerende(3, "Marcus", new ArrayList<>() {{
            add(12);
            add(12);
            add(12);
            add(12);
        }});

        Studerende s4 = new Studerende(4, "Tobias", new ArrayList<>() {{
            add(12);
            add(12);
            add(12);
            add(12);
        }});

        skole.addStuderende(s2);

        System.out.println(skole.gennemsnitStuderende());

        System.out.println(skole.findStuderende(s1.getStudieNr()).getNavn());

        TreeSet<Studerende> treeSet = new TreeSet<>(new StuderendeComparator());
        treeSet.add(s2);
        treeSet.add(s1);
        treeSet.add(s4);
        treeSet.add(s3);

        System.out.println(treeSet);

    }
}

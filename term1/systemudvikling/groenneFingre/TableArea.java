package term1.systemudvikling.groenneFingre;

import java.util.ArrayList;

public class TableArea {
    private static int id;
    private int tableAreaID;
    private ArrayList<Seeding> seedings;

    public TableArea() {
        produceID();
        this.seedings = new ArrayList<Seeding>();
    }

    public TableArea(ArrayList<Seeding> seedings) {
        this.seedings = seedings;
    }

    public ArrayList<Seeding> getSeedings() {
        return seedings;
    }

    public int getTableAreaID() {
        return tableAreaID;
    }

    public void addSeeding(Seeding seeding) {
        this.seedings.add(seeding);
    }

    private void produceID() {
        this.tableAreaID = id;
        id++;
    }

}

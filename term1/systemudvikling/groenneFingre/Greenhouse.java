package term1.systemudvikling.groenneFingre;

import java.util.ArrayList;

public class Greenhouse {
    private static int id = 1;
    private int greenhouseID;
    private ArrayList<Table> tables;

    public Greenhouse() {
        produceID();
        this.tables = new ArrayList<Table>();
    }

    public Greenhouse(ArrayList<Table> tables) {
        produceID();
        this.tables = tables;
    }

    public int getID() {
        return this.greenhouseID;
    }

    public ArrayList<Table> getTables() {
        return this.tables;
    }

    public void addTable(Table table) {
        this.tables.add(table);
    }

    private void produceID() {
        this.greenhouseID = id;
        id++;
    }
}

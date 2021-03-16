package term1.systemudvikling.groenneFingre;

import java.util.ArrayList;

public class Table {
    private static int id = 1;
    private int tableID;
    private ArrayList<TableArea> tableAreas;

    public Table() {
        produceID();
        this.tableAreas = new ArrayList<TableArea>();
    }

    public Table(ArrayList<TableArea> areas) {
        this.tableAreas = areas;
    }

    public int getID() {
        return this.tableID;
    }

    public ArrayList<TableArea> getTableAreas() {
        return this.tableAreas;
    }

    public void addTableArea(TableArea tableArea) {
        this.tableAreas.add(tableArea);
    }

    private void produceID() {
        this.tableID = id;
        id++;
    }
}

package term1.systemudvikling.groenneFingre;

import java.time.LocalDate;

import term1.systemudvikling.groenneFingre.plants.Bonsaitræ;

public class TestGroenneFingre {
    public static void main(String[] args) {
        Greenhouse greenHouse = new Greenhouse();
        Table table = new Table();
        TableArea tableArea = new TableArea();
        Bonsaitræ bonsai = new Bonsaitræ("Bonsaitræ", "Hokus pokus", "Tæt", 25.0, 12.5);
        Seeding seeding = new Seeding(100, LocalDate.now(), bonsai.getName());
        Seeding seeding2 = new Seeding(50, LocalDate.now(), bonsai.getName());

        greenHouse.addTable(table);
        table.addTableArea(tableArea);
        tableArea.addSeeding(seeding);
        tableArea.addSeeding(seeding2);

        System.out.println("Greenhouse tables: " + greenHouse.getTables());
        System.out.println("Table areas: " + table.getTableAreas());
        System.out.println("Area seedings: " + tableArea.getSeedings());
        // System.out.println(seeding.getCount());
        // System.out.println(seeding2.getCount());
    }
}

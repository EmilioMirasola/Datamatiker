package term1.systemudvikling.groenneFingre;

import java.time.LocalDate;

public class Seeding {
    private static int id;
    private int seedingID;
    private int count;
    private LocalDate seedingDate;
    private String type;

    public Seeding(int count, LocalDate seedingDate, String type) {
        genereateID();
        this.count = count;
        this.seedingDate = seedingDate;
        this.type = type;
    }

    public int getSeedingID() {
        return seedingID;
    }

    public String getType() {
        return type;
    }
    
    public int getCount() {
        return count;
    }
    
    public LocalDate getSeedingDate() {
        return seedingDate;
    }
    
    private void genereateID() {
        this.seedingID = id;
        id++;
    }


    
}

package term1.systemudvikling.groenneFingre.plants;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Plant {
    private static int id;
    private String name;
    private String latinName;
    private int plantID;
    private int greenHouseTime;

    public Plant() {
        produceID();
    }

    public Plant(String name, String latinName) {
        produceID();
        this.name = name;
        this.latinName = latinName;
    }
    
    public int getPlantID() {
        return plantID;
    }


    public String getLatinName() {
        return latinName;
    }


    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
   
    private void produceID() {
        this.plantID = id;
        id++;
    }
    
}

package term1.systemudvikling.groenneFingre.plants;

public class Bonsaitræ extends Plant {
    private String beskæring;
    private double planteHøjde;
    private double planteDybde;

    public Bonsaitræ(String name, String latinName, String beskæring, double planteHøjde, double planteDybde) {
        super(name, latinName);
        this.setBeskæring(beskæring);
        this.setPlanteHøjde(planteHøjde);
        this.setPlanteDybde(planteDybde);
    }

    public double getPlanteDybde() {
        return planteDybde;
    }

    public void setPlanteDybde(double planteDybde) {
        this.planteDybde = planteDybde;
    }

    public String getBeskæring() {
        return beskæring;
    }

    public void setBeskæring(String beskæring) {
        this.beskæring = beskæring;
    }

    public double getPlanteHøjde() {
        return planteHøjde;
    }

    public void setPlanteHøjde(double planteHøjde) {
        this.planteHøjde = planteHøjde;
    }
    
}

package term1.lesson35.model;

public class Vagt {
    private int timer;
    private Job job;
    private Frivillig frivillig;

    public Vagt(int timer, Job job, Frivillig frivillig) {
        this.timer = timer;
        this.job = job;
        this.frivillig = frivillig;
        frivillig.tilføjVagt(this);
    }

    public int getTimer() {
        return timer;
    }

    public Job getJob() {
        return job;
    }

    public Frivillig getFrivillig() {
        return frivillig;
    }


}

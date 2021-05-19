package term1.lesson35.model;

import term1.lesson35.controller.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Festival {
    private String navn;
    private LocalDate fraDato;
    private LocalDate tilDato;
    private List<Job> jobs;

    public Festival(String navn, LocalDate fraDato, LocalDate tilDato) {
        this.navn = navn;
        this.fraDato = fraDato;
        this.tilDato = tilDato;
        this.jobs = new ArrayList<>();
    }

    public LocalDate getTilDato() {
        return tilDato;
    }

    public LocalDate getFraDato() {
        return fraDato;
    }

    public String getNavn() {
        return navn;
    }

    public Job opretJob(int antalTimer, int timeHonorar, LocalDate dato, String beskrivelse, String kode) {
        Job job = new Job(kode, beskrivelse, dato, timeHonorar, antalTimer);
        this.jobs.add(job);
        return job;
    }

    public void sletJob(Job job) {
        this.jobs.remove(job);
    }

    public int budgetteretJobUdgift() {
        return jobs.stream()
                .mapToInt(job -> job.getAntalTimer() * job.getTimeHonorar())
                .sum();
    }

    public int realiseretJobUdgift() {
        return jobs.stream()
                .mapToInt(job -> job.getVagter()
                        .stream()
                        .mapToInt(Vagt::getTimer)
                        .sum() * job.getTimeHonorar())
                .sum();
    }

    public List<Job> getJobs() {
        return new ArrayList<>(jobs);
    }

    public List<String> gaverTilFrivillige() {
        return Controller.getFrivillige()
                .stream()
                .map(Frivillig::toString)
                .sorted()
                .collect(Collectors.toList());

        //.sorted() kunne også være lavet manuelt, hvor man løber igennem den liste stream api'et laver, og kalder compareTo på hvert element:

//        for (int index = 1; index < gaveliste.size(); index++) {
//            String key = gaveliste.get(index);
//            int position = index;
//            while (position > 0 && (gaveliste.get(position - 1).compareTo(key) > 0)) {
//                Collections.swap(gaveliste, gaveliste.indexOf(gaveliste.get(position)), gaveliste.indexOf(gaveliste.get(position - 1)));
//                position--;
//            }
//        }

    }

    @Override
    public String toString() {
        return this.getNavn();
    }
}

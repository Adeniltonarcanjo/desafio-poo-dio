package br.com.dio.desafio.dominio;

public class Course extends Content {

    private int workload;

    public Course(){}

    @Override
    public double calculateXp() {
        return XP_PATTERN*workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Curse{" +
                "Title='" + getTitle() + '\'' +
                ", Description='" + getDescription() + '\'' +
                ", cargaWorkload=" + workload+
                '}';
    }
}

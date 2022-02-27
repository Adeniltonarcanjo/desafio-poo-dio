package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorship extends Content {

    private LocalDate date;


    @Override
    public double calculateXp() {
        return XP_PATTERN + 20d;
    }



    public Mentorship() {

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Curse{" +
                "Title='" + getTitle() + '\'' +
                ", Description='" + getDescription() + '\'' +
                ", date=" + date+
                '}';
    }
}


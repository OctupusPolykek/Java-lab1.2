package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class FootballClub {
    private final ArrayList<Footballer> footballers = new ArrayList<>();

    public void add(Footballer footballer) {
        footballers.add(footballer);
    }

    public void logPlayerData() {
        System.out.println("All footballers over 20 years of age who score over 0.4 per game: ");
        System.out.println("========");

        LocalDate dateNow = LocalDate.now();
        int i = 0;
        for (Footballer footballer: this.footballers) {
            if (getFullYears(footballer.getDateBirth(), dateNow) > 20 && getGoalsPerGames(footballer) >= 0.4) {
                System.out.println("Footballer №" + (i + 1) + ":");
                footballer.printInfo();
                System.out.println("========");
            }
            i++;
        }
    }

    private static int getFullYears(LocalDate startDate, LocalDate finishDate) {
        int years = finishDate.getYear() - startDate.getYear();
        if (startDate.getMonth().getValue() > finishDate.getMonth().getValue())
            years--;
        else if (startDate.getDayOfMonth() > finishDate.getDayOfMonth())
            years--;

        return years;
    }

    private static double getGoalsPerGames(Footballer footballer) {
        return (double)footballer.getGoalsScored() / footballer.getGames();
    }
}

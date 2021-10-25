package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static LocalDate StringToDateParser(String str) {
        String[] strDate = str.split("\\.");
        if (strDate.length == 3) {
            int days  = Integer.parseInt(strDate[0]);
            int mouth = Integer.parseInt(strDate[1]);
            int years = Integer.parseInt(strDate[2]);

            return LocalDate.of(years, mouth, days);
        }
        else
            throw new Error("Incorrect date format.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FootballClub club = new FootballClub();

        System.out.println("Enter a number of footballers: ");
        int length = scanner.nextInt();
        System.out.println("========");
        for (int i = 0; i < length; i++) {
            System.out.println("Footballer №" + (i + 1) + ":");
            System.out.print("Surname: ");
            String surname = scanner.next();
            System.out.print("Date of birth in pattern: dd.mm.yyyy: ");
            LocalDate dateBirth = StringToDateParser(scanner.next());
            System.out.print("Game role in pattern: d-defender, a-attacker, g-goalkeeper, m-midfielder: ");
            char role = scanner.next().charAt(0);
            System.out.print("Number of games: ");
            int games = scanner.nextInt();
            System.out.print("Number of goals scored: ");
            int goals = scanner.nextInt();
            System.out.print("Place of birth: ");
            String placeOfBirth = scanner.next();
            System.out.println("========");

            club.add(new Footballer(surname, dateBirth, role, games, goals, placeOfBirth));
        }

        club.logPlayerData();
    }
}

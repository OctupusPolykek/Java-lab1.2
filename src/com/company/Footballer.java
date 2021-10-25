package com.company;

import java.time.LocalDate;

public class Footballer {
    private final String surname;
    private final LocalDate dateBirth;
    private final Role role;
    private final int games;
    private final int goalsScored;
    private final String placeOfBirth;

    public Footballer(String surname, LocalDate dateBirth, char role, int games, int goalsScored, String placeOfBirth) {
        if (surname != null && !surname.isEmpty())
            this.surname = surname;
        else
            throw new Error("Surname cannot be empty.");

        this.dateBirth = dateBirth;

        switch (role) {
            case 'd' -> this.role = Role.DEFENDER;
            case 'a' -> this.role = Role.ATTACKER;
            case 'g' -> this.role = Role.GOALKEEPER;
            case 'm' -> this.role = Role.MIDFIELDER;
            default  -> throw new Error("Role must be one of four values: d, a, g, m");
        }

        if (games > 0)
            this.games = games;
        else
            throw new Error("Games cannot be < 0.");

        if (goalsScored >= 0)
            this.goalsScored = goalsScored;
        else
            throw new Error("Goals cannot be < 0.");

        if (placeOfBirth != null && !placeOfBirth.isEmpty())
            this.placeOfBirth = placeOfBirth;
        else
            throw new Error("Place of birth cannot be empty");
    }

    //Getters
    public String getSurname() {
        return this.surname;
    }
    public LocalDate getDateBirth() {
        return this.dateBirth;
    }
    public String getRole() {
        return this.role.getRole();
    }
    public int getGames() {
        return this.games;
    }
    public int getGoalsScored() {
        return this.goalsScored;
    }
    public String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    @Override
    public String toString() {
        return "{" + "\n" +
                " surname = " + surname + ",\n" +
                " dateBirth = " + dateBirth + ",\n" +
                " role = " + role + ",\n" +
                " games = " + games + ",\n" +
                " goalsScored = " + goalsScored + ",\n" +
                " placeOfBirth = " + placeOfBirth + "\n" +
                '}';
    }
}

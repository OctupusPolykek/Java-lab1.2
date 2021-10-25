package com.company;

public enum Role {
    DEFENDER("Defender"),
    ATTACKER("Attacker"),
    GOALKEEPER("Goalkeeper"),
    MIDFIELDER("Midfielder");

    private final String role;
    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

package com.smarthostel.model;

public class Technician extends User {
    private String skill;
    private boolean available = true;

    public Technician() {
    }

    public Technician(Long id, String name, String email, String skill) {
        super(id, name, email);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

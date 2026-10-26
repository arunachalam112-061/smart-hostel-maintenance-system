package com.smarthostel.model;

public class Student extends User {
    private String registerNumber;
    private String roomNumber;

    public Student() {
    }

    public Student(Long id, String name, String email,
                   String registerNumber, String roomNumber) {
        super(id, name, email);
        this.registerNumber = registerNumber;
        this.roomNumber = roomNumber;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}

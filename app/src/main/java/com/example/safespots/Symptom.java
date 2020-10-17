package com.example.safespots;

public class Symptom {
    private String name;
    private int month;
    private int day;
    private int year;

    public Symptom (String name, int month, int day, int year){
        this.name = name;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return (getName() + " - " + getMonth() + "/" + getDay() + "/" + getYear());
    }
}

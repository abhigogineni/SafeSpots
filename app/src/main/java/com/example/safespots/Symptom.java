package com.example.safespots;

public class Symptom {
    private String name;
    private int month;
    private int day;
    private int year;
    private int timeOccurring;

    public Symptom (String name, int month, int day, int year, int timeOccurring){
        this.name = name;
        this.month = month;
        this.day = day;
        this.year = year;
        this.timeOccurring = timeOccurring; //in minutes
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTimeOccurring() {
        return timeOccurring;
    }

    public void setTimeOccurring(int timeOccurring) {
        this.timeOccurring = timeOccurring;
    }

    public String toString(){
        return (getName() + " - " + getMonth() + "/" + getDay() + "/" + getYear() + " for " + getTimeOccurring() + " minutes.");
    }
}

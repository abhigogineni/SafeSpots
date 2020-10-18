package com.example.safespots;
import java.util.ArrayList;

import java.util.ArrayList;

public class Discord {
    private String id;
    private String password;
    private int month;
    private int day;
    private int year;
    ArrayList<User> users = new ArrayList<User>();

    public Discord(String id, int month, int day, int year) {
        this.id = id;
        this.password = "None provided";
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Discord(String id, String password, int month, int day, int year) {
        this.id = id;
        this.password = password;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getDate() {
        return "" + getMonth() + "/" + getDay() + "/" + getYear();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public String printUsers() {
        String userString = "1. " + users.get(0).toString() + "\n";
        for (int i = 1; i < users.size(); i++) {
            userString += i + ". " + users.get(i).toString() + "\n";
        }
        return userString;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void addUser (User user){
        this.users.add(user);
    }

    public String toString() {
        return ("Zoom ID: " + id + "\n" +
                "Password: " + password + "\n" +
                "Date: " + getDate() + "\n" +
                "Users: " + printUsers());
    }
}

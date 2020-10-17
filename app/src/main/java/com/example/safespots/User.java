package com.example.safespots;


import java.lang.StringBuilder;
import java.util.ArrayList;

public class User {
    private String name;
    private int year; //1 for freshman 4 for senior, etc
    int[] requests = new int[4]; // 0 - medical help, 1 - food/water, 2 - Zoom/Company, 3 - Custom
    private boolean isSick;
    ArrayList<Symptom> symptoms;
    private int numZooms = 0;


    public User(String name, int year, int medHelp, int foodWater, int zoom, int custom, boolean isSick) {
        this.name = name;
        this.year = year;
        this.requests[0] = medHelp;
        this.requests[1] = foodWater;
        this.requests[2] = zoom;
        this.requests[3] = custom;
        this.isSick = isSick;
    }

    public User(String name, int year, int medHelp, int foodWater, int zoom, int custom, boolean isSick, ArrayList<Symptom> symptoms) {
        this.name = name;
        this.year = year;
        this.requests[0] = medHelp;
        this.requests[1] = foodWater;
        this.requests[2] = zoom;
        this.requests[3] = custom;
        this.isSick = isSick;
        this.symptoms = symptoms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRequests(int[] requests) {
        this.requests = requests;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int[] getRequests() {
        return requests;
    }

    public boolean isSick() {
        return isSick;
    }

    public void addSymptom(Symptom symptom) {
        symptoms.add(symptom);
    }
    public void inZoom(){
        numZooms++;
    }

    public java.lang.String getRequestsString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append(requests[0]);
        for (int i = 1; i < requests.length; i++) {
            returnString.append(", " + requests[i]);
        }
        return returnString.toString();
    }

    public java.lang.String getSymptomsString() {
        java.lang.StringBuilder returnString = new StringBuilder();
        returnString.append(symptoms.get(0).toString());
        for (int i = 1; i < symptoms.size(); i++) {
            returnString.append(", " + symptoms.get(i).toString());
        }
        return returnString.toString();
    }

    public java.lang.String toString(){
        return("Users: " + name +
                "Year: " + year +
                "Previous Requests: " + getRequestsString() +
                "Symptoms: " + getSymptomsString());
    }

}

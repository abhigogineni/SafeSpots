package com.example.safespots;
import java.util.Arrays;

public class User {
    private String name;
    private int year; //1 for freshman 4 for senior, etc
    int[] requests = new int[4]; // 0 - medical help, 1 - food/water, 2 - Zoom/Company, 3 - Custom
    private boolean isSick;

    public User (String name, int year, int medHelp, int foodWater, int zoom, int custom, boolean isSick){
        this.name = name;
        this.year = year;
        this.requests[0] = medHelp;
        this.requests[1] = foodWater;
        this.requests[2] = zoom;
        this.requests[3] = custom;
        this.isSick = isSick;
    }


}

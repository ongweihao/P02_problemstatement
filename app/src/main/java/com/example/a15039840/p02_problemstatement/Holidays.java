package com.example.a15039840.p02_problemstatement;

/**
 * Created by 15039840 on 27/4/2017.
 */

public class Holidays {
    private String name;
    private String date;
    private boolean type;
    private int symbol;

    public Holidays(String name, String date, boolean type, int symbol) {
        this.name = name;
        this.date = date;
        this.type = type;
        this.symbol = symbol;
    }
    public String getName() {

        return name;
    }
    public String getDate() {

        return date;
    }
    public int getSym() {

        return symbol;
    }
    public boolean isSecular() {

        return type;
    }
}
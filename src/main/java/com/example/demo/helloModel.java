package com.example.demo;

import java.util.Date;

public class helloModel {

    private long systemID;


    private String text;

    public helloModel(long systemID, String text) {
        this.systemID = systemID;
        this.text = text;
    }

    @Override
    public String toString() {
        return "helloModel{" +
                "systemID=" + systemID +
                ", text='" + text + '\'' +
                '}';
    }
}

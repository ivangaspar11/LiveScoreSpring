package com.example.RealTimeApp.Resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
    @JsonProperty("long")
    private String mylong;

    @JsonProperty("short")
    private String myshort;
    private int elapsed;

    public String getMylong() {
        return mylong;
    }

    public void setMylong(String mylong) {
        this.mylong = mylong;
    }

    public String getMyshort() {
        return myshort;
    }

    public void setMyshort(String myshort) {
        this.myshort = myshort;
    }

    public int getElapsed() {
        return elapsed;
    }

    public void setElapsed(int elapsed) {
        this.elapsed = elapsed;
    }

    @Override
    public String toString() {
        return "Status{" +
                "mylong='" + mylong + '\'' +
                ", myshort='" + myshort + '\'' +
                ", elapsed=" + elapsed +
                '}';
    }
}

package com.example.RealTimeApp.Resources;

public class Parameters {
    private String season;
    private String live;

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    @Override
    public String toString() {
        return "Parameters{" +
                "season='" + season + '\'' +
                ", live='" + live + '\'' +
                '}';
    }
}

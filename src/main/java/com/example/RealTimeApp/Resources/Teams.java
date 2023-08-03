package com.example.RealTimeApp.Resources;

public class Teams {
  private Home home;
  private Away away;

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public Away getAway() {
        return away;
    }

    public void setAway(Away away) {
        this.away = away;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "home=" + home +
                ", away=" + away +
                '}';
    }
}

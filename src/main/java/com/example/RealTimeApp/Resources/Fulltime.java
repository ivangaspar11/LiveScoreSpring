package com.example.RealTimeApp.Resources;

public class Fulltime {
    private Object home;
    private Object away;

    public Object getHome() {
        return home;
    }

    public void setHome(Object home) {
        this.home = home;
    }

    public Object getAway() {
        return away;
    }

    public void setAway(Object away) {
        this.away = away;
    }

    @Override
    public String toString() {
        return "Fulltime{" +
                "home=" + home +
                ", away=" + away +
                '}';
    }
}

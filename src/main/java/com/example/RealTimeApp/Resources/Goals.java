package com.example.RealTimeApp.Resources;

public class Goals {
    private int home;
    private int away;

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getAway() {
        return away;
    }


    public void setAway(int away) {
        this.away = away;
    }

    @Override
    public String toString() {
        return "Goals{" +
                "home=" + home +
                ", away=" + away +
                '}';
    }
}

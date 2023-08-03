package com.example.RealTimeApp.Resources;

public class Time {
    private int elapsed;
    private Object extra;

    public int getElapsed() {
        return elapsed;
    }

    public void setElapsed(int elapsed) {
        this.elapsed = elapsed;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Time{" +
                "elapsed=" + elapsed +
                ", extra=" + extra +
                '}';
    }
}

package com.example.RealTimeApp.Resources;

import java.util.Date;

public class Fixture {
    private int id;
    private Object referee;
    private String timezone;
    private Date date;
    private long timestamp;
    private Periods periods;
    private Venue venue;
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getReferee() {
        return referee;
    }

    public void setReferee(Object referee) {
        this.referee = referee;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }


    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Periods getPeriods() {
        return periods;
    }

    public void setPeriods(Periods periods) {
        this.periods = periods;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Fixture{" +
                "id=" + id +
                ", referee=" + referee +
                ", timezone='" + timezone + '\'' +
                ", date=" + date +
                ", timestamp=" + timestamp +
                ", periods=" + periods +
                ", venue=" + venue +
                ", status=" + status +
                '}';
    }
}

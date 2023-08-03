package com.example.RealTimeApp.Resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Periods {
    @JsonProperty("first")
    private long first;
    private Long second;

    public long getFirst() {
        return first;
    }

    public void setFirst(long first) {
        this.first = first;
    }

    public Long getSecond() {
        return second;
    }

    public void setSecond(Long second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Periods{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

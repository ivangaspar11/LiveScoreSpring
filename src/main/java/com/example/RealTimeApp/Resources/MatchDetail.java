package com.example.RealTimeApp.Resources;

import java.util.ArrayList;

public class MatchDetail {
    private int MatchId;
    private ArrayList<EventForMatch> eventForMatches;
    public MatchDetail(int matchId) {
        this.MatchId = matchId;
        this.eventForMatches = new ArrayList<>();
    }

    public void addEventForMatch(EventForMatch eventForMatch) {
        this.eventForMatches.add(eventForMatch);
    }

    public int getMatchId() {
        return MatchId;
    }

    public void setMatchId(int matchId) {
        MatchId = matchId;
    }


    public ArrayList<EventForMatch> getEventForMatches() {
        return eventForMatches;
    }

    public void setEventForMatches(ArrayList<EventForMatch> eventForMatches) {
        this.eventForMatches = eventForMatches;
    }

    @Override
    public String toString() {
        return "MatchDetail{" +
                "MatchId=" + MatchId +
                ", eventForMatches=" + eventForMatches +
                '}';
    }
}

package com.example.RealTimeApp.Resources;

public class EventForMatch {
    private int timeElapsed;
    private String teamName;
    private  String playerName;
    private String type;
    private String Detail;

    public int getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(int timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    @Override
    public String toString() {
        return "EventForMatch{" +
                "timeElapsed=" + timeElapsed +
                ", teamName='" + teamName + '\'' +
                ", playerName='" + playerName + '\'' +
                ", type='" + type + '\'' +
                ", Detail='" + Detail + '\'' +
                '}';
    }
}

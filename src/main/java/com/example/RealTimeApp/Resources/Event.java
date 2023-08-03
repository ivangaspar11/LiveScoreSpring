package com.example.RealTimeApp.Resources;

public class Event {
    private Time time;
    private Team team;
    private Player player;
    private Assist assist;
    private String type;
    private String detail;
    private Object comments;

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Assist getAssist() {
        return assist;
    }

    public void setAssist(Assist assist) {
        this.assist = assist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Object getComments() {
        return comments;
    }

    public void setComments(Object comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Event{" +
                "time=" + time +
                ", team=" + team +
                ", player=" + player +
                ", assist=" + assist +
                ", type='" + type + '\'' +
                ", detail='" + detail + '\'' +
                ", comments=" + comments +
                '}';
    }
}

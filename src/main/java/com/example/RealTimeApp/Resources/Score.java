package com.example.RealTimeApp.Resources;

public class Score {
    private Halftime halftime;
    private Fulltime fulltime;
    private Extratime extratime;
    private Penalty penalty;

    public Halftime getHalftime() {
        return halftime;
    }

    public void setHalftime(Halftime halftime) {
        this.halftime = halftime;
    }

    public Fulltime getFulltime() {
        return fulltime;
    }

    public void setFulltime(Fulltime fulltime) {
        this.fulltime = fulltime;
    }

    public Extratime getExtratime() {
        return extratime;
    }

    public void setExtratime(Extratime extratime) {
        this.extratime = extratime;
    }

    public Penalty getPenalty() {
        return penalty;
    }

    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }

    @Override
    public String toString() {
        return "Score{" +
                "halftime=" + halftime +
                ", fulltime=" + fulltime +
                ", extratime=" + extratime +
                ", penalty=" + penalty +
                '}';
    }
}

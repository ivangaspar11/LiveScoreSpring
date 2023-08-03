package com.example.RealTimeApp.Resources;

import java.util.ArrayList;

public class Rootclass {
    private String get;
    private Parameters parameters;
    private ArrayList<Object> errors;
    private int results;
    private ArrayList<Response> response;
    private Paging paging;

    public ArrayList<Object> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<Object> errors) {
        this.errors = errors;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public ArrayList<Response> getResponse() {
        return response;
    }

    public void setResponse(ArrayList<Response> response) {
        this.response = response;
    }

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    @Override
    public String toString() {
        return "Rootclass{" +
                "get='" + get + '\'' +
                ", parameters=" + parameters +
                ", errors=" + errors +
                ", results=" + results +
                ", response=" + response +
                ", paging=" + paging +
                '}';
    }
}


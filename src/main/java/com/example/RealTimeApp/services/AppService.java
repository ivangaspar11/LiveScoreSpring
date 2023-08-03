package com.example.RealTimeApp.services;

import com.example.RealTimeApp.Resources.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppService {
    private final ObjectMapper objectMapper;


    public AppService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<MatchInfo> getLiveScores() throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v3.football.api-sports.io/fixtures?live=all"))
                .header("X-RapidAPI-Key", "a592a40ee386bf0c21aa7a97a609e672")
                .header("X-RapidAPI-Host", "v3.football.api-sports.io")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        String jsonResponse = response.body();
        List<MatchInfo> matchInfoList = new ArrayList<>();
        List<MatchDetail> matchDetailList = new ArrayList<>();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Rootclass rootclass = objectMapper.readValue(jsonResponse, Rootclass.class);

            ArrayList<Response> responses = rootclass.getResponse();


            for (Response response1 : responses) {
                Fixture fixture = response1.getFixture();
                Teams teams = response1.getTeams();
                Score score = response1.getScore();
                Goals goals = response1.getGoals();
                Fixture timeElapsed = response1.getFixture();
                ArrayList<Event> events = response1.getEvents();
                int id = response1.getFixture().getId();


                MatchInfo matchInfo = new MatchInfo();
                matchInfo.setHomeTeamName(teams.getHome().getName());
                matchInfo.setAwayTeamName(teams.getAway().getName());
                matchInfo.setResult(goals.getHome() + " : " + goals.getAway());
                matchInfo.setElapsedTime(timeElapsed.getStatus().getElapsed());
                matchInfo.setHomeTeamLogo(teams.getHome().getLogo());
                matchInfo.setAwayTeamLogo(teams.getAway().getLogo());
                matchInfo.setMatchId(fixture.getId());
                matchInfoList.add(matchInfo);

                MatchDetail matchDetail = new MatchDetail(id);
                for (Event event : response1.getEvents()) {
                    EventForMatch eventForMatch = new EventForMatch();
                    eventForMatch.setTimeElapsed(event.getTime().getElapsed());
                    eventForMatch.setTeamName(event.getTeam().getName());
                    eventForMatch.setPlayerName(event.getPlayer().getName());
                    eventForMatch.setType(event.getType());
                    eventForMatch.setDetail(event.getDetail());

                    // Add the EventForMatch object to the MatchDetail object
                    matchDetail.addEventForMatch(eventForMatch);
                }
                matchDetailList.add(matchDetail);


            }
            System.out.println(matchDetailList);

        } catch (Exception e) {
            e.printStackTrace();
        }


        return matchInfoList;

    }
        public List<MatchDetail> getDetailsForMatch () throws IOException, InterruptedException {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v3.football.api-sports.io/fixtures?live=all"))
                    .header("X-RapidAPI-Key", "a592a40ee386bf0c21aa7a97a609e672")
                    .header("X-RapidAPI-Host", "v3.football.api-sports.io")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            String jsonResponse = response.body();

            List<MatchDetail> matchDetailList = new ArrayList<>();
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                Rootclass rootclass = objectMapper.readValue(jsonResponse, Rootclass.class);

                ArrayList<Response> responses = rootclass.getResponse();


                for (Response response1 : responses) {
                    Fixture fixture = response1.getFixture();
                    Teams teams = response1.getTeams();
                    Score score = response1.getScore();
                    Goals goals = response1.getGoals();
                    Fixture timeElapsed = response1.getFixture();
                    ArrayList<Event> events = response1.getEvents();
                    int id = response1.getFixture().getId();

                    MatchDetail matchDetail = new MatchDetail(id);
                    for (Event event : response1.getEvents()) {
                        EventForMatch eventForMatch = new EventForMatch();
                        eventForMatch.setTimeElapsed(event.getTime().getElapsed());
                        eventForMatch.setTeamName(event.getTeam().getName());
                        eventForMatch.setPlayerName(event.getPlayer().getName());
                        eventForMatch.setType(event.getType());
                        eventForMatch.setDetail(event.getDetail());

                        // Add the EventForMatch object to the MatchDetail object
                        matchDetail.addEventForMatch(eventForMatch);
                    }
                    matchDetailList.add(matchDetail);


                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return matchDetailList;
    }


    }
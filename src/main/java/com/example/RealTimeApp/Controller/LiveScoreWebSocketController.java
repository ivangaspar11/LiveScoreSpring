package com.example.RealTimeApp.Controller;
import com.example.RealTimeApp.Resources.MatchDetail;
import com.example.RealTimeApp.Resources.MatchInfo;
import com.example.RealTimeApp.services.AppService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.List;

@Controller
public class LiveScoreWebSocketController {


        private final AppService appService;
        private final SimpMessagingTemplate simpMessagingTemplate;

        @Autowired
        public LiveScoreWebSocketController(AppService appService, SimpMessagingTemplate simpMessagingTemplate) {
            this.appService = appService;
            this.simpMessagingTemplate = simpMessagingTemplate;
        }

        @MessageMapping("/live-score")
        @SendTo("/topic/details")
        public void getLiveScoresAsJsonString(int matchID) {
            try {
                List<MatchDetail> matchDetailList = appService.getDetailsForMatch(); // Assuming getLiveScores() fetches data from the external API
                ObjectMapper objectMapper = new ObjectMapper();

                MatchDetail matchDetail = matchDetailList.stream()
                        .filter(detail -> detail.getMatchId() == matchID)
                        .findFirst()
                        .orElse(null);
                String MatchDetail= objectMapper.writeValueAsString(matchDetail);
                simpMessagingTemplate.convertAndSend("/topic/details",MatchDetail);
                System.out.println(MatchDetail);


            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        @SendTo("topic/live-scores")
        @Scheduled(fixedRate = 30000)
        public void sendLiveScoresToClients() throws IOException, InterruptedException {
            try{
                List<MatchInfo>liveScore=appService.getLiveScores();
                ObjectMapper objectMapper=new ObjectMapper();
                String liveScores=objectMapper.writeValueAsString(liveScore);
                simpMessagingTemplate.convertAndSend("/topic/live-scores",liveScores);

            }
            catch(Exception e)
        {
            e.printStackTrace();

        }


    }
    }


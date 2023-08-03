package com.example.RealTimeApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
@EnableScheduling
@SpringBootApplication
public class RealTimeAppApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(RealTimeAppApplication.class, args);

	}


}

package com.example.microservice2.service;

// KafkaConsumerService.java

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private static final String TOPIC_NAME = "mytopic";

    @KafkaListener(topics = TOPIC_NAME, groupId = "group_id")
    public void consume(String message) {
        System.out.println("Received message: " + message);
        // Add your business logic here
    }
}

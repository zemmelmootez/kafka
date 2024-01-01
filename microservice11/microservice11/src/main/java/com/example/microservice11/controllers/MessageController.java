package com.example.microservice11.controllers;

// MessageController.java

import com.example.microservice11.services.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/send-message")
    public void sendMessage(@RequestBody String message) {
        kafkaProducerService.sendMessage(message);
    }
}

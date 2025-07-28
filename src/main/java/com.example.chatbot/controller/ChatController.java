package com.example.chatbot.controller;

import com.example.chatbot.model.ChatRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class ChatController {
     public String home() {
        return "Hello from Spring Boot on EC2!";
    }
    @PostMapping
    public String chat(@RequestBody ChatRequest request) {
        String userMessage = request.getMessage().toLowerCase();

        if (userMessage.contains("hi")) {
            return "Hello! How can I help you?";
        } else if (userMessage.contains("bye")) {
            return "Goodbye!";
        } else {
            return "I'm just a simple bot. Try saying hi!";
        }
    }
}

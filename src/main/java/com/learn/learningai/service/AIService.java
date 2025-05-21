package com.learn.learningai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AIService {

    private final ChatClient chatClient;

    public String getResponse(String prompt) {
        return chatClient.prompt(prompt).call().content();
    }
} 
package com.fiap.N.I.B.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class AIController {

    private final ChatClient chatClient;

    public AIController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    // POST com JSON no corpo da requisição
    @PostMapping("/deepseek-r1-query")
    public String chatWithDeepseek(@RequestBody QueryRequest request) {
        String encodedQuery = request.getQuery().replace(" ", "%20");
        return chatClient.prompt(encodedQuery).call().content().toString();
    }

    // Classe DTO para capturar o corpo
    public static class QueryRequest {
        private String query;

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }
    }
}

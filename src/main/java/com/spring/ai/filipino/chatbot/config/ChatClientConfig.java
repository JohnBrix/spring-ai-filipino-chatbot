package com.spring.ai.filipino.chatbot.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/**
 * package com.spring.ai.filipino.chatbot.config; /**
 *
 * @author <John Brix Pomoy>
 * @version $Id: ChatClientConfig.java, v 0.1 2026-03-19 9:24 AM John Brix Pomoy Exp $$
 */
@Configuration
public class ChatClientConfig {

    @Bean
    @Primary
    public ChatClient chatClient(ChatModel chatModel) {
        return ChatClient.builder(chatModel)
                .build();
    }


}

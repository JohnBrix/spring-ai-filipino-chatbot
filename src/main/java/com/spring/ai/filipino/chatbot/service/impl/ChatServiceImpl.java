package com.spring.ai.filipino.chatbot.service.impl;

import com.spring.ai.filipino.chatbot.client.ChatAIClient;
import com.spring.ai.filipino.chatbot.model.ChatRequest;
import com.spring.ai.filipino.chatbot.model.ChatResponse;
import com.spring.ai.filipino.chatbot.service.ChatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.spring.ai.filipino.chatbot.constant.PromptConstant.SUCCESS;

/**
 * package com.spring.ai.filipino.chatbot.service; /**
 *
 * @author <John Brix Pomoy>
 * @version $Id: ChatServiceImpl.java, v 0.1 2026-03-19 8:30 AM John Brix Pomoy Exp $$
 */
@Slf4j
@Service
public class ChatServiceImpl implements ChatService {


    @Autowired
    private ChatAIClient chatAIClient;

    @Override
    public ChatResponse getChatModel(ChatRequest chatRequest) {
        log.debug("getChatModel - ChatRequest: {}", chatRequest);


        return ChatResponse.builder()
                .outputText(chatAIClient.getAiRag(chatRequest.getQuestion()))
                .result(true)
                .resultMessage(SUCCESS)
                .build();
    }


}

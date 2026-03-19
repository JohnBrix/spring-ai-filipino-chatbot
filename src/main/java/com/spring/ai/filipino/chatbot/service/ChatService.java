package com.spring.ai.filipino.chatbot.service;

import com.spring.ai.filipino.chatbot.model.ChatRequest;
import com.spring.ai.filipino.chatbot.model.ChatResponse;

/**
 * package com.spring.ai.filipino.chatbot.service; /**
 *
 * @author <John Brix Pomoy>
 * @version $Id: ChatService.java, v 0.1 2026-03-19 8:30 AM John Brix Pomoy Exp $$
 */
public interface ChatService {
    ChatResponse getChatModel(ChatRequest chatRequest);
}

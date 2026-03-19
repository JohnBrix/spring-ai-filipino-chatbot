package com.spring.ai.filipino.chatbot.controller;

import com.spring.ai.filipino.chatbot.model.ChatRequest;
import com.spring.ai.filipino.chatbot.model.ChatResponse;
import com.spring.ai.filipino.chatbot.service.ChatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * package com.spring.ai.filipino.chatbot.controller; /**
 *
 * @author <John Brix Pomoy>
 * @version $Id: ChatController.java, v 0.1 2026-03-19 8:33 AM John Brix Pomoy Exp $$
 */
@Slf4j
@RestController()
@RequestMapping("/api/v1/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/filipino")
    public ResponseEntity<ChatResponse> getChatModel(@RequestBody ChatRequest request) {
        return new ResponseEntity<>(chatService.getChatModel(request), HttpStatus.OK);
    }

}

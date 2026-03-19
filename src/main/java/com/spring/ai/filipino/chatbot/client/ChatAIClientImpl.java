package com.spring.ai.filipino.chatbot.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.SystemMessage;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.spring.ai.filipino.chatbot.constant.PromptConstant.CONTEXT;
import static com.spring.ai.filipino.chatbot.constant.PromptConstant.PROMPT_MESSAGE;

/**
 * package com.spring.ai.filipino.chatbot.client /**
 *
 * @author <John Brix Pomoy>
 * @version $Id: ChatAIClientImpl.java, v 0.1 2026-03-19 9:24 AM John Brix Pomoy Exp $$
 */
@Slf4j
@Component
public class ChatAIClientImpl implements ChatAIClient {

    @Autowired
    private ChatClient chatClient;

    @Override
    public String getAiRag(String question) {

        return chatClient
                .prompt(buildPromptMessage(question, PROMPT_MESSAGE))
                .advisors() //Use case: Guardrails
                .call()
                .content();
    }

    private static Prompt buildPromptMessage(String question, String promptMessage) {
        return new Prompt(List.of(
                buildSystemmessage(promptMessage),
                buildUserMessage(question)
        ));
    }

    private static SystemMessage buildSystemmessage(String promptMessage) {
        return new SystemMessage(
                promptMessage
        );
    }

    private static UserMessage buildUserMessage(String question) {
        return new UserMessage(
                CONTEXT + question
        );
    }

}

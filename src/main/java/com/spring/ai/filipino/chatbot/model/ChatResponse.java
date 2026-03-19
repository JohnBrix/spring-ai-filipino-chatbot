package com.spring.ai.filipino.chatbot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * package com.spring.ai.filipino.chatbot.model /**
 *
 * @author <John Brix Pomoy>
 * @version $Id: ChatResponse.java, v 0.1 2026-03-19 9:24 AM John Brix Pomoy Exp $$
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatResponse {
    private String outputText;
    private String resultMessage;
    private Boolean result;
}

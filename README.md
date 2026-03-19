# spring-ai-filipino-chatbot

A Filipino-only AI chatbot built using **Spring Boot** and **Spring AI**.  
This project enforces strict Filipino-language responses, blocks NSFW or inappropriate messages, and rejects any non-Filipino input while providing a clean REST API for AI-driven conversations.

---

## Features

- **Filipino-only responses**  
  The chatbot always answers in Filipino (Tagalog).

- **Rejects non-Filipino input**  
  If the user uses any language other than Filipino, the chatbot responds with:  
  **"Pasensya na, Filipino lang ang kaya kong salitain."**

- **NSFW-safe**  
  If NSFW or inappropriate content is detected, the chatbot responds with:  
  **"Hindi pinapayagan ang NSFW dito."**

- **Spring AI powered**  
  Uses Spring AI's ChatClient for AI processing.

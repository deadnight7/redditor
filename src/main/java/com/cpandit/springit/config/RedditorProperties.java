package com.cpandit.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("redditor")
public class RedditorProperties {

    /**
     * This is our welcome message
     */
    private String welcomeMessage = "Hello World";

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
}

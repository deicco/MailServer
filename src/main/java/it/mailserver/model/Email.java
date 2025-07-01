package it.mailserver.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class Email implements Serializable {
    private static int nextId = 1;

    private final int id;
    private final String sender;
    private final List<String> recipients;
    private final String subject;
    private final String body;
    private final LocalDateTime timestamp;

    public Email(String sender, List<String> recipients, String subject, String body, LocalDateTime timestamp) {
        this.id = nextId++;
        this.sender = sender;
        this.recipients = recipients;
        this.subject = subject;
        this.body = body;
        this.timestamp = LocalDateTime.now();
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getSender() {
        return sender;
    }
    public List<String> getRecipients() {
        return recipients;
    }
    public String getSubject() {
        return subject;
    }
    public String getBody() {
        return body;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
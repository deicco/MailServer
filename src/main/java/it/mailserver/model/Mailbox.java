package it.mailserver.model;

import java.util.ArrayList;
import java.util.List;

public class Mailbox {
    private final String emailAddress;
    private final List<Email> inbox;

    public Mailbox(String emailAddress) {
        this.emailAddress = emailAddress;
        this.inbox = new ArrayList<>();
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public List<Email> getInbox() {
        return inbox;
    }
    public void addEmail(Email email) {
        inbox.add(email);
    }
    public void deleteEmail(int emailId) {
        inbox.removeIf(email -> email.getId() == emailId);
    }

}

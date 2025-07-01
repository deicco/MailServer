package it.mailserver.model;

import java.util.HashMap;
import java.util.Map;

public class ServerModel {
    private final Map<String, Mailbox> mailboxes;

    public ServerModel() {
        mailboxes = new HashMap<>();

        addMailbox("riccardo@mail.com");
        addMailbox("samuele@mail.com");
        addMailbox("davide@mail.com");
    }

    public void addMailbox(String email) {
        mailboxes.put(email.toLowerCase(), new Mailbox(email));
    }

    public boolean userExists(String email) {
        return mailboxes.containsKey(email.toLowerCase());
    }

    public Mailbox getMailbox(String email) {
        return mailboxes.get(email.toLowerCase());
    }

    public Map<String, Mailbox> getAllMailboxes() {
        return mailboxes;
    }


}

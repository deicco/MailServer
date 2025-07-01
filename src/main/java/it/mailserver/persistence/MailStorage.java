package it.mailserver.persistence;

import it.mailserver.model.Mailbox;
import it.mailserver.model.Email;

import java.io.*;
import java.util.List;
import java.util.Map;

public class MailStorage {
    private static final String DATA_DIR = "data";

    public static void saveAllMailBoxes(Map<String, Mailbox> mailboxes) {
        for (Map.Entry<String, Mailbox> entry : mailboxes.entrySet()) {
            saveMailbox(entry.getValue());
        }
    }

    public static void saveMailbox(Mailbox mailbox) {
        File dir = new File(DATA_DIR);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_DIR + "/" + mailbox.getEmailAddress() + ".txt"))){
            out.writeObject(mailbox.getInbox());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    public static List<Email> loadMailbox(String emailAddress) {
        File file = new File(DATA_DIR + "/" + emailAddress + ".txt");
        if (!file.exists()) return null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Email>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

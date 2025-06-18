package it.mailserver.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * Controller principale del Mail Server.
 * Gestisce la GUI e aggiorna lo stato e il log durante l'esecuzione.
 */
public class ServerController {

    // Label per visualizzare lo stato del server (connesso, in attesa, ecc.)
    @FXML
    private Label statusLabel;

    // Area di testo per visualizzare il log degli eventi in tempo reale
    @FXML
    private TextArea logArea;

    /**
     * Metodo invocato automaticamente da JavaFX dopo il caricamento del file FXML.
     * Può essere usato per eventuali inizializzazioni.
     */
    @FXML
    public void initialize() {
        log("Server avviato correttamente.");
    }

    /**
     * Aggiorna il testo dello stato del server.
     *
     * @param status Nuovo stato da visualizzare
     */
    public void setStatus(String status) {
        statusLabel.setText(status);
    }

    /**
     * Aggiunge un messaggio al log.
     *
     * @param message Messaggio da aggiungere al log
     */
    public void log(String message) {
        logArea.appendText(message + "\n");
    }
}

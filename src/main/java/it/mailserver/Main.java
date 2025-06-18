package it.mailserver;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import it.mailserver.controller.ServerController;

public class Main extends Application {

    private ServerController controller;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main_view.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setTitle("Mail Server");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Salvataggio del controller per usarlo durante l'esecuzione
        controller = loader.getController();
        controller.log("Pronto per ricevere connessioni...");
    }

    public static void main(String[] args) {
        launch(args);
    }
}

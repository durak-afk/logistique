package com.example.logistique.vues;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class SavePersonne implements Vue{

    private Stage stage;
    private Scene scene;


    @Override
    public void show() {
        this.stage.setScene(this.scene);
        this.stage.show();
    }

    public static SavePersonne creer(Stage stage){
        URL url = SavePersonne.class.getResource("savePersonne.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(url);
        try {
            BorderPane borderPane = fxmlLoader.load();
            SavePersonne savePersonne = fxmlLoader.getController();
            savePersonne.setStage(stage);
            savePersonne.setScene(new Scene(borderPane, 600, 700));
            return savePersonne;

        } catch (IOException e) {
            throw new RuntimeException("probleme lors de la chargement de la vue");
        }
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
}

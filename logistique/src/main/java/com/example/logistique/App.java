package com.example.logistique;

import com.example.logistique.vues.Accueil;
import com.example.logistique.vues.Vue;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Vue accueil = Accueil.creer(stage);
        accueil.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package com.mycompany.lagersoftware;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import javafx.stage.StageStyle;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static ArrayList<Technik> technik;

    public static ArrayList<Technik> getTechnik() {
        return technik;
    }

    public static void setTechnik(ArrayList<Technik> technik) {
        App.technik = technik;
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("MainView"), 780, 500);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        technik = new ArrayList<>();
        launch();
    }

}
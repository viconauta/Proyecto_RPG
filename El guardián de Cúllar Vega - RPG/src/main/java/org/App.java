package org;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        scene = new Scene(loadFXML("menu"));
        stage.setTitle("RPG Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws Exception {
        scene.setRoot(loadFXML(fxml));
    }

    private static javafx.scene.Parent loadFXML(String fxml) throws Exception {
        return FXMLLoader.load(App.class.getResource("/" + fxml + ".fxml"));
    }

    public static void main(String[] args) {
        launch();
    }
}

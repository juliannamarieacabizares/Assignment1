package com.codechum.assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CharacterCounterApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CharacterRemoverApplication.class.getResource("counter-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 384, 324);

        stage.setTitle("Character Counter");
        stage.setScene(scene);
        stage.show();
    }
}

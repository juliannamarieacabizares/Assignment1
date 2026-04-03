package com.codechum.assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginFormApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 189, 189);

        stage.setTitle("Login Form");
        stage.setScene(scene);
        stage.show();
    }
}

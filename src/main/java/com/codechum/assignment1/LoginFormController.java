package com.codechum.assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginFormController {
    public Button loginBtn;
    @FXML
    private TextField usernameText;
    @FXML
    private PasswordField passwordField;

    @FXML
    public void onLoginBtnClick(ActionEvent actionEvent) {
        String user = usernameText.getText();
        String pass = passwordField.getText();

        Alert statusDialog = new Alert(Alert.AlertType.INFORMATION);
        statusDialog.setTitle("Status");
        statusDialog.setHeaderText(null);
        if (user.equals("admin") && pass.equals("admin")) {
            statusDialog.setContentText("Login Success!");
        } else {
            statusDialog.setContentText("Login Failed!");
        }
        statusDialog.showAndWait();
    }
}

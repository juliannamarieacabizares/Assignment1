package com.codechum.assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class CharacterRemoverController {
    public Label textLabel;
    public CheckBox vowelCheckbox;
    public CheckBox consonantCheckbox;
    public CheckBox numberCheckbox;
    public Button removeButton;
    public Button restoreButton;

    private final String orig = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public void onRemoveButtonClick(ActionEvent actionEvent) {
        String current = textLabel.getText();
        if(vowelCheckbox.isSelected()) {
            current = current.replaceAll("(?i)[AEIOU]", "");
        }

        if(consonantCheckbox.isSelected()) {
            current = current.replaceAll("(?i)[BCDFGHJKLMNPQRSTVWXYZ]", "");
        }

        if(numberCheckbox.isSelected()) {
            current = current.replaceAll("[0-9]", "");
        }
        textLabel.setText(current);
    }

    public void onRestoreButtonClick(ActionEvent actionEvent) {
        textLabel.setText(orig);
        vowelCheckbox.setSelected(false);
        consonantCheckbox.setSelected(false);
        numberCheckbox.setSelected(false);
    }
}

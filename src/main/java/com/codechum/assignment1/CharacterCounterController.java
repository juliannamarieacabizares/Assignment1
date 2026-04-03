package com.codechum.assignment1;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CharacterCounterController {
    public TextArea messageTextArea;
    public TextField characterTextField;
    public Button countButton;
    public Label countLabel;


    public void onCountButtonClick(ActionEvent actionEvent) {
        String text = messageTextArea.getText();
        String search = characterTextField.getText();
        if(search.isEmpty()){
            countLabel.setText("Count = 0");
            return;
        }

        char target = search.charAt(0);
        long count = text.chars().filter(ch->ch == target).count();
        countLabel.setText("" + count);
    }
}

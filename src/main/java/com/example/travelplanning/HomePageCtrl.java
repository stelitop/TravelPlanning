package com.example.travelplanning;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HomePageCtrl {
    @FXML
    private Label welcomeText;

    @FXML
    private Button Plan;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
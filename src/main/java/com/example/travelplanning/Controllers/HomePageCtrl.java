package com.example.travelplanning.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HomePageCtrl {
    @FXML
    private Label welcomeText;

    @FXML
    private Button planButton;

    @FXML
    protected void onPlanButtonPressed() {
        System.out.println("Pressed plan button");
    }
}
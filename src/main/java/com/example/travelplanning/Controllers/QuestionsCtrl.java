package com.example.travelplanning.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class QuestionsCtrl extends MainCtrl{

    @FXML
    private TextField BudgetTextField;

    @FXML
    private Button Submit;

    public void submit(){
        System.out.println("Submitted");
    }
}

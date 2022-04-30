package com.example.travelplanning;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormManager {

    private int curQuestion;
    private List<Question> order;

    /**
     * Maps a question to the name of the fxml file.
     */
    private static final Map<Question, String> questionToFXML = new HashMap<>();
    static {
        questionToFXML.put(Question.Budget, "xxxx.fxml");
        questionToFXML.put(Question.NoPeople, "xxxx.fxml");
        questionToFXML.put(Question.NoDays, "xxxx.fxml");
        questionToFXML.put(Question.Climate, "xxxx.fxml");
        questionToFXML.put(Question.Activities, "xxxx.fxml");
    }

    public FormManager() {
        this.order = List.of(Question.Budget, Question.NoPeople, Question.NoDays, Question.Climate, Question.Activities);
        this.curQuestion = 0;
    }

    private void setStage(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(FormManager.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.getStylesheets().add(getClass().getResource("/CSS/Default.css").toExternalForm());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File" + " could not be loaded.");
        }
    }

    /**
     * Proceeds the form to the next field.
     * @return Null if end reached, the question otherwise.
     */
    public Question goNext(Stage stage) {
        if (curQuestion == order.size() - 1) return null;
        curQuestion++;
        setStage(stage);
        return order.get(curQuestion);
    }

    /**
     * Proceeds the form to the previous field.
     * @return Null if end reached, the question otherwise.
     */
    public Question goPrevious(Stage stage) {
        if (curQuestion == 0) return null;
        curQuestion--;
        setStage(stage);
        return order.get(curQuestion);
    }
}

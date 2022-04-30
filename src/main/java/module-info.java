module com.example.travelplanning {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.travelplanning to javafx.fxml;
    exports com.example.travelplanning;
}
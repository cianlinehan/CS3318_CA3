module com.example.cs3318_ca3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cs3318_ca3 to javafx.fxml;
    exports com.example.cs3318_ca3;
}
module com.example.cs3318_ca3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.registrationform to javafx.fxml;
    exports com.registrationform;
}
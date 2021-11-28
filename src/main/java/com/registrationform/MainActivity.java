package com.registrationform;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainActivity extends Application implements Contract.MainActivityInterface {

    MainActivityPresenter myPresenter = new MainActivityPresenter();

    @Override
    public void start(Stage stage) throws Exception {

        Label emailLabel = new Label("Email");
        Label passwordLabel = new Label("Password");
        TextField emailTextField = new TextField();
        TextField passwordTextField = new TextField();



        Button submitButton = new Button("Submit");
        submitButton.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        String email = emailTextField.getText();
                        String password = passwordTextField.getText();
                        myPresenter.updateEmail(email);
                        myPresenter.updatePassword(password);

                    }
                }
        );

        GridPane root = new GridPane();
        root.addRow(0, emailLabel, emailTextField);
        root.addRow(1, passwordLabel, passwordTextField);
        root.addRow(2, submitButton);

        Scene scene = new Scene(root,800,200);

        stage.setScene(scene);
        stage.setTitle("Lab 03 Registration Form");
        stage.show();
    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onEmailEntered() {

    }

    @Override
    public void onPasswordEntered() {

    }

}

package com.registrationform;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainActivity extends Application implements Contract.MainActivityInterface {

    MainActivityPresenter myPresenter = new MainActivityPresenter();
    Stage stage;

    @Override
    public void start(Stage stage) throws Exception {

        this.stage = stage;

        Label emailLabel = new Label("Email");
        Label passwordLabel = new Label("Password");

        TextField emailTextField = new TextField();
        emailTextField.setPromptText("Enter Email");
        PasswordField passwordTextField=new PasswordField();
        passwordTextField.setPromptText("Enter Password");

        Label submitLabel = new Label("");

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        String email = emailTextField.getText();
                        String password = passwordTextField.getText();
                        Boolean emailCheck = myPresenter.updateEmail(email);
                        Boolean passwordCheck = myPresenter.updatePassword(password);

                        String incorrectPasswordMessage = "Incorrect Password format\n\nMust include:\n\t- 7 characters \n\t- 1 letter and digit\n\t- 1 character from *^&@!";
                        String incorrectEmailMessage ="Incorrect Email format\n\nMust be of the form:\n\texample@mail.com\nWhere:\n\t- 'example' is the email prefix \n\t- 'mail.com' is the email domain";

                        if(emailCheck & passwordCheck){
                            submitLabel.setText("Registration form accepted!");
                        }
                        else if(!emailCheck & !passwordCheck) {
                            submitLabel.setText("Incorrect Email and Password format\n\nEmail must be of the form:\n\texample@mail.com\nWhere:\n\t- 'example' is the email prefix \n\t- 'mail.com' is the email domain\n\nAnd password must include:\n\t- 7 characters \n\t- 1 letter and digit\n\t- 1 character from *^&@!");
                            emailTextField.setText("");
                            passwordTextField.setText("");
                        }
                        else if(!emailCheck){
                            submitLabel.setText(incorrectEmailMessage);
                            emailTextField.setText("");
                        }
                        else {
                            submitLabel.setText(incorrectPasswordMessage);
                            passwordTextField.setText("");
                        }
                    }
                }
        );

        GridPane root = new GridPane();
        root.addRow(0, emailLabel, emailTextField);
        root.addRow(1, passwordLabel, passwordTextField);
        root.addRow(2, submitButton);
        root.addRow(2, submitLabel);
        Scene scene = new Scene(root,500,500);

        stage.setScene(scene);
        stage.setTitle("Lab 03 Registration Form");
        stage.show();
    }

    @Override
    public void onDestroy() {
        stage.close();
    }
}

package com.example.biomasys;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.control.ButtonType.CANCEL;

public class DashboardController {
    @FXML
    Label userName;

    public void displayUsername(String LoginUsername) {
        System.out.println("Displaying Username");
        userName.setText(LoginUsername);
    }

    Stage stage;

    @FXML
    Button logout;

    @FXML
    AnchorPane login;

    public void logout (ActionEvent event) throws IOException {
        Alert alert = new Alert(AlertType.CONFIRMATION);;
        alert.setTitle("Quit");
        alert.setHeaderText("You are about to Logout");
        alert.setContentText("Are you sure you want to Logout?: ");
        alert.showAndWait();

        if(alert.getResult() == ButtonType.OK) {
            stage = (Stage) login.getScene().getWindow();
            System.out.println("Logged out successfully");
            stage.close();
        }else if(alert.getResult()== CANCEL) {
            System.out.println("Logged out canceled");
        }
        System.out.println("Logged out Attempted");
    }
}


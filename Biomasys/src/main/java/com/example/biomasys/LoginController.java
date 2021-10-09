package com.example.biomasys;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    TextField username;

    @FXML
    TextField password;

    private Scene scene;
    private Stage stage;
    private Parent root;

    public void login(ActionEvent event) throws IOException {

        System.out.println(username.getText() + password.getText());

        String loginUsername = username.getText();
        String LoginPassword = password.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("dashboard.fxml"));
        root = loader.load();

        DashboardController dashboardController = loader.getController();
        dashboardController.displayUsername(loginUsername);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Dashboard!");
        stage.show();

    }

//    public void LoadDashboard(ActionEvent event) throws IOException {
//
//        System.out.println("Switching to dashboard");
//        Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setTitle("Dashboard!");
//        stage.show();
//    };

}

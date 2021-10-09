package com.example.biomasys;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.io.IOException;

public class HomepageController {

    private Scene scene;
    private Stage stage;
    private Parent root;

    public void launchApp(ActionEvent event) throws IOException {
        System.out.println("Application Launch");
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Sign in!");
        stage.show();
    };
}

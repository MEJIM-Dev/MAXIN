package com.example.biomasys;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.control.ButtonType.CANCEL;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Homepage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setResizable(false);
        stage.setTitle("Homepage!");
        stage.setScene(scene);
        Image icon = new Image(HelloApplication.class.getClassLoader().getResourceAsStream("Smiley.jpeg"));
        stage.getIcons().add(icon);
        stage.show();

        stage.setOnCloseRequest( windowEvent -> {
            try {
                logout(stage);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void logout (Stage stage) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Quit");
        alert.setHeaderText("You are about to Close App");
        alert.setContentText("Are you sure you want to Close the App?: ");
        alert.showAndWait();
        System.out.println("Closing Attempted");

        if(alert.getResult() == ButtonType.OK) {
            System.out.println("Exiting App successfully");
            stage.close();
        }else if(alert.getResult()== CANCEL) {
            System.out.println("Exiting App canceled");
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
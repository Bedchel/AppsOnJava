package com.example.appsonjava.L2;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.Optional;

public class CloseEventCheck extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Close this application");
        VBox root = new VBox(label);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 250);
        stage.setTitle("Capturing");
        stage.setScene(scene);

        stage.setOnCloseRequest(event -> {
            // Зупиняємо автоматичне закриття вікна
            event.consume();

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.initOwner(stage);
            alert.setTitle("Exit confirmation");
            alert.setHeaderText("Are you sure?");
            alert.setContentText("All data will be deleted");

            Optional<ButtonType> result = alert.showAndWait();

            if (result.isPresent() && result.get() == ButtonType.OK) {
                stage.close();
            }
        });

        stage.show();
    }
}

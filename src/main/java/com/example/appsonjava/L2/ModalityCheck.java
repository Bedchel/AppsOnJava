package com.example.appsonjava.L2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class ModalityCheck extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button openDialogButton = new Button("Open Modality Dialog");
        openDialogButton.setOnAction(e -> openModalWindow(primaryStage));

        VBox root = new VBox(openDialogButton);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Main Window");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void openModalWindow(Stage ownerStage) {
        Stage dialogStage = new Stage();

        dialogStage.initOwner(ownerStage);

        //dialogStage.initModality(Modality.NONE);
        //dialogStage.initModality(Modality.WINDOW_MODAL);
        //dialogStage.initModality(Modality.APPLICATION_MODAL);

        Label label = new Label("Main window now is blocked!");
        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> dialogStage.close());

        VBox dialogLayout = new VBox(15, label, closeButton);
        dialogLayout.setAlignment(Pos.CENTER);
        Scene dialogScene = new Scene(dialogLayout, 320, 150);

        dialogStage.setTitle("Modality Dialog");
        dialogStage.setScene(dialogScene);

        dialogStage.showAndWait();
    }
}

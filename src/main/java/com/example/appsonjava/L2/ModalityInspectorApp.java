package com.example.appsonjava.L2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ModalityInspectorApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button openWindowModal = new Button("Open Window Modal");
        openWindowModal.setOnAction(e -> openWindow(primaryStage, Modality.WINDOW_MODAL, "Model Window"));
        Button openNonModalWindow = new Button("Open non modal Window");
        openNonModalWindow.setOnAction(e -> openWindow(primaryStage, Modality.NONE, "Non Model Window"));
        Button openApplicationModal = new Button("Open Application Modal");
        openApplicationModal.setOnAction(e -> openWindow(primaryStage, Modality.APPLICATION_MODAL, "Application Model Window"));

        VBox root = new VBox(openNonModalWindow, openWindowModal, openApplicationModal);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Main Window");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void openWindow(Stage ownerStage, Modality modality, String string) {
        Stage dialogStage = new Stage();

        dialogStage.initModality(modality);
        dialogStage.initOwner(ownerStage);
        dialogStage.initStyle(StageStyle.UTILITY);

        Label label = new Label(string.replace(" Window", ""));
        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> dialogStage.close());

        VBox dialogLayout = new VBox(15, label, closeButton);
        dialogLayout.setAlignment(Pos.CENTER);
        Scene dialogScene = new Scene(dialogLayout, 320, 150);

        dialogStage.setTitle(string);
        dialogStage.setScene(dialogScene);

        dialogStage.showAndWait();
    }

}

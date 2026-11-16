package com.example.appsonjava.L2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Optional;

public class L2HardTaskGeometryTrackerApp extends Application {
    private Label sizeLabel;
    public static boolean isAdjusting = false;

    public static final double COEFFICIENT = 4.0 / 3.0;
    public static final double COEFFICIENT2 = 3.0 / 4.0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label title = new Label("Geometry tracker app");
        StackPane root = new StackPane(title);
        Scene scene = new Scene(root, 640, 640 / COEFFICIENT);

        primaryStage.setMinWidth(544);
        primaryStage.setMinHeight(544 / COEFFICIENT);

        primaryStage.setMaxWidth(1800);
        primaryStage.setMaxHeight(1800 / COEFFICIENT);

        primaryStage.setScene(scene);

        //Size corrector
        primaryStage.widthProperty().addListener((obs, oldW, newW) -> updateHeightLabel(primaryStage, newW));
        primaryStage.heightProperty().addListener((obs, oldH, newH) -> updateWightLabel(primaryStage, newH));

        //update Title
        primaryStage.xProperty().addListener((obs, oldVal, newVal) -> updateTitle(primaryStage));
        primaryStage.yProperty().addListener((obs, oldVal, newVal) -> updateTitle(primaryStage));
        primaryStage.widthProperty().addListener((obs, oldW, newW) -> updateTitle(primaryStage));
        primaryStage.heightProperty().addListener((obs, oldH, newH) -> updateTitle(primaryStage));


        primaryStage.setOnCloseRequest(event -> {
            event.consume();

            ButtonType saveAndExit = new ButtonType("Зберегти і вийти");
            ButtonType exitWithoutSaving = new ButtonType("Вийти без збереження");
            ButtonType cancel = new ButtonType("Скасувати");

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.initOwner(primaryStage);
            alert.setTitle("Підтвердження виходу");
            alert.setHeaderText("Ви впевнені, що хочете вийти?");
            alert.setContentText("Виберіть дію:");

            alert.getButtonTypes().setAll(saveAndExit, exitWithoutSaving, cancel);

            Optional<ButtonType> result = alert.showAndWait();

            if (result.isPresent()) {
                if (result.get() == saveAndExit) {
                    primaryStage.close();

                } else if (result.get() == exitWithoutSaving) {
                    //save
                    primaryStage.close();
                }
            }
        });

        primaryStage.show();
    }

    private void updateHeightLabel(Stage primaryStage, Number newW) {
        if (!isAdjusting) {
            isAdjusting = true;
            primaryStage.setHeight(newW.doubleValue() / COEFFICIENT);
            isAdjusting = false;
        }
    }

    private void updateWightLabel(Stage primaryStage, Number newH) {
        if (!isAdjusting) {
            isAdjusting = true;
            primaryStage.setWidth(newH.doubleValue() / COEFFICIENT2);
            isAdjusting = false;
        }
    }

    private void updateTitle(Stage stage) {
        stage.setTitle(String.format(
                "Позиція: [X = %.0f, Y = %.0f] | Розмір: [Width = %.0f × Height = %.0f]",
                stage.getX(), stage.getY(), stage.getWidth(), stage.getHeight()
        ));
    }

}

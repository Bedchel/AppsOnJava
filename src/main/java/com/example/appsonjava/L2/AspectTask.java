package com.example.appsonjava.L2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class AspectTask extends Application {

    public static final double COEFFICIENT = 16.0 / 9.0;

    public static final double COEFFICIENT2 = 9.0 / 16.0;
    public static boolean isResizing = false;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label title = new Label("Aspect Size 16:9");
        StackPane root = new StackPane(title);
        Scene scene = new Scene(root, 640, 640 / COEFFICIENT);

        primaryStage.setMinWidth(320);
        primaryStage.setMinHeight(320 / COEFFICIENT);
        primaryStage.setScene(scene);

        scene.widthProperty().addListener((obs, oldW, newW) -> updateHeightLabel(primaryStage, newW));
        scene.heightProperty().addListener((obs, oldH, newH) -> updateWightLabel(primaryStage, newH));

        primaryStage.show();
    }


    private void updateHeightLabel(Stage primaryStage, Number newW) {
        if (!isResizing) {
            isResizing = true;
            primaryStage.setHeight(newW.doubleValue() / COEFFICIENT);
            isResizing = false;
        }
    }
    private void updateWightLabel(Stage primaryStage, Number newH) {
        if (!isResizing) {
            isResizing = true;
            primaryStage.setHeight(newH.doubleValue() / COEFFICIENT2);
            isResizing = false;
        }
    }

}

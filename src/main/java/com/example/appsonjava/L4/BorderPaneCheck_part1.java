package com.example.appsonjava.L4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneCheck_part1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox topSide = new HBox();
        VBox leftSide = new VBox();
        HBox bottomSide = new HBox();
        topSide.getChildren().add(new Button("Button 1"));
        leftSide.getChildren().add(new Button("Button 2"));
        bottomSide.getChildren().add(new Button("Button 3"));

        topSide.setStyle("-fx-background-color: rgba(45, 218, 234, 0.66);");
        leftSide.setStyle("-fx-background-color: rgba(118, 77, 237, 0.66);");
        bottomSide.setStyle("-fx-background-color: rgba(234, 85, 246, 0.66);");

        //topSide.setPrefHeight(100);
        //leftSide.setPrefWidth(200);
        //bottomSide.setPrefHeight(200);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topSide);
        borderPane.setLeft(leftSide);
        borderPane.setBottom(bottomSide);

        Scene scene = new Scene(borderPane, 320,240);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

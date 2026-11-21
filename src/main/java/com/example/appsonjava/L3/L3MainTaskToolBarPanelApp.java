
package com.example.appsonjava.L3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class L3MainTaskToolBarPanelApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // SideBar
        VBox sideBar = new VBox();
        sideBar.setAlignment(Pos.TOP_LEFT);
        sideBar.setPrefWidth(180);
        sideBar.setMinWidth(180);
        sideBar.setMinHeight(75);
        sideBar.setStyle("-fx-background-color: #ff0000; -fx-border-color: #000000;");

        Label appName = new Label("L3MainTaskToolBarPanelApp");
        appName.setStyle("-fx-font-weight: 100;");

        Button createButton = createButton("Create");
        Button openButton = createButton("Open");

        sideBar.getChildren().addAll(appName, createButton, openButton);

        // Search field
        StackPane searchField = new StackPane();
        searchField.setPrefHeight(80);
        searchField.setMinHeight(80);
        searchField.setMaxHeight(80);
        searchField.setMaxWidth(Double.MAX_VALUE);
        searchField.setStyle("-fx-background-color: #d2d2d2; -fx-border-color: #000000;");

        TextField searchFieldTF = new TextField();
        searchFieldTF.setPromptText("Search field");
        searchFieldTF.setMaxWidth(Double.MAX_VALUE);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(24));

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setHgrow(Priority.ALWAYS);
        column1.setFillWidth(true);
        gridPane.getColumnConstraints().add(column1);

        gridPane.add(searchFieldTF, 0, 0);
        GridPane.setHgrow(searchFieldTF, Priority.ALWAYS);

        searchField.getChildren().add(gridPane);

        // Spacer
        Region spacer = new Region();
        spacer.setMinSize(200, 200);
        spacer.setStyle("-fx-background-color: #ffffff; -fx-border-color: #000000;");

        VBox.setVgrow(spacer, Priority.ALWAYS);

        // Search field + Spacer
        VBox searchFieldWithSpacer = new VBox(searchField, spacer);
        searchFieldWithSpacer.setFillWidth(true);

        HBox.setHgrow(searchFieldWithSpacer, Priority.ALWAYS);

        // Container
        HBox container = new HBox(sideBar, searchFieldWithSpacer);
        HBox.setHgrow(container, Priority.ALWAYS);

        // Admin
        VBox admin = new VBox();

        Label right = new Label("Користувач: Admin");
        Button exit = new Button("Exit");

        admin.getChildren().addAll(exit, right);
        admin.setStyle("-fx-background-color: #998e8e; -fx-border-color: #000000;");

        admin.setAlignment(Pos.TOP_RIGHT);
        admin.setPrefSize(500, 100);
        admin.setMinWidth(50);
        admin.setMaxWidth(250);

        // All parts
        HBox allParts = new HBox(container, admin);
        HBox.setHgrow(container, Priority.ALWAYS);

        Scene scene = new Scene(allParts, 720, 340);

        primaryStage.setTitle("ToolBarPanelApp");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Button createButton(String contextOfButton) {
        Button button1 = new Button(contextOfButton);
        button1.setMaxWidth(Double.MAX_VALUE);
        button1.setAlignment(Pos.BASELINE_LEFT);

        return button1;
    }
}

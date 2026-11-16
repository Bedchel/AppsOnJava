package com.example.appsonjava.L3;

import javafx.application.Application;
import javafx.geometry.HPos;
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
        VBox sideBar = new VBox();
        sideBar.setAlignment(Pos.BASELINE_LEFT);
        sideBar.setPrefWidth(180);
        sideBar.setStyle("-fx-border-color: #ff0000;");
        Label appName = new Label("L3MainTaskToolBarPanelApp");
        appName.setStyle("-fx-font-weight: 100;");

        Button createButton = createButton("Create");
        Button openButton = createButton("Open");

        sideBar.getChildren().addAll(appName, createButton, openButton);

        //Search field
        StackPane searchField = new StackPane();
        ColumnConstraints column1 = new ColumnConstraints(100, 100, 168);
        column1.setHalignment(HPos.CENTER);
        TextField searchFieldTF = new TextField();
        searchFieldTF.setPromptText("Search field");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(24));
        gridPane.add(searchFieldTF, 0, 0);

        searchField.getChildren().addAll(gridPane);
        searchField.setStyle("-fx-border-color: #a6a6a6");
        HBox.setHgrow(searchField, Priority.ALWAYS);
        searchField.setAlignment(Pos.CENTER);
        Region spacer = new Region();
        spacer.setMinSize(200, 200);
        HBox.setHgrow(spacer, Priority.ALWAYS);
        StackPane container = new StackPane(sideBar, spacer, searchField);

        //Rights
        VBox admin = new VBox();
        Label right = new Label("Користувач: Admin");
        Button exit = new Button("Exit");
        admin.getChildren().addAll(exit, right);
        admin.setStyle("-fx-border-color: #ffa600");

        admin.setAlignment(Pos.TOP_RIGHT);
        admin.setPrefSize(500, 100);
        admin.setMaxWidth(1000);

        StackPane allParts = new StackPane(container, admin);

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

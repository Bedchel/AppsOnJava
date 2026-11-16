package com.example.appsonjava.L3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class L3SideBar1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox sideBar = new VBox(10);
        sideBar.setPadding(new Insets(10));
        sideBar.setPrefWidth(180);
        sideBar.setStyle("-fx-border-color: #6a6a6a");

        Button mainButton = createButton("Main");
        Button infoButton = createButton("Info");
        Button exitButton = createButton("Exit");

        sideBar.getChildren().addAll(mainButton, infoButton, exitButton);

        //Main part
        StackPane mainPart = new StackPane();
        Label text = new Label("This is main part");
        mainPart.getChildren().add(text);
        mainPart.setStyle("-fx-border-color: #a6a6a6");
        HBox.setHgrow(mainPart, Priority.SOMETIMES);

        HBox container = new HBox(sideBar, mainPart);
        VBox.setVgrow(container, Priority.ALWAYS);

        //FOOTER
        HBox footer = new HBox(10);
        Label info = new Label("Info Text Footer");
        Label end = new Label("End of the program");
        footer.setStyle("-fx-border-color: #dc143c");
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        footer.getChildren().addAll(info, spacer, end);

        VBox allParts = new VBox(container, footer);

        Scene scene = new Scene(allParts, 720, 340);
        primaryStage.setTitle("Dashboard");
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

package com.example.appsonjava.L3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class RegionSpacerAndSideBar extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox sideBar = new VBox();
        sideBar.setPrefWidth(180);

        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        button1.setMaxWidth(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);

        Region spacer = new Region();
        sideBar.getChildren().addAll(button1, spacer,button2);
        VBox.setVgrow(spacer, Priority.ALWAYS);





        StackPane contentArea = new StackPane(new Label("MAIN"));
        contentArea.setStyle("-fx-background-color: #d66161;");

        BorderPane root = new BorderPane();
        root.setLeft(sideBar);
        root.setCenter(contentArea);

        Scene scene = new Scene(root, 320,240);
        primaryStage.setTitle("Region Spacer");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

package com.example.appsonjava.L3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxButtons extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vBox = new VBox();

        Button button = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");

        vBox.getChildren().addAll(button,button2,button3);

        //HBox.setHgrow(Node, Priority)
        //VBox.setVgrow(Node, Priority)
        // Priority.NEVER, Priority.SOMETIMES, Priority.ALWAYS

        button.setMaxHeight(Double.MAX_VALUE);
        button2.setMaxHeight(Double.MAX_VALUE);
        button3.setMaxHeight(Double.MAX_VALUE);

        //VBox.setVgrow(button, Priority.NEVER);
        //VBox.setVgrow(button2, Priority.SOMETIMES);
        //VBox.setVgrow(button3, Priority.ALWAYS);

        Scene scene = new Scene(vBox,320,240);
        primaryStage.setTitle("VBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

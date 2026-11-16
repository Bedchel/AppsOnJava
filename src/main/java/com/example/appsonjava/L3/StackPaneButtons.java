package com.example.appsonjava.L3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPaneButtons extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stackPane = new StackPane();

        Button button = new Button("Button1");
        button.setPrefSize(90, 35);
        Button button2 = new Button("Button2");
        button2.setPrefSize(180, 70);
        Button button3 = new Button("Button3");
        button3.setPrefSize(270, 110);

        stackPane.getChildren().addAll(button3,button2,button);

        //StackPane.setAlignment(button3, Pos.TOP_LEFT);
        //StackPane.setAlignment(button, Pos.BOTTOM_RIGHT);

        //StackPane.setMargin(button2, new Insets(100, 0, 0,0));


        Scene scene = new Scene(stackPane,320,240);
        primaryStage.setTitle("StackPaneButtons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

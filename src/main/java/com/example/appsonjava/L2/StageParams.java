package com.example.appsonjava.L2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StageParams extends Application {

    static void main() {
        launch();
    }

    public void start(Stage stage) {
        //stage.initStyle(StageStyle.DECORATED);
        //stage.initStyle(StageStyle.UNDECORATED);
        //stage.initStyle(StageStyle.TRANSPARENT);
        //stage.initStyle(StageStyle.UTILITY);
        //stage.initStyle(StageStyle.UNIFIED);

        //stage.setMinWidth(1000);
        //stage.setMaxWidth(1500);

        // Ban opportunity set new size of window
        //stage.setResizable(false);

        // Full screen
        //stage.setFullScreen(true);
        //stage.setFullScreenExitHint("You need to restart the app");


        Circle circ = new Circle(40, 40, 30);
        Group root = new Group(circ);
        Scene scene = new Scene(root, 400, 300);

        //scene.setFill(Color.TRANSPARENT);

        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }

}

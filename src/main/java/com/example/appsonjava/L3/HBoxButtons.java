package com.example.appsonjava.L3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxButtons extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox();

        Button button = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");
        hBox.getChildren().addAll(button,button2,button3);

        // Міжелементний проміжок (HBox or VBox)
        hBox.setSpacing(10);
        //HBox hBox = new HBox(10);

        // Внутрішні поля
        //hBox.setPadding(new Insets(100,10,10,10));

        // Вирівнювання
        // ENUM: POS
        hBox.setAlignment(Pos.CENTER_RIGHT);

        Scene scene = new Scene(hBox,320,240);
        primaryStage.setTitle("HBox");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

package com.example.appsonjava.L1;

import com.example.appsonjava.Basic.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class L1HardTask extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Hard Task");
        Button button = new Button("Симулювати фонове оновлення");
        VBox vBox = new VBox(label, button);
        Scene scene = new Scene(vBox, 100, 100);
        primaryStage.setScene(scene);
        button.setOnAction(e -> actionEvent());
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        Thread.sleep(1500);
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public void actionEvent(){
        Thread thread = new Thread(() -> {
            System.out.println("Почати фонове оновлення");
        });

    }
}

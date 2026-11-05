package com.example.appsonjava.L1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LogThreadApp extends Application {

    // format [PREFIX] nameOfCurrentThread, isFxApplication
    static void main(String[] args) {
        Application.launch(LogThreadApp.class, args);
        logInfo("MAIN");
    }

    private static void logInfo(String prefix) {
        String nameOfCurrentThread = Thread.currentThread().getName();
        boolean isFxApplicationThread = Platform.isFxApplicationThread();
        System.out.println("[" + prefix + "] " + nameOfCurrentThread + " isFxApplicationThread " + isFxApplicationThread);
    }

    @Override
    public void start(Stage primareStage) throws Exception {
        logInfo("START");

        Label title = new Label("L1. Check window creation");       //leaf
        StackPane root = new StackPane(title);                          //branch
        Scene scene = new Scene(root, 1000, 1000);          //scene

        primareStage.setTitle("L1. Check window creation");
        primareStage.setScene(scene);
        primareStage.show();
    }

    @Override
    public void init() throws Exception {
        logInfo("INIT");
    }

    @Override
    public void stop() throws Exception {
        logInfo("STOP");
    }


}

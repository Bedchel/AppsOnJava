package com.example.appsonjava.L1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.time.Instant;

public class L1Homework extends Application {
    long start = 0;

    static void main(String[] args) {
        Application.launch(LogThreadApp.class, args);
        logInfo("MAIN");
    }

    private static void logInfo(String prefix) {
        String nameOfCurrentThread = Thread.currentThread().getName();
        boolean isFxApplicationThread = Platform.isFxApplicationThread();
        System.out.println("[" + prefix + "] " + nameOfCurrentThread);
    }

    @Override
    public void start(Stage primareStage) throws Exception {
        start = System.nanoTime();
        logInfo("START");
        Label title = new Label("L1. EnvironmentAuditorApp");       //leaf
        StackPane root = new StackPane(title);                          //branch
        Scene scene = new Scene(root, 1000, 1000);          //scene

        primareStage.setTitle("L1. Check window creation");
        primareStage.setScene(scene);
        primareStage.show();
    }

    @Override
    public void init() throws Exception {
        logInfo("INIT");
        // String version = System.getProperty();
        // String vendor = System.getProperty();
        // String name = System.getProperty();
        // String arch = System.getProperty();
        // String javaFXVersion = System.getProperty();
        // String javaFXRuntimeVersion = System.getProperty();
    }

    @Override
    public void stop() throws Exception {
        logInfo("STOP");
        long end = System.nanoTime();
        System.out.println("Час роботи: " + (end - start) / 1_000_000 + " мс");
    }

}

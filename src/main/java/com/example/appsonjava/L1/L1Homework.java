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
        System.out.println("[" + prefix + "] " + nameOfCurrentThread + "Is FxApplicationThread" + isFxApplicationThread);
    }

    @Override
    public void start(Stage primareStage) throws Exception {
        start = System.nanoTime();
        logInfo("START");
        Label title = new Label("L1. EnvironmentAuditorApp");       //leaf
        StackPane root = new StackPane(title);                          //branch
        Scene scene = new Scene(root, 520, 340);          //scene

        primareStage.setTitle("L1. Check window creation");
        primareStage.setScene(scene);
        primareStage.show();
    }

    @Override
    public void init() throws Exception {
        logInfo("INIT");
        String version = System.getProperty("java.version");
        System.out.println("Java Version " + version);
        String vendor = System.getProperty("java.vendor");
        System.out.println("Java Vendor " + vendor);
        String name = System.getProperty("os.name");
        System.out.println("Os name " +name);
        String arch = System.getProperty("os.arch");
        System.out.println("Java Arch " + arch);
        String javaFXVersion = System.getProperty("javafx.version");
        System.out.println("JavaFX Version " + javaFXVersion);
    }

    @Override
    public void stop() throws Exception {
        logInfo("STOP");
        long end = System.nanoTime();
        System.out.println("Час роботи: " + (end - start) / 1_000_000 + " мс");
    }

}

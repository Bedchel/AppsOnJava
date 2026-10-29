package com.example.appsonjava.L1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class LogThreadApp extends Application {

    // format [PREFIX] nameOfCurrentThread, isFxApplication

    private static void logInfo(String prefix) {
        String nameOfCurrentThread = Thread.currentThread().getName();
        boolean isFxApplicationThread = Platform.isFxApplicationThread();
        System.out.println("[" + nameOfCurrentThread + "]" + "isFxApplicationThread" + isFxApplicationThread);
    }

    @Override
    public void start(Stage primareStage) throws Exception {
        logInfo("NAME");
    }

    @Override
    public void init() throws Exception {
        logInfo("INIT");
    }

    @Override
    public void stop() throws Exception {
        logInfo("STOP");
    }

    public void main() {
        logInfo("MAIN");
    }
}

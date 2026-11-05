package com.example.appsonjava.L2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SizeOfWindow extends Application {
    private Label sizeLabel;

    @Override
    public void start(Stage stage) throws Exception {
        sizeLabel = new Label();

        Label hintLabel = new Label("Please move or resize window");

        VBox root = new VBox(10, sizeLabel, hintLabel);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 500, 350);

        stage.xProperty().addListener((obs, oldVal, newVal) -> updateTitle(stage));
        stage.yProperty().addListener((obs, oldVal, newVal) -> updateTitle(stage));

        scene.widthProperty().addListener((obs, oldW, newW) -> updateSizeLabel(scene));
        scene.heightProperty().addListener((obs, oldH, newH) -> updateSizeLabel(scene));

        stage.setScene(scene);
        stage.show();

        updateTitle(stage);
        updateSizeLabel(scene);
    }

    private void updateTitle(Stage stage) {
        stage.setTitle(String.format("Position: X = %.0f, Y = %.0f", stage.getX(), stage.getY()));
    }

    private void updateSizeLabel(Scene scene) {
        sizeLabel.setText(String.format("Size of window: %.0f × %.0f px", scene.getWidth(), scene.getHeight()));
    }
}

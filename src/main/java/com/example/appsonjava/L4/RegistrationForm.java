package com.example.appsonjava.L4;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;


public class RegistrationForm extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(24));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);

       // gridPane.setGridLinesVisible(true);

        ColumnConstraints column1 = new ColumnConstraints(100, 100, 168);
        column1.setHalignment(HPos.LEFT);

        ColumnConstraints column2 = new ColumnConstraints(100, 100, 168);
        column2.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(column1, column2);

        Label title = new Label("User Registrarion");
        title.setStyle("-fx-font-family: Arial; -fx-font-weight: bold");
        GridPane.setColumnSpan(title, 2);
        GridPane.setHalignment(title, HPos.CENTER);
        GridPane.setMargin(title, new Insets(0, 0, 10, 0));
        gridPane.add(title, 0, 0);

        Label username = new Label("Ведіть ваше імя");

        gridPane.add(username, 0, 1);

        TextField usernameTF = new TextField();
        usernameTF.setPromptText("Hint: MyName123");
        gridPane.add(usernameTF, 1, 1);

        Label email = new Label("Ведіть ваше e-mail");

        gridPane.add(email, 0, 2);

        TextField emailTF = new TextField();
        usernameTF.setPromptText("Hint: my@email.com");
        gridPane.add(emailTF, 1, 2);

        Label password = new Label("Ведіть ваш пароль");

        gridPane.add(password, 0, 3);


        PasswordField passwordTF = new PasswordField();
        passwordTF.setPromptText("Hint: p@ssword123");
        gridPane.add(passwordTF, 1, 3);

        Scene scene = new Scene(gridPane, 480, 480);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Registration");
        primaryStage.show();
    }
}

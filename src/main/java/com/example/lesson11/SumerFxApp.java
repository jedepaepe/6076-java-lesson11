package com.example.lesson11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SumerFxApp extends Application {
    private Sumer sumer = new Sumer();

    @Override
    public void start(Stage stage) {
        TextField input = new TextField();
        input.setMaxWidth(100);
        input.setMaxHeight(50);

        Button sumButton = new Button("somme");
        Text result = new Text();

        input.setOnAction(event -> {
            sumer.add(Integer.parseInt(input.getText()));
            input.setText("");
            System.out.println(sumer.get());
        });

        input.focusedProperty().addListener((obs, oldVal, newVal) -> {
            if (! newVal) {
                sumer.add(input.getText());
                input.setText("");
                System.out.println(sumer.get());
            }
        });

        sumButton.setOnMouseClicked(event -> {
            result.setText(sumer.getString());
            System.out.println(sumer.get());
        });

        VBox vBox = new VBox(input, sumButton, result);
        vBox.setSpacing(8);
        vBox.setPadding(new Insets(16, 16, 16, 16));
        vBox.setAlignment(Pos.CENTER);

        stage.setScene(new Scene(vBox));
        stage.setTitle("sommeur");
        stage.show();
    }
}

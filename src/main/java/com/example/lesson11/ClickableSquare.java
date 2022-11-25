package com.example.lesson11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ClickableSquare extends Application {
    boolean isGreen = true;

    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.GREEN);
        gc.fillRect(100, 100, 400, 400);
        canvas.setOnMouseClicked(event -> {
            if (isGreen) {
                gc.setFill(Color.BLUE);
            } else {
                gc.setFill(Color.GREEN);
            }
            gc.fillRect(100, 100, 400, 400);
            isGreen = ! isGreen;
        });
        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("carré clickable");
        stage.show();
    }
}

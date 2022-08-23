package com.example.calendarjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import java.io.FileInputStream;
import java.io.InputStream;

public class Base extends Application {

    private Button eventAdderButton;

    @Override
    public void start(Stage applicationStage) throws Exception {
        Scene scene;
        GridPane gridPane;

        gridPane = new GridPane();
        scene = new Scene(gridPane);

        //background setting tests
        /*InputStream stream = new FileInputStream("C:/Users/karmi/OneDrive/Pictures/Screenshots/Space man and his dog.png");
        Image image = new Image(stream);
        BackgroundImage background = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background backReal = new Background(background);
        gridPane.setBackground(backReal);*/

        //adding an event button
        eventAdderButton = new Button("Add Event");
        gridPane.add(eventAdderButton, 1,1);
        eventAdderButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        Label testing = new Label("Testing to see if this will print.");
        testing.setFont(new Font(20));
        gridPane.add(testing,0,0);
        gridPane.setHalignment(testing, HPos.CENTER);

        applicationStage.setScene(scene);
        applicationStage.setTitle("Calendar");
        applicationStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

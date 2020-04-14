package at.schoolbooster;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

import javafx.event.EventHandler;

public class Checklist extends Application implements EventHandler<ActionEvent> {

    Button newtask;

    public static void Checklist(String[] args){
        launch(args);
}

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Checklist");

        newtask = new Button();
        newtask.setText("+");
        newtask.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(newtask);

        Scene scene = new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {

        if(event.getSource()==newtask){
            System.out.println("New Task");
        }
    }
}

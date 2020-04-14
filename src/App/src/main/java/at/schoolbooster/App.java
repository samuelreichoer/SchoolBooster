package at.schoolbooster;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        String localDir = System.getProperty("user.dir");

        scene = new Scene(loadFXML("primary"));

        scene.getStylesheets().add((new File("global.css")).toURI().toURL().toExternalForm());
        stage.setScene(scene);
        stage.setTitle("SchoolBooster");
        stage.getIcons().add(new Image(new FileInputStream(localDir + "/src/main/resources/at/schoolbooster/img/icon.png")));

        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
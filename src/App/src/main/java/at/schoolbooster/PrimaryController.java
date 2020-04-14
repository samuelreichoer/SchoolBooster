package at.schoolbooster;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.TextAlignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PrimaryController {

    @FXML private TabPane tabContainer;
    @FXML private Tab timetableTab;
    @FXML private Tab checklistTab;
    @FXML private Tab datesTab;
    @FXML private double tabWidth = 50.0;

    public PrimaryController() {
    }

    @FXML
    private void initialize() throws FileNotFoundException {
        configureTabPane();
    }

    @FXML
    public void configureTabPane() throws FileNotFoundException {

        tabContainer.setTabMinWidth(tabWidth);
        tabContainer.setTabMaxWidth(tabWidth);
        tabContainer.setTabMinHeight(tabWidth);
        tabContainer.setTabMaxHeight(tabWidth);
        tabContainer.setRotateGraphic(true);

        String localDir = System.getProperty("user.dir");

        configureTab(timetableTab, "Stundenplan", new FileInputStream(localDir + "/src/main/resources/at/schoolbooster/img/tab_icon.png"));
        configureTab(checklistTab, "Checkliste", new FileInputStream(localDir + "/src/main/resources/at/schoolbooster/img/tab_icon.png"));
        configureTab(datesTab, "Termine", new FileInputStream(localDir + "/src/main/resources/at/schoolbooster/img/tab_icon.png"));
    }

    @FXML
    private void configureTab(Tab tab, String title, FileInputStream iconPath) {

        double imageWidth = 50.0;

        ImageView imageView = new ImageView(new Image(iconPath));
        imageView.setFitHeight(imageWidth);
        imageView.setFitWidth(imageWidth);

        tab.setText("");
        tab.setGraphic(imageView);
    }
}
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

public class PrimaryController {

    @FXML
    private TabPane tabContainer;

    @FXML
    private Tab timetableTab;

    @FXML
    private Tab checklistTab;

    @FXML
    private Tab datesTab;

    @FXML
    private double tabWidth = 90.0;
    @FXML
    public static int lastSelectedTabIndex = 0;

    public PrimaryController() {
    }

    @FXML
    private void initialize()
    {
    }

    @FXML
    public void configureTabPane() {
        tabContainer.setTabMinWidth(tabWidth);
        tabContainer.setTabMaxWidth(tabWidth);
        tabContainer.setTabMinHeight(tabWidth);
        tabContainer.setTabMaxHeight(tabWidth);
        tabContainer.setRotateGraphic(true);

        configureTab(timetableTab, "Stundenplan", "img/icon.png");
        configureTab(checklistTab, "Checkliste", "img/icon.png");
        configureTab(datesTab, "Termine", "img/icon.png");
    }

    @FXML
    private void configureTab(Tab tab, String title, String iconPath) {

        double imageWidth = 40.0;

        ImageView imageView = new ImageView(new Image(iconPath));
        imageView.setFitHeight(imageWidth);
        imageView.setFitWidth(imageWidth);

        Label label = new Label(title);
        label.setMaxWidth(tabWidth - 20);
        label.setPadding(new Insets(5, 0, 0, 0));
        label.setStyle("-fx-text-fill: black; -fx-font-size: 8pt; -fx-font-weight: normal;");
        label.setTextAlignment(TextAlignment.CENTER);

        BorderPane tabPane = new BorderPane();
        tabPane.setRotate(90.0);
        tabPane.setMaxWidth(tabWidth);
        tabPane.setCenter(imageView);
        tabPane.setBottom(label);

        tab.setText("");
        tab.setGraphic(tabPane);
    }
}

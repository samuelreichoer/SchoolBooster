module at.schoolbooster {
    requires javafx.controls;
    requires javafx.fxml;

    opens at.schoolbooster to javafx.fxml;
    exports at.schoolbooster;
}
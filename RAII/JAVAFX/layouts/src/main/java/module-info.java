module com.disenho {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.disenho to javafx.fxml;
    exports com.disenho;
}

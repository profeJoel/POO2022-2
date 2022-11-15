module com.grid {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.grid to javafx.fxml;
    exports com.grid;
}

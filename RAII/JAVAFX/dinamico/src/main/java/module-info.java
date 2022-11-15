module com.interaccion {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.interaccion to javafx.fxml;
    exports com.interaccion;
}

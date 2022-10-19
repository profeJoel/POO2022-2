package JAVAFX;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.button;


public class Interfaz1 extends Application{
    public static void main(String[] args){
        launch(args); // línea obligatoria para uso de JAVAFX
    }

    @Override
    public void start(Stage ventana) throws Exception{
        ventana.setTitle("Interfaz 1: Probando JavaFX");

        StackPane panel = new StackPane();

        Label texto1 = new Label("Hola Mundo!!!...");
        //Button boton = new Button("OK");

        panel.getChildren().add(texto1);

        Scene escena = new Scene(panel, 500, 500);
        ventana.setScene(escena);
        ventana.show();
    }
}

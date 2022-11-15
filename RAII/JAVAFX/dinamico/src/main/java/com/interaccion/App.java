package com.interaccion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene, escena1, escena2, escena3, escena4;
    private static boolean respuesta;
    
    @Override
    public void start(Stage stage) throws IOException {
        Button boton1, boton2, boton3, boton4;

        //Interfaz 1
        VBox box1 = new VBox();
        Label texto1 = new Label("Escena 1");
        boton1 = new Button();
        boton1.setText("Cambiar a Interfaz 2");
        boton1.setOnAction( e ->
            stage.setScene(escena2)
        );
        boton3 = new Button();
        boton3.setText("Cambiar a Interfaz 3");
        boton3.setOnAction( e ->
            stage.setScene(escena3)
        );
        boton4 = new Button();
        boton4.setText("Cambiar a Interfaz 4");
        boton4.setOnAction( e ->
            stage.setScene(escena4)
        );
        box1.getChildren().addAll(texto1, boton1, boton3, boton4);
        escena1 = new Scene(box1, 500, 500);

        //Interfaz 2
        HBox box2 = new HBox();
        Label texto2 = new Label("Escena 2");
        boton2 = new Button();
        //boton2.setText("Cambiar a Interfaz 1");
        boton2.setText("hacer invisible");
        boton2.setOnAction( e -> 
            //stage.setScene(escena1)
            box2.setVisible(false)
        );
        box2.getChildren().addAll(texto2, boton2);
        escena2 = new Scene(box2, 600, 300);
        

        //Interfaz 3
        VBox box3 = new VBox();
        Label texto3 = new Label("Nombre de Usuario");
        TextField entrada = new TextField();
        //entrada.setText("Ingrese su nombre");
        entrada.setPromptText("Ingrese su nombre");
        Button botonEmergente = new Button("Aceptar");
        botonEmergente.setOnAction( e -> {
            // Ventana Emergente
            Emergente.mostrar("Ventana Emergente", entrada.getText());
            entrada.setText("");
        });
        box3.getChildren().addAll(texto3, entrada, botonEmergente);
        escena3 = new Scene(box3, 400, 300);

        //Interfaz 4
        VBox box4 = new VBox();
        Label texto4 = new Label("Nombre de Usuario");
        TextField entrada4 = new TextField();
        //entrada.setText("Ingrese su nombre");
        entrada4.setPromptText("Ingrese su nombre");
        Label textoConfirmacion = new Label("");
        Button botonConfirmacion = new Button("Confirmar");
        botonConfirmacion.setOnAction( e -> {
            // Ventana Emergente
            respuesta = Emergente.confirmar("Ventana de Confirmación", entrada.getText());
            if(respuesta)
                textoConfirmacion.setText("Texto Confirmado");
            else
                textoConfirmacion.setText("Texto Rechazado");

            entrada.setText("");
        });
        box4.getChildren().addAll(texto4, entrada4, botonConfirmacion, textoConfirmacion);
        escena4 = new Scene(box4, 400, 300);

        //Configuración de la ventana
        stage.setTitle("Ejemplo intercambio de interfaces");
        stage.setScene(escena1);
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
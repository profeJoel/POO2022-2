package com.poo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
// Solamente para caso de implementar EventHandler
// public class App extends Application implements EventHandler<ActionEvent>{

    private static Scene scene;

    /** Interface 1 : Conociendo la estructura de JAVAFX
     * @Override
    public void start(Stage ventana) throws IOException {
        
        //scene = new Scene(loadFXML("primary"), 640, 480);
        //stage.setScene(scene);
        //stage.show();
        
        ventana.setTitle("Interfaz 1: Probando JavaFX");

        //StackPane panel = new StackPane();
        //VBox panel = new VBox();
        HBox panel = new HBox();

        Label texto1 = new Label("Hola Mundo!!!...");
        Button boton = new Button("OK");

        panel.getChildren().addAll(texto1, boton);

        scene = new Scene(panel, 500, 500);
        ventana.setScene(scene);
        ventana.show();

    }*/

    /**
     * Interface 2 : Capturando eventos
     
    @Override
    public void start(Stage ventana) throws IOException {
        ventana.setTitle("Interfaz 2: Eventos JavaFX");

        VBox panel = new VBox();

        Label texto1 = new Label("Texto Prueba");
        Button boton = new Button("OK");

        boton.setOnAction(
            new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event){
                    System.out.println("Apretó OK!!!");
                }
            }
        );

        panel.getChildren().addAll(texto1, boton);

        scene = new Scene(panel, 500, 500);
        ventana.setScene(scene);
        ventana.show();

    }
    */

    /**
     * Interface 3 : Capturando eventos con Interface EventHandler
     *
    Button botonSi, botonNo;

    @Override
    public void start(Stage ventana) throws IOException {
        ventana.setTitle("Interfaz 3: Eventos JavaFX");

        VBox panel = new VBox();

        Label texto1 = new Label("Texto Prueba");
        botonSi = new Button("SI");
        botonNo = new Button("NO");

        botonSi.setOnAction(this);
        botonNo.setOnAction(this);

        panel.getChildren().addAll(texto1, botonSi, botonNo);

        scene = new Scene(panel, 500, 500);
        ventana.setScene(scene);
        ventana.show();

    }

    @Override
    public void handle(ActionEvent event){
        if(event.getSource() == botonSi)
            System.out.println("Apretó SI!!!");
        if(event.getSource() == botonNo)
            System.out.println("Apretó NO!!!");
    }
    */

    /**
     * Interface 4 : Capturando eventos con Lambda Expression
     */
    @Override
    public void start(Stage ventana) throws IOException {
        ventana.setTitle("Interfaz 4: Eventos JavaFX");

        VBox panel = new VBox();

        Label texto1 = new Label("Texto Prueba");
        Button botonSi = new Button("Si");

        botonSi.setOnAction( e -> {
            System.out.println("Apretó SI!!!");
            //System.out.println("Eventos con multiples líneas\n");
        });

        Button botonNo = new Button("No");

        botonNo.setOnAction( e -> {
            System.out.println("Apretó NO!!!");
            //System.out.println("Eventos con multiples líneas\n");
        });

        panel.getChildren().addAll(texto1, botonSi, botonNo);

        scene = new Scene(panel, 500, 500);
        ventana.setScene(scene);
        ventana.show();

    }

    /*
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    */

    public static void main(String[] args) {
        launch();
    }

}
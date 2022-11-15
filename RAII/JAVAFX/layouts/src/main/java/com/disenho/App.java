package com.disenho;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Stage ventana = stage;
        
        ventana.setTitle("Probando Layouts");
        BorderPane panel = new BorderPane();

        //Menu Superior
        HBox menuSuperior = new HBox();
        Button superA = new Button("A");
        Button superB = new Button("B");
        Button superC = new Button("C");
        menuSuperior.getChildren().addAll(superA, superB, superC);


        //Menu Inferior
        HBox menuInferior = new HBox();
        Button superD = new Button("D");
        Button superE = new Button("E");
        Button superF = new Button("F");
        menuInferior.getChildren().addAll(superD, superE, superF);
        
        
        //Menu Izquierda
        VBox menuIzquierda = new VBox();
        Button IA = new Button("IA");
        Button IB = new Button("IB");
        Button IC = new Button("IC");
        menuIzquierda.getChildren().addAll(IA, IB, IC);

        
        //Menu Derecha
        VBox menuDerecha = new VBox();
        menuDerecha.setAlignment(Pos.CENTER_RIGHT);
        Button DA = new Button("DA");
        Button DB = new Button("DB");
        Button DC = new Button("DC");
        menuDerecha.getChildren().addAll(DA, DB, DC);
        
        
        //Menu Central
        VBox menuCentral = new VBox();
        menuCentral.setAlignment(Pos.CENTER);
        Button CA = new Button("CA");
        Button CB = new Button("CB");
        Button CC = new Button("CC");
        menuCentral.getChildren().addAll(CA, CB, CC);

        // Asignación de parte del panel
        panel.setTop(menuSuperior);
        panel.setLeft(menuIzquierda);
        panel.setCenter(menuCentral);
        panel.setRight(menuDerecha);
        panel.setBottom(menuInferior);
        

        scene = new Scene(panel,500,500);
        //scene = new Scene(menuSuperior,500,500);
        ventana.setScene(scene);
        ventana.show();
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
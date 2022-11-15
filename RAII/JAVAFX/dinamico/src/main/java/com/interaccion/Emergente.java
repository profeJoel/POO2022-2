package com.interaccion;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Emergente {
    public static boolean respuesta = false;

    public static void mostrar(String titulo, String mensaje){
        Stage ventanaEmergente = new Stage();

        ventanaEmergente.initModality(Modality.APPLICATION_MODAL);
        ventanaEmergente.setTitle(titulo);
        ventanaEmergente.setMinWidth(250);

        Label texto = new Label("Hola: " + mensaje);
        Button botonCerrar = new Button("Cerrar");
        botonCerrar.setOnAction( e -> ventanaEmergente.close() );
        
        VBox box = new VBox();
        box.getChildren().addAll(texto, botonCerrar);
        box.setAlignment(Pos.CENTER);

        Scene escena = new Scene(box);
        ventanaEmergente.setScene(escena);
        ventanaEmergente.showAndWait();
    }

    public static boolean confirmar(String titulo, String mensaje){
        Stage ventanaEmergente = new Stage();

        ventanaEmergente.initModality(Modality.APPLICATION_MODAL);
        ventanaEmergente.setTitle(titulo);
        ventanaEmergente.setMinWidth(250);

        Label texto = new Label("Hola: " + mensaje);
        Button botonAceptar = new Button("Aceptar");
        Button botonCancelar = new Button("Cancelar");

        botonAceptar.setOnAction( e -> {
            respuesta = true;
            ventanaEmergente.close();
        });
        botonCancelar.setOnAction( e -> {
            respuesta = false;
            ventanaEmergente.close();
        });

        HBox boxBotones = new HBox();
        boxBotones.getChildren().addAll(botonAceptar, botonCancelar);
        
        VBox box = new VBox();
        box.getChildren().addAll(texto, boxBotones);
        box.setAlignment(Pos.CENTER);

        Scene escena = new Scene(box);
        ventanaEmergente.setScene(escena);
        ventanaEmergente.showAndWait();

        return respuesta;
    }
}

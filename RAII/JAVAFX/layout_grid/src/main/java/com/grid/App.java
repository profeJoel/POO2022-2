package com.grid;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene, scene2;
    private static Label textoFinal;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Programado GridPane");

        GridPane panel = new GridPane();
        panel.setPadding(new Insets(10, 10, 10, 10));
        panel.setVgap(4); // 4 filas
        panel.setHgap(2); // 2 columnas

        Label bienvenida = new Label("Bienvenidos a la interfaz de usuario");
        GridPane.setConstraints(bienvenida, 0, 0);


        Label textoUsuario = new Label("Nombre Usuario:");
        TextField entradaUsuario = new TextField();
        entradaUsuario.setPromptText("Nombre Usuario");
        GridPane.setConstraints(textoUsuario, 0, 1);
        GridPane.setConstraints(entradaUsuario, 1, 1);

        Label textoPWD = new Label("Password Usuario:");
        PasswordField entradaPWD = new PasswordField();
        entradaPWD.setPromptText("Password Usuario");
        GridPane.setConstraints(textoPWD, 0, 2);
        GridPane.setConstraints(entradaPWD, 1, 2);

        VBox box = new VBox();
        textoFinal = new Label("Usuario Ingresado...");
        box.getChildren().add(textoFinal);
        scene2 = new Scene(box, 500, 500);

        Button boton = new Button("Ingresar");
        boton.setOnAction( e -> {
            //Recuperar la contraseña original del usuario es un procedimiento aparte
            String pwdOriginal = "123456"; // Se puede realizar en un ciclo.

            if(entradaPWD.getText().equals(pwdOriginal))
                textoFinal.setText("Usuario " + entradaUsuario.getText() + " Ingresado...");
            else
                textoFinal.setText("Ingreso Denegado! :(");

            stage.setScene(scene2);
        });
        GridPane.setConstraints(boton, 1, 3);

        panel.getChildren().addAll(bienvenida, textoUsuario, entradaUsuario, textoPWD, entradaPWD, boton);
        //Configuración de Ventana
        scene = new Scene(panel, 500, 500);
        stage.setScene(scene);
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
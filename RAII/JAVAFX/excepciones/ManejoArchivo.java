import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class ManejoArchivo{
    public static void main(String[] args){
        int a, b;

        try{
            File archivo = new File("archivo.txt");
            Scanner lector =  new Scanner(archivo);
            System.out.println(lector.nextLine());
            lector.close();

            // true - permite escribir al final del texto
            // false - indica sobreescritura
            FileWriter escritor = new FileWriter("archivo.txt", false);
            escritor.write("Esta es la nueva linea");
            escritor.append("Una nueva línea al final");
            escritor.close();
        }catch(Exception e){
            System.out.println("El archivo no existe");
            e.printStackTrace();
        }
    }
}
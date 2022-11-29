import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class LeerCSV{
    public static void main(String[] args){
        Persona nueva;
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

        String[] palabras;
        String linea;
        boolean esPrimero = true;
        try{
            File archivo = new File("datosPersonas.csv");
            Scanner lector =  new Scanner(archivo);
            
            while(lector.hasNext()){
                if(esPrimero){
                    linea = lector.nextLine();    
                    esPrimero = false;
                }
                else{
                    linea = lector.nextLine();
                    //System.out.println(linea);
                    palabras = linea.split(",");
                    //System.out.println("El nombre es: " + palabras[1]);

                    nueva = new Persona(Integer.parseInt( palabras[0]), palabras[1], palabras[2], palabras[3]);

                    listaPersonas.add(nueva);
                }
            }

            System.out.print("La lista tiene " + listaPersonas.size() + " Personas");

            for (Persona p : listaPersonas) {
                System.out.println(">>> " + p.nombre);
            }
            lector.close();

        }catch(Exception e){
            System.out.println("El archivo no existe");
            e.printStackTrace();
        }
    }
}
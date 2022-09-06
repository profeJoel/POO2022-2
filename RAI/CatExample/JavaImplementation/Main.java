import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        Cat oscar = new Cat("Oscar", "Macho", 7, 5, "naranjo", "Rayado");

        //System.out.println("Existe el objeto: " + oscar.name);
        oscar.meow();
        
        
        System.out.println("El color de: " + oscar.getName() + " es " + oscar.getColor());

        //oscar.color = "verde";
        //oscar.setColor("verde");
        System.out.println("Ingrese un nuevo color para el gato: ");
        String nuevoColor = lector.next();
        System.out.println("Nuevo color es : " + nuevoColor);
        oscar.setColor(nuevoColor);
        
        System.out.println("El color de: " + oscar.getName() + " es " + oscar.getColor());
    
    }
}
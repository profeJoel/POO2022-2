import java.util.Date;

public class Persona {
    public int id;
    public String nombre;
    public String apellido;
    public String fechaNacimiento;
    
    public Persona(int id, String nombre, String apellido, String fechaNacimiento){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
}

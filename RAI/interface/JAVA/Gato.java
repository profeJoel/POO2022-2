package JAVA;
public class Gato implements Animal{
    private String nombre;

    public Gato(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void makeSound(){
        System.out.println(this.nombre + " Maulla...");
    }
    @Override
    public void come(){
        System.out.println(this.nombre + " come...");
    }
    @Override
    public void duerme(){
        System.out.println(this.nombre + " esta duermiendo...");
    }

    public void ronrronea(){
        System.out.println(this.nombre + " Ronrronea...");
    }
}
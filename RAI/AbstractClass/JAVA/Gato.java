public class Gato extends Animal{
    private String nombre;

    public Gato(String nombre){
        this.nombre = nombre;
    }

    public void makeSound(){
        System.out.println(this.nombre + " Maulla...");
    }

    public void ronrronea(){
        System.out.println(this.nombre + " Ronrronea...");
    }
}
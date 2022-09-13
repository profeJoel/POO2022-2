public class Cat extends Animal{
    private String pelaje;
    private String formaOjos;
    private int capacidadSalto;

    public Cat(String nombre, String especie, String raza, String pelaje, String formaOjos, int capacidadSalto){
        super(nombre,especie,raza);
        this.pelaje = pelaje;
        this.formaOjos = formaOjos;
        this.capacidadSalto = capacidadSalto;
    }

    public void ronrronea(){
        System.out.println("El gato " + this.name + "hace purrrrrrrrrrrrr...");
    }

    public void makeSound(){
        System.out.println("El gato " + this.name + " hace miauuuu...");
    }
}
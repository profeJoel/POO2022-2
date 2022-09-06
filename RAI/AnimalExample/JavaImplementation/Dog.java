public class Dog extends Animal{
    private int size;
    private String pelaje;

    public Dog(String name, String specie, String breed, int size, String pelaje){
        super(name, specie, breed);
        this.size = size;
        this.pelaje = pelaje;
    }

    public void muerde(){
        System.out.println("El perro " + this.name + " muerde fuerte!!!");
    }
}
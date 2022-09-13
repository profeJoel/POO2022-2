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

    public void makeSound(){
        System.out.println("El perro " + this.name + " hace guauuu!!...");
    }
    
    public void eat(){
        System.out.println("El perro " + this.name + " come...");
    }
    public void eat(String food){
        System.out.println("El perro " + this.name + " come " + food);
    }

    @Override
    public String toString(){
        return "Este perro se llama " + this.name + " de raza " + this.breed;
    }
}
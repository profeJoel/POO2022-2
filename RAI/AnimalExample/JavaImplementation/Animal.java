public class Animal{
    protected String name;
    protected String specie;
    protected String breed;

    public Animal(String name, String specie, String breed){
        this.name = name;
        this.specie = specie;
        this.breed = breed;
    }

    public String getName(){
        return this.name;
    }

    public String getSpecie(){
        return this.specie;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSpecie(String specie){
        this.specie = specie;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void makeSound(){
        System.out.println("El animal " + this.name + " hace un sonido...");
    }

    public String toString(){
        return "El animal se llama " + this.name + " de especie " + this.specie + " y de la raza " + this.breed;
    }
}
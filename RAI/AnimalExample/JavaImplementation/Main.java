public class Main{
    public static void main(String[] args){
        Animal oscar = new Animal("Oscar", "Gato", "Angora");
        System.out.println(oscar.toString());
        oscar.makeSound();

        Cat peluza = new Cat("Peluza", "Gato", "Romano", "Blanco", "verdes", 2);

        peluza.ronrronea();
        peluza.makeSound();
        System.out.println(peluza.toString());
        System.out.println(peluza);

        Dog rocky = new Dog("Rocky", "Perro", "Chiguagua", 20, "marron");
        rocky.muerde();
        rocky.makeSound();
        rocky.eat();
        rocky.eat("carne");
        System.out.println(rocky.toString());
        System.out.println(rocky);

    }
}
package JAVA;
public class Main{
    public static void main(String[] args){
        //No se puede instanciar una clase abstracta
        //Animal ameba = new Animal();

        Gato tom = new Gato("Tom");
        //tom.duerme();
        tom.makeSound();

        Animal aux = tom;

        aux.makeSound();
        //aux.duerme();
        //aux.ronrronea();
        tom.ronrronea();
    }
}
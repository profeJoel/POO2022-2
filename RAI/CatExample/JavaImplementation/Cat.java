class Cat{
    //Atributos
    String name;
    String sex;
    int age;
    int weight;
    String color;
    String textura;

    //Métodos
    public Cat(String nombre, String sex, int age, int weight, String color, String textura){
        this.name = nombre;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.textura = textura;
    }

    void meow(){
        System.out.println(this.name + " hace MEOWWWW!!!");
    }
}
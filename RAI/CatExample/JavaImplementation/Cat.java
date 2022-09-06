public class Cat{
    //Atributos
    private String name;
    private String sex;
    private int age;
    private int weight;
    private String color;
    private String textura;

    //Métodos
    public Cat(String nombre, String sex, int age, int weight, String color, String textura){
        this.name = nombre;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.textura = textura;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String nuevoColor){
        String[] coloresValidos = {"blanco","marron","naranja","negro","gris"};
        if(colorEsValido(coloresValidos, nuevoColor)){
            this.color = nuevoColor;
        }
    }

    private boolean colorEsValido(String[] colores, String nuevoColor){
        for(String color:colores){
            System.out.println("color: " +color+ " y nuevoColor: " + nuevoColor);
            if(color.compareTo(nuevoColor)==0){
                return true;
            }
        }
        return false;
    }

    public void meow(){
        System.out.println(this.name + " hace MEOWWWW!!!");
    }
}
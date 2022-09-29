public class Main{
    public static void main(String[] args){
        SerVivo perro = (comida) -> ("El perro se come : " + comida); //Operacion Lambda ()->()
        implementarMetodoAbstracto(perro, "Croquetas de perro");
    }

    public static void implementarMetodoAbstracto(SerVivo a, String comida){
        String nuevoString = a.come(comida);
        System.out.println("Atencion!!: " + nuevoString);
    }
}
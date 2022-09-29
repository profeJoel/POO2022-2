public class Main{
    public static void main(String[] args){
        Exterior miObjeto = new Exterior("Estoy dando clases en el TIC 4");
        Exterior.Coordenada A = miObjeto.new Coordenada(0,0);

        System.out.println("miObjeto es: " + miObjeto.mensaje);
        System.out.println("punto A es: [" + A.x + "," + A.y + "]");
    }
}
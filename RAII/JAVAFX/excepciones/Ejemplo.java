import java.util.Scanner;

public class Ejemplo{
    public static void main(String[] args){
        int a, b;
        Scanner lector =  new Scanner(System.in);

        a = lector.nextInt();
        b = lector.nextInt();

        try{
            System.out.println("La operación es " + (a/b));
        }catch(Exception e){
            System.out.println("La operación no se puede realizar");
            System.out.println(e);
        }finally{
            System.out.println("SI se realizó la excepciónj");
        }
    }
}
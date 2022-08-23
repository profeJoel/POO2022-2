import java.util.Scanner;

public class Potencia{
  static int potencia(int b, int e){
    int pot = 1;
    for(;e>0; e--)
      //pot=pot*b;
      pot *= b;
    return pot;
  }

  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    int b, e;
    System.out.println("Ingrese la base");
    b = Integer.parseInt(lector.next());
    System.out.println("Ingrese el exponente");;
    e = Integer.parseInt(lector.next());

    System.out.println("Base: " + b + ", Exponente: " + e);

    System.out.println("Resultado: " + potencia(b,e));

  }
}
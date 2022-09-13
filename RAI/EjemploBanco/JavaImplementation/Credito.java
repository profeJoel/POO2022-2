public class Credito extends Producto{
    private double interes;
    private int monto;
    private int cuotas;

    public Credito(int id, double interes, int monto, int cuotas){
        super(id);
        this.interes = interes;
        this.monto = monto;
        this.cuotas = cuotas;
    }

    public String toString(){
        return super.toString() + "Credito: " + this.monto + " (" +this.interes + " en " + this.cuotas + ")";
    }
}
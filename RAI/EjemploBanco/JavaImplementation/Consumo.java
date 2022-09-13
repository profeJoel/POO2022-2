public class Consumo extends Credito{
    private double morasidad;

    public Consumo(int id, double interes, int monto, int cuotas, double morasidad){
        super(id, interes, monto, cuotas);
        this.morasidad = morasidad;
    }


    public String toString(){
        return super.toString() + "Morosidad: " + this.morasidad;
    }
}
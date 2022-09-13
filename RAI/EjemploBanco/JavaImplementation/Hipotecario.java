public class Hipotecario extends Credito{
    private String propiedad;

    public Hipotecario(int id, double interes, int monto, int cuotas, String propiedad){
        super(id, interes, monto, cuotas);
        this.propiedad = propiedad;
    }
    
    public String toString(){
        return super.toString() + "Propiedad: " + this.propiedad;
    }
}
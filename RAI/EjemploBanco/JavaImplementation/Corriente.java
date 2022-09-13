public class Corriente extends Cuenta{
    private int cupoTarjeta;

    public Corriente(int id, int saldo, int cupoTarjeta){
        super(id,saldo);
        this.cupoTarjeta = cupoTarjeta;
    }

    public int getCupoTarjeta(){
        return this.cupoTarjeta;
    }
    
    public String toString(){
        return super.toString() + "cupo: " + this.cupoTarjeta + " ";
    }
}